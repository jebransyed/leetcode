class Solution {
    private List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        result.add(new ArrayList<Integer>());
        subsets(nums, 0, new ArrayList<Integer>());
        return result;
    }

    private void subsets(int[] nums, int index, List<Integer> list) {
        if(index >= nums.length) {
            return;
        } else {
            List<Integer> list1 = new ArrayList<Integer>(list);
            list1.add(nums[index]);
            result.add(list1);
            subsets(nums, index+1, list);
            subsets(nums, index+1, list1);
        }
    }
}
