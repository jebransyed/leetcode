class Solution {
    public int minAddToMakeValid(String s) {
        int result = 0;
        Stack<Character> stack = new Stack<>();
        char[] ch = s.toCharArray();
        for(char c:ch) {
            if(c == '(') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    result++;
                } else {
                    stack.pop();
                }
            }
        }
        result += stack.size();
        return result;
    } 
}
