class Solution {

    public int numDecodings(String s) {
        if(s.charAt(0) == '0') {
            return 0;
        }

        int[] result = new int[s.length() + 1];
        result[0] = 1;
        result[1] = 1;

        for(int i=1; i<s.length(); i++) {
            int num1 = Integer.parseInt("" + s.charAt(i));
            if(num1 > 0) {
                result[i+1] += result[i];
            }
            int num2 = Integer.parseInt("" + s.charAt(i-1) + s.charAt(i));
            if(num2>=10 && num2<=26) {
                result[i+1] += result[i-1];
            }
        }
        return result[s.length()];
    }
}
