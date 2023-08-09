// array rotation by k places to the right/left by reversal algorithm 

import java.util.*;

public class ArrayRotationK {
    public static void Reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void RotateRight(int[] arr, int n, int k) {
        Reverse(arr, 0, n - k - 1);
        Reverse(arr, n - k, n - 1);
        Reverse(arr, 0, n - 1);
    }

    public static void RotateLeft(int arr[], int n, int k) {
        Reverse(arr, 0, k - 1);
        Reverse(arr, k, n - 1);
        Reverse(arr, 0, n - 1);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = 7;
        int k = 2;

        Scanner sc = new Scanner(System.in);
        System.out.println("1.Leftrotate /n 2.RightRotate");
        System.out.println("Enter 1 or 2");
        int choice = sc.nextInt();

        if (choice == 1) {
            RotateLeft(arr, n, k);
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        } else if (choice == 2) {
            RotateRight(arr, n, k);
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}