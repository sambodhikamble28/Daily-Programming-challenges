import java.util.*;

public class demo {
    static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;  
    }

    public static void main(String[] args) {
        long N = 4, M = 6;
        System.out.println(lcm(N, M)); 
    }
}
