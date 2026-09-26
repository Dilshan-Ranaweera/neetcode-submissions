class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> values = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            values.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i ++){
            if(values.containsKey(target - nums[i]) && values.get(target - nums[i]) != i) {
                return new int[]{i, values.get(target - nums[i])};
            }
        }
        

        return new int[]{-1,-1};
    }
}
