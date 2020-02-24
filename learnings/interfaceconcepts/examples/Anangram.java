package learnings.interfaceconcepts.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Anangram {
    public static void main(String[] args) {
        String s = "anagram";

        int[] counter = new int[26];

/*         int some =   s.charAt(0) - 'a';  //
        System.out.println(some);*/




        counter[s.charAt(0) - 'a']++;


        System.out.println(counter);


    /*    int some = s.charAt(0);
        System.out.println(some);
         int valueofA  =  some - 'a';
        System.out.println(valueofA);*/



        String t = "nagaram";
        boolean isAnagram = false;


        if (s.length() != t.length()) {
            isAnagram = false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();


        Arrays.sort(str1);
        Arrays.sort(str2);

        Arrays.equals(str1, str2);




     List<Integer> arrayList =  new ArrayList<>();




     List<Integer> linkedList = new LinkedList<>();



    }
}
