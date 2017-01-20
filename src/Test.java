import java.math.BigDecimal;
import java.util.HashMap;

/**
 * Created by sombra-39 on 20.01.17.
 */
public class Test {
    static HashMap<Integer, BigDecimal> set = new HashMap<>();

    static BigDecimal myFunc(int n){
        if(n <= 0) return BigDecimal.ZERO;
        if(n == 1) return BigDecimal.ONE;

        if(set.containsKey(n)) return set.get(n);

        BigDecimal x = myFunc(n-1).add(myFunc(n-2)).add(myFunc(n-3)).add(myFunc(n-4)).add(myFunc(n-5)).add(myFunc(n-6));

        set.put(n , x);

        return x;
    }

    public static void main(String[] args) {
        System.out.println(myFunc(610));
    }
}
