package learnings.interfaceconcepts.examples;

import java.util.Arrays;

public class Anagram1 {


    public static void main(String[] args){


        String str1 = "Anagram";
        String str2 = "anagram";





        if(str1.length() == str2.length())

        {

            Arrays.sort(str1.toCharArray());
            Arrays.sort(str2.toCharArray());


            Boolean isAnagram = Arrays.equals(str1.toCharArray(),str2.toCharArray());
            System.out.println("Two Strings are anagram:" + isAnagram);



        }
        else
            System.out.println("Given string is not anagram");




    }

}
