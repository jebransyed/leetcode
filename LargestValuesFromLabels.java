class Solution {
    public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1]-a[1]);
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<labels.length; i++) {
            pq.add(new int[]{labels[i], values[i]});
            hm.put(labels[i], 0);
        }
        int result = 0;
        int count = 0;
        while(!pq.isEmpty() && count < numWanted) {
            int[] nums = pq.poll();
            if(hm.get(nums[0])<useLimit) {
                result += nums[1];
                hm.put(nums[0], hm.get(nums[0])+1);
                count++;
            }
        }
        return result;
    }
}
