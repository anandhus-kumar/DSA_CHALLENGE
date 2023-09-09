import java.util.HashMap;

public class TwoSum {

    public static int[] findNum(int[] a, int n, int k) {
        // brute force approach

        // int[] ans = new int[2];
        // ans[0] = -1;
        // ans[1] = -1;
        // for (int i = 0; i < n; i++) {
        // for (int j = i + 1; j < n; j++) {
        // if (a[i] + a[j] == k) {
        // ans[0] = i;
        // ans[1] = j;
        // }
        // }

        // }
        // return ans;

        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int moreNeeded = k - num;
            if (mpp.containsKey(moreNeeded)) {
                ans[0] = mpp.get(moreNeeded);
                ans[1] = i;
                return ans;
            }

            mpp.put(arr[i], i);
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] array = { 3, 5, 6, 1, 2, 9 };
        int n = 6;
        int k = 14;
        int[] ans = findNum(array, n, k);

        System.out.println(ans[0] + " ," + ans[1]);
    }

}
