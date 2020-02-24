package learnings.interfaceconcepts.examples;

import java.util.List;

public class SortArray {

    //Question asked in google for QE in technical phone screen

  public static List<Integer> findAll(String str, String substr) throws Exception {


        //  String main = “Havingababyis fun until baby needs to go to sleep”
        //  String search = “baby”


        int substrlen = substr.length(); //-->4
        int strlen = str.length();
        List<Integer> myArraylist = null;
        Integer result = 0;
        int j = 0;

        if (substrlen >= 1) {
            for (int i = 0; i < strlen; i++) {              // iterate through main string
                if (str.charAt(i) == substr.charAt(j)) {    // check substring
                    j++;                                // iterate
                    if (j == substrlen) {                   // when to stop
                        result = i - substrlen; //found substring. As i is currently at the end of our substr so sub substrlen
                    }
                } else {
                    j = 0;
                }
            }
        }

        myArraylist.add(result);
        return myArraylist;
    }


 public static void some(String s){

    // String main = "Havingababyis fun until baby needs to go to sleep";
     char[] characterArray = s.toCharArray();

}
    public static void main(String[] args) throws Exception {

       // findAll("Havingababyis fun until baby needs to go to sleep", "baby");

        some("Havingababyis fun until baby needs to go to sleep");
    }
}
