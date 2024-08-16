import java.util.Arrays;

static class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }
}


public void main() {
    Solution1 solution = new Solution1();

    int[] nums = {2, 7, 11, 15};
    int target = 9;

    int[] result = solution.twoSum(nums, target);

    System.out.println(Arrays.toString(result));
}

