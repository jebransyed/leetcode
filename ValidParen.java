class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character c:s.toCharArray()) {
            if(isOpenBracket(c)) {
                stack.push(c);
            } else {
                if(stack.empty()) {
                    return false;
                }
                if(stack.pop() != getOpenBracket(c)) {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    private Character getOpenBracket(Character c) {
        switch(c) {
            case ')':
                return '(';
            case '}':
                return '{';
            default:
                return '[';
        }
    }

    private boolean isOpenBracket(Character c) {
        return c == '(' || c == '{' || c == '[';
    }
}
