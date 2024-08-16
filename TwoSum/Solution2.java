import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public static class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            numMap.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++ ) {
            int complement = target - nums[i];

            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[]{i, numMap.get(complement)};
            }
        }

        return null;
    }
}

public void main() {
    Solution2 solution = new Solution2();

    int[] nums = {2, 7, 11, 15};
    int target = 9;

    int[] result = solution.twoSum(nums, target);

    System.out.println(Arrays.toString(result));
}

