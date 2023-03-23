import java.math.BigInteger;

class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<BigInteger> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(String num:nums) {
            pq.add(new BigInteger(num));
        }

        for(int i=0; i<k-1; i++) {
            pq.poll();
        }

        return String.valueOf(pq.poll());
    }
}
