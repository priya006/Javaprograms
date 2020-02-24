package learnings.interfaceconcepts.examples;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class SubstringSearch {

    public static void main(String[] args) {


        patterMatch("navinreddy", "navin");


    }


    public static void patterMatch(String mainString, String patternString) {
        int count = 0;
        int mainStringLength = mainString.length();
        int patternStringLength = patternString.length();

        for (int i = 0; i < mainStringLength - patternStringLength + 1; i++) {
            if (patternString.charAt(0) == mainString.charAt(i)) {

                for (int j = i, k = 0; j < mainStringLength; j++, k++) {

                        if (mainString.charAt(j) != patternString.charAt(k)) {
                            break;
                        } else
                            count++;




                }

            }
        }

        if (count == patternStringLength)
            System.out.println("Matching pattern found");
        else
            System.out.println("Matching pattern NOT found");
    }

}
