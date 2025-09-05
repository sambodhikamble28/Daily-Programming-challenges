import java.util.*;

public class FirstElementRepeatKTimes {
    public static int firstElementToRepeatKTimes(int[] arr, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);

                if (freq.get(num) == k) {
                return num;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 4, 5, 2, 6, 1, 4};
        int k = 2;

        int result = firstElementToRepeatKTimes(arr, k);
        System.out.println(result); 
    }
}
