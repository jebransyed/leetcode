class Solution {
    public String getSmallestString(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(k==0) {
                sb.append(ch);
            } else {
                int val = Math.min(ch - 'a', 'z' - ch + 1);
                if(val <= k) {
                    sb.append('a');
                    k = k- val;
                } else {
                    ch = (char)(ch - k);
                    k=0;
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}
