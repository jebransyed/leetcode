class Solution {
    public void reverseString(char[] s) {
        // Traverse the array using two pointers
        for (int i=0,j=s.length-1; i<j; i++,j--) {
            // Swap characters
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
