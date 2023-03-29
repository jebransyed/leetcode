class Solution {
    public int climbStairs(int n) {
        if(n<=2) {
            return n;
        }

        int result=0, prev=1, curr=2;
        for(int count=3; count<=n; count++) {
            result = prev+curr;
            prev=curr;
            curr=result;
        }
        return result;
    }
}
