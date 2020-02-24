package learnings.interfaceconcepts.examples;

public class ReverseStringEasy {


    public static void main(String[] args) {

        String str = "java";
        int j = 0;
        int stringLength = str.length();
        char[] charArray = str.toCharArray();
       char[] newArray = new char[stringLength];


      //  System.out.println(str.substring(1));

        if ((str == null) || stringLength <= 1)
            System.out.println("Enter a valid string to reverse:");

        else {
            for (int i = stringLength - 1; i >= 0; i--) {
                newArray[j] = charArray[i];
                j++;

            }
            for (int k = 0; k < stringLength; k++)
                System.out.println(newArray[k]);
        }
    }

}

// i created a new char [] which is not optimal
