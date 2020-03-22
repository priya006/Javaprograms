package learnings.interfaceconcepts.examples;

import java.util.ArrayList;
import java.util.List;

 class Question {

    private static List<Integer> myList = new ArrayList<>();
     static List<Integer> findAll(String main, String search) throws Exception {

        //String main = “Havingababyis fun until baby needs to go to sleep”;
        // String search = “baby”;

       /* List<Integer> myArraylist = new ArrayList();

        int mainStringLength = main.length();
        int searchStringLength = search.length();
        int count = 0;

        if (main.length() < 1) {
            System.out.println("Enter a valid String to find subsring");

        } else {

            for (int i = 0, j = 0; i < mainStringLength || j < searchStringLength; i++, j++)

            {
                count++;
                if (main.charAt(i) == search.charAt(j))
                    myArraylist.add(count);

            }*/

 /*       List<Integer> list = new ArrayList<Integer>();

        //“Havingababyis fun until baby needs to go to sleep”
        for (int i = 0; i < main.length(); i++) {
            if (main.charAt(i) == search.charAt(0)) {
                for (int j = i + 1; j < i + search.length(); j++) {
                    if (j == search.length()) list.add(i);
                    if (main.charAt(j) != search.charAt(j)) break;
                }
            }
        }


        return list;*/


        int mainStringLength = main.length();

        char[] characterArray = main.toCharArray();
        char[] searchStringCharacterArray = search.toCharArray();

        if (main.contains(search)) {

            for (int i = 0; i < mainStringLength; i++) {
                if (characterArray[i] == searchStringCharacterArray[0])
                    if (characterArray[i + 1] == searchStringCharacterArray[1] && characterArray[i + 2] == searchStringCharacterArray[2] && characterArray[i + 3] == searchStringCharacterArray[3])
                        myList.add(i);
            }

        } else
            System.out.println();
        System.out.println("The string you are searching " + search + " does not exists in the main string");

        return myList;

    }

    public static void main(String[] args) throws Exception {



        List<Integer> finalresult = findAll("Havingababyis fun until baby needs to go to sleep", "baby");

        for (int index : finalresult)
            System.out.println("index is: " + index);



    }




    //This is priya's solution for google question
}
