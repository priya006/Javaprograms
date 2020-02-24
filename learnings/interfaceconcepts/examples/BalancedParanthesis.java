package learnings.interfaceconcepts.examples;


import java.util.Map;
import java.util.Stack;

public class BalancedParanthesis {

/*    static String isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            Character ch = input.charAt(i);
            if (input.charAt(i) == '{' || input.charAt(i) == '['
                    || input.charAt(i) == '(') {
                stack.push(input.charAt(i));
            } else {
                if (stack.isEmpty()
                        || (stack.peek() == '[' && ch != ']')
                        || (stack.peek() == '{' && ch != '}')
                        || (stack.peek() == '(' && ch != ')')) {
                    return "NO";
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.empty())
            return "YES";
        return "NO";*/


    //priya's solution

    //push into the stack . So make sure the stack is empty so there is some space left
    //then check for negative condition like when you peek and u see u have '(' and the input != ')'
    //if the above is not the case then stack.pop()
    //Check if stack is empty. Then it is all balanced after u pushing and popping


    private static String findBalancedString(String str) {

        Stack<Character> stack = new Stack<>();
        int stringLength = str.length();




        for (int i = 0; i < stringLength; i++) {

            if (stack.isEmpty() || str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                stack.push(str.charAt(i));
            } else if (stack.peek() == '(' && str.charAt(i) != ')' || stack.peek() ==
                    '{' && str.charAt(i) != '}'
                    || stack.peek() == '[' && str.charAt(i) != ']') {
                return "NOT BALANCED";

            } else {
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return "YES BALANCED";
        }

        return "NOT BALANCED";

    }
    public static void main(String[] args) {
        String output = findBalancedString("{}");
        System.out.println(output);
    }
}