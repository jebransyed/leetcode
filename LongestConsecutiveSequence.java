class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int num:nums) {
            hs.add(num);
        }
        int max = 0;
        for(int i=0; i<nums.length; i++) {
            if(hs.contains(nums[i]-1)) {
                continue;
            }
            int seq = getSequenceLength(nums[i], hs);
            max = Math.max(max, seq);
        }
        return max;
    }

    private int getSequenceLength(int num, HashSet<Integer> hs) {
        int count = 0;
        while(hs.contains(num)) {
            count++;
            num++;
        }
        return count;
    }

}
