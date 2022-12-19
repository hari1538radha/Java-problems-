public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char a = s.charAt(i);
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            }
            switch (a) {
                case ')':
                    if (stack.peek() == '{' || stack.peek() == '[')
                        return false;

                    if (stack.isEmpty() == false && stack.peek() == '(')
                        stack.pop();
                    break;
                case ']':
                    if (stack.peek() == '{' || stack.peek() == ')')
                        return false;
                    if (stack.isEmpty() == false && stack.peek() == '[')
                        stack.pop();
                    break;
                case '}':
                    if (stack.peek() == '[' || stack.peek() == '(')
                        return false;

                    if (stack.isEmpty() == false && stack.peek() == '{') {
                        stack.pop();
                    }
                    break;

            }

        }
        return stack.isEmpty();
    }
}
