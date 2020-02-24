package learnings.interfaceconcepts.examples;

import java.util.Stack;

public class StackImplementationUsingArray {

/*    int arraySize;
    int top;
    int[] array;


    public StackImplementationUsingArray(int arraySize){
        this.arraySize = arraySize;
        this.array = new int[arraySize];
        this.top = -1;
    }


    public void push(){

        if(array)

    }


    public static void main(String[] args) {

    }*/

/*
    private static void getcondition() {

        int n = 0;

        if (n == 0) {
            System.out.println("Print not weird");
        } else if (n == 0 && n >= 2 && n <= 20) {
            System.out.println("print weird");
        } else {
            System.out.println("Print weird");
        }

    }

}*/

//balancing paranthesis

    //If you see a opening bracket push the bracket into the stack
    //Then if the str.charat has a matching closing bracket .Matches with the top most one the pop from the stack
    //If the stack isempty then all the parenthesis are matched

    private static String find(String str) {

        Stack<Character> stack = new Stack<>();
        int stringLength = str.length();

        for (int i = 0; i < stringLength; i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                stack.push(str.charAt(i));



            } else if (stack.peek() == '(' && str.charAt(i) != ')' || stack.peek() == '{' && str.charAt(i) != '}' || stack.peek() == '[' && str.charAt(i) != ']') {
                return "NO";
            }else{
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {

     String IsTheStringBalanced =  find("(&");
        System.out.println(IsTheStringBalanced);


    }
}