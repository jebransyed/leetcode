class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i=1; i<strs.length; i++) {
            prefix = getCommonPrefix(prefix, strs[i]);
            if(prefix.length() == 0) {
                break;
            }
        }
        return prefix;
    }

    private String getCommonPrefix(String s1, String s2) {
        StringBuilder sb = new StringBuilder("");
        int min = Math.min(s1.length(), s2.length());
        for(int i=0; i<min; i++) {
            if(s1.charAt(i) == s2.charAt(i)) {
                sb.append(s1.charAt(i));
            } else {
                break;
            }
        }
        return sb.toString();
    }
}
