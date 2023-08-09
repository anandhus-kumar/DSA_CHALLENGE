import java.util.*;

public class ArrayIntersection {

    public static int[] intersection(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> inter = new HashSet<>();
        for (int i = 0; i < m; i++) {
            inter.add(arr1[i]);
        }

        for (int num : arr2) {
            if (inter.contains(num)) {
                result.add(num);

            }
        }
        return listToArray(result);
    }

    private static int[] listToArray(ArrayList<Integer> list) {

        int[] result = new int[list.size()];
        int index = 0;

        for (int num : list) {
            result[index++] = num;
        }
        return result;
    }

    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int b[] = { 1, 2, 9 };

        int result[] = intersection(a, b);

        for (int num : result)
            System.out.print(num + " ");
    }

}
