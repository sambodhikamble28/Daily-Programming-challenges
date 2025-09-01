import java.util.*;

public class DivisorCount {
    public static void main(String[] args) {
        int N = 12;  
        System.out.println(countDivisors(N));
    }

    public static int countDivisors(int N) {
        int count = 0;
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                if (i == N / i) {
                    count++;  
                } else {
                    count += 2; 
                }
            }
        }
        return count;
    }
}
