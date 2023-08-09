public class MoveZeroToEnd {
    public static void moveZero(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[i] = num;
                i++;
            }

        }
        for (int j = i; j < nums.length; j++) {
            nums[j] = 0;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 0, 4, 9, 0, 2, 0, 4, 6, 9, 0 };
        moveZero(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }

    }
}