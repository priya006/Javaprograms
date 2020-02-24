package learnings.interfaceconcepts.examples;

import java.util.ArrayList;
import java.util.List;

public class GoogleSolutiuonWithStringAPI {


    //Disadvantage of this solution is it can have only one index added
    //


    private static ArrayList<Integer> SearchTheString(String mainString, String SearchString) {


        int SearchStringLength = SearchString.length();
        ArrayList<Integer> listOfIndex = new ArrayList<>();


        if (mainString.contains(SearchString)) {

            int searchStringFirstIndex = mainString.lastIndexOf(SearchString);

            String searchedString = mainString.substring(searchStringFirstIndex, searchStringFirstIndex + SearchStringLength);

            if (searchedString.equals(SearchString))

                listOfIndex.add(searchStringFirstIndex);

            else
                throw new IllegalArgumentException("something is wrong here"); // how to not add anything to arraylist


        }


        return listOfIndex;


    }


    public static void main(String[] args) {
        String SearchString = "baby";
        String mainString = "Havingababyis fun until baby needs to go to sleep";
        ArrayList arrayList = SearchTheString(mainString, SearchString);
        System.out.println(arrayList);


    }
}
