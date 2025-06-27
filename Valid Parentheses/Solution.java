class Solution {
    public boolean isValid(String s) {
        String stack = "";
        for (int i = 0; i < s.length(); i++) {
            if ((stack.length() == 0) && ((s.charAt(i) == ')') || (s.charAt(i) == ']') || (s.charAt(i) == '}'))) return false;

            if (stack.length() != 0) {
                if ((stack.charAt(stack.length()-1) == '(') && (s.charAt(i) == ')')) {
                    if (stack.length() == 1) {
                        stack = "";
                    } else {
                        stack = stack.substring(0, stack.length()-1);
                    }
                } else if ((stack.charAt(stack.length()-1) == '[') && (s.charAt(i) == ']')) {
                    if (stack.length() == 1) {
                        stack = "";
                    } else {
                        stack = stack.substring(0, stack.length()-1);
                    }
                } else if ((stack.charAt(stack.length()-1) == '{') && (s.charAt(i) == '}')) {
                    if (stack.length() == 1) {
                        stack = "";
                    } else {
                        stack = stack.substring(0, stack.length()-1);
                    }
                } else {
                    stack += s.charAt(i);
                }
            } else {
                stack += s.charAt(i);
            }
        }
        if (stack.length() != 0) return false;
        return true;
    }
}
