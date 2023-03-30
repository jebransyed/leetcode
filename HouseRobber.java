class Solution {
    public int rob(int[] nums) {
        int[] result = new int[nums.length + 1];
        result[0] = 0;
        result[1] = nums[0];

        for(int i=2; i<result.length; i++) {
            result[i] = Math.max(result[i-2] + nums[i-1], result[i-1]);
        }
        return result[nums.length];
    }
}
