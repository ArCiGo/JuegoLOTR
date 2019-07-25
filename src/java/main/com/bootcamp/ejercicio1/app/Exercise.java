import java.util.Stack;

public class Exercise {
    public boolean balancedParentheses(String parentheses) {
        Stack<Character> stack = new Stack<>();
        boolean aux = true;

        for(int i = 0; i < parentheses.length(); i ++) {
            char bracket = parentheses.charAt(i);
            if(bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else {
                if(bracket == '}') {
                    bracket = '{';
                } else if(bracket == ')') {
                    bracket = '(';
                } else if(bracket == ']') {
                    bracket = '[';
                }

                if(stack.empty()) {
                    aux = false;
                    break;
                }

                if(bracket == stack.peek()) {
                    stack.pop();
                } else {
                    aux = false;
                    break;
                }
            }
        }

        
    }


    public static void main(String args[]) {
        balancedParentheses("({{[]}})");
    }
}