package learnings.interfaceconcepts.examples;

import java.util.Scanner;

public class ConvertUpperTLowerCase {
    public static void main(String[] args) {

        char ch;
        int temp;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Character in Uppercase : ");
        ch = scan.next().charAt(0);

        temp = ch; //ascii value of the ch (uppercase character example A)
        temp = temp + 32; //Formula to convert big Which is ascii value
        ch = (char) temp;

        System.out.print("Equivalent Character in Lowercase = " + ch);

    }

}
