// // array union by using set

import java.util.*;

// public class ArrayUnion {
// static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
// HashSet<Integer> s = new HashSet<>();
// ArrayList<Integer> Union = new ArrayList<>();
// for (int i = 0; i < n; i++) {
// s.add(arr1[i]);
// }

// for (int i = 0; i < m; i++) {
// s.add(arr2[i]);
// }

// for (int it : s)
// Union.add(it);
// return Union;

// }

// public static void main(String args[]) {
// int n = 10, m = 7;
// int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

// int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };
// ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);
// for (int val : Union)
// System.out.print(val + " ");
// }

// }

public class ArrayUnion {

    static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {

        int i = 0, j = 0;
        ArrayList<Integer> Union = new ArrayList<>();

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            } else {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j])
                    Union.add(arr2[j]);
                j++;

            }
        }

        while (i < n) {
            if (Union.get(Union.size() - 1) != arr1[i])
                Union.add(arr1[i]);
            i++;

        }

        while (j < m) {
            if (Union.get(Union.size() - 1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }

        return Union;
    }

    public static void main(String args[]) {
        int n = 10, m = 7;
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };
        ArrayList<Integer> Union = findUnion(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val : Union)
            System.out.print(val + " ");
    }

}
