import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public static class Solution3 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return null;
    }
}

public void main() {
    Solution3 solution = new Solution3();

    int[] nums = {2, 7, 11, 15};
    int target = 9;

    int[] result = solution.twoSum(nums, target);

    System.out.println(Arrays.toString(result));
}

