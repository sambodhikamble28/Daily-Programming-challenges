import java.util.*;

public class ZeroSumSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<int[]> result = findZeroSumSubarrays(arr);

        if (result.isEmpty()) {
            System.out.println("No subarrays found.");
        } else {
            System.out.println("Subarrays with zero sum:");
            for (int[] pair : result) {
                System.out.println("(" + pair[0] + ", " + pair[1] + ")");
            }
        }

        sc.close();
    }

    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        List<int[]> res = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        int prefixSum = 0;

        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (map.containsKey(prefixSum)) {
                for (int start : map.get(prefixSum)) {
                    res.add(new int[]{start + 1, i});
                }
            }

            map.putIfAbsent(prefixSum, new ArrayList<>());
            map.get(prefixSum).add(i);
        }

        return res;
    }
}