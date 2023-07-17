class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num:nums) {
            sum+=num;
        }
        if(sum%2==1) {
            return false;
        }
        sum/=2;
        boolean[][] dp = new boolean[nums.length+1][sum+1];
        for(int i=1; i<dp.length; i++) {
            for(int j=0; j<dp[0].length; j++) {
                if(nums[i-1] == j) {
                    dp[i][j] = true;
                } else if(nums[i-1] > j) {
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
                }
            }
        }
        return dp[nums.length][sum];
    }

}
