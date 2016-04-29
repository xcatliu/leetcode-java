public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0, length = nums.length; i < length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                ret[0] = hashMap.get(target - nums[i]);
                ret[1] = i;
                break;
            }
            hashMap.put(nums[i], i);
        }
        return ret;
    }
}
