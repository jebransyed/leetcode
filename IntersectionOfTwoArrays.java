class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        for(int num:nums1) {
            hs1.add(num);
        }

        // Store matching values in another Hash Set
        HashSet<Integer> hs2 = new HashSet<>();
        for(int num:nums2) {
            if(hs1.contains(num)) {
                hs2.add(num);
            }
        }

        // Create array to store result
        int[] result = new int[hs2.size()];
        int i=0;
        for(int num:hs2) {
            result[i++] = num;
        }
        return result;
    }
}
