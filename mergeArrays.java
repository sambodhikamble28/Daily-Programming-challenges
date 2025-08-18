import java.util.*;

public class mergeArrays {
    public static void merge(int[] arr1, int[] arr2, int m, int n) {
       
        for (int i = 0; i < m; i++) {
            if (arr1[i] > arr2[0]) {
               
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
                int first = arr2[0];
                int k;
                for (k = 1; k < n && arr2[k] < first; k++) {
                    arr2[k - 1] = arr2[k];
                }
                arr2[k - 1] = first;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter size of arr1: ");
        int m = sc.nextInt();
        int[] arr1 = new int[m];
        System.out.println("Enter elements of arr1 (sorted): ");
        for (int i = 0; i < m; i++) arr1[i] = sc.nextInt();

       
        System.out.print("Enter size of arr2: ");
        int n = sc.nextInt();
        int[] arr2 = new int[n];
        System.out.println("Enter elements of arr2 (sorted): ");
        for (int i = 0; i < n; i++) arr2[i] = sc.nextInt();

        merge(arr1, arr2, m, n);

        
        System.out.println("arr1 after merge: " + Arrays.toString(arr1));
        System.out.println("arr2 after merge: " + Arrays.toString(arr2));

        sc.close();
    }
}
