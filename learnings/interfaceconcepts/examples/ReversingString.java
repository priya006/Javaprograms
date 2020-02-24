package learnings.interfaceconcepts.examples;

public class ReversingString {

    private static String reverseWords(String s) {


        //String final =- ""
        //Convert the String to String[] by using s.split("")
        //Using Enhanced for loop and using String builder reverse ever String
        //Now I have a reversedString String
        // String  final = final + reversedString +""; // final += reversedString +""


        String finalString ="";
        String[] stringAfterSplitting = s.split(" ");
        String reversedString = "";


        if (s.length() > 0) {

            for (String str : stringAfterSplitting) {
                StringBuilder sb = new StringBuilder(str);
                reversedString = sb.reverse().toString();
               // System.out.println(reversedString);
               finalString += reversedString;
            }
        }

        return finalString;
    }


    public static void main(String[] args) {

        String s = "priya yes";
        String reversedString = reverseWords(s);
       System.out.println(reversedString);

    }

}
