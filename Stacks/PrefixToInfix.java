package InfinityJune21.Stacks;

import java.util.Stack;

public class PrefixToInfix {
    public static boolean isOperator(char ch) {
        if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
            return true;
        }
        return false;
    }

    public static String convertToInfix(String prefix) {
        Stack<String> stack = new Stack<String>();
        int length = prefix.length();

        for(int i = (length - 1); i >= 0; i--) {
            char ch = prefix.charAt(i);

            if(isOperator(ch)) {
                String op1 = stack.pop();
                String op2 = stack.pop();

                String expression = "(" + op1 + ch + op2 + ")";

                stack.push(expression);
            }
            else {
                stack.push(ch + "");
            }
        }

        String infix = stack.pop();
        return infix;
    }

    public static void main(String[] args) {
        String prefix = "*+AB-CD";
        String infix = convertToInfix(prefix);
        System.out.println("Infix: " + infix);
    }
}
