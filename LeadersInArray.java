import java.util.Scanner;

public class LeadersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int leaders[] = new int[n];  
        int count = 0;              

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxFromRight = arr[n - 1];
        leaders[count++] = maxFromRight;  

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                leaders[count++] = arr[i];
            }
        }

        System.out.print("Leaders: ");
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(leaders[i] + " ");
        }

        sc.close();
    }
}
