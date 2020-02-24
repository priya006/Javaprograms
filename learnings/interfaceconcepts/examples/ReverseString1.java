package learnings.interfaceconcepts.examples;


public class ReverseString1 {

    public static void main(String[] args) {

        String inputString = "madam";
        int totalLength = inputString.length();

        for (int i = 0, j = totalLength - 1; i < 5 && j >= 0; i++, j--) {

            if (inputString.charAt(i) == inputString.charAt(j))
                System.out.println("Yes");
        }
        System.out.println(inputString.substring(0,3));
    }

}



