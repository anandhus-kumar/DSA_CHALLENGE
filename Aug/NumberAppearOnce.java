public class NumberAppearOnce {
    // brute force approach

    public int singleNumber(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int cnt = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == num) {
                    cnt++;
                }
            }
            if (cnt == 1)
                return num;
        }

        return -1;

    }

    // USING HASHING METHOD

    public int singleNumber(int[] nums) {
        int n = nums.length;
        int hash[] = new int[n + 1];

        for (int i = 0; i < n; i++) {
            hash[nums[i]] = hash[nums[i]] + 1;
        }

        for (int i = 0; i < hash.length; i++) {
            if (hash[i] == 1)
                return i;
        }
        return -1;
    }

}

    // USING XOR METHOD

    public int singleNumber(int[] nums) {
        int xorr = 0;
        for (int i = 0; i < nums.length; i++) {
            xorr = xorr ^ nums[i];
        }
        return xorr;
    }

}

}}
