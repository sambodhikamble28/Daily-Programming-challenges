import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array (n-1): ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int n = size + 1;
        int total = n * (n + 1) / 2;  
        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum += arr[i];   
        }

        int missing = total - sum;
        System.out.println("Missing number is: " + missing);

        sc.close();
    }
}
