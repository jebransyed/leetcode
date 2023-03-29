class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        for(int i=0; i<s.length(); i++) {
            int index = s.charAt(i) - 'a';
            count[index] += 1;
        }

        for(int i=0; i<s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if(count[index] == 1) {
                return i;
            }
        }
        return -1;
    }
}
