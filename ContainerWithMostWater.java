class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        int i=0, j=height.length - 1;
        while(i<j) {
            int length = Math.min(height[i], height[j]);
            int breadth = j-i;
            int area = length * breadth;
            result = Math.max(result, area);
            if(height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return result;
    }
}
