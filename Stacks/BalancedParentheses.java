package InfinityJune21.Stacks;

import java.util.Stack;

public class BalancedParentheses {
    public static boolean checkIfBalanced(String brackets) {
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < brackets.length(); i++) {
            char bracket = brackets.charAt(i);

            if(bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            }
            else if(bracket == ')' || bracket == '}' || bracket == ']') {
                if(stack.isEmpty()) {
                    return false;
                }
                char bracketFromStack = stack.pop();

                switch (bracket) {
                    case ')':
                        if(bracketFromStack == '{' || bracketFromStack == '[') {
                            return false;
                        }
                        break;
                    case '}':
                        if(bracketFromStack == '(' || bracketFromStack == '[') {
                            return false;
                        }
                        break;
                    case ']':
                        if(bracketFromStack == '{' || bracketFromStack == '(') {
                            return false;
                        }
                        break;
                }
            }
            else {

            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String brackets = "[{14(ABC)qwe}]]";

        if(checkIfBalanced(brackets)) {
            System.out.println("Balanced");
        }
        else {
            System.out.println("Not Balanced");
        }
    }
}
