import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                int[] l = {i, map.get(target - nums[i])};
                return l;
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("404 no solution found");
    }
}
