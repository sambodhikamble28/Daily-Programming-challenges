import java.util.*;

public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] arr, int k) {
        if(arr == null || k <= 0) return new int[0];
        
        int n = arr.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>(); 
        
        for(int i = 0; i < n; i++) {
            while(!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            
            
            while(!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
             if(i >= k - 1) {
                result[i - k + 1] = arr[deque.peekFirst()];
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] res = maxSlidingWindow(arr, k);
        System.out.println(Arrays.toString(res));
    }
}
