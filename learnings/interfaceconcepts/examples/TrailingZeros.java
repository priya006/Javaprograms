package learnings.interfaceconcepts.examples;

public class TrailingZeros {

    public static void main(String[] args) {

      /*  int n = 20;

        int count = 0;

        for (int i = 5; n / i >= 1; i *= i) {
            count = count + n / i;
        }

        System.out.println(count);

        char ch = 'a';
        int converted = (int)ch;
        System.out.println(converted);*/
        String s = "Hello";

        for (int i = 0; i < s.length(); i++) {
            char aChar = s.charAt(i);
            if (65 <= aChar && aChar <= 90) {
                aChar = (char) ((aChar + 32));
            }
            // System.out.print(aChar);
        }

        StringBuilder sb = new StringBuilder("abcd");

        sb.append("abcd");
        sb.append("abcd");

        int some1 = sb.indexOf("");


        System.out.println("see" + some1);

        int some = sb.indexOf("cdabcdab");
        System.out.println(some);


    }


}