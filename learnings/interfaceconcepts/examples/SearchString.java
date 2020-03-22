package learnings.interfaceconcepts.examples;

public class SearchString {


    static void printIndex(String mainString, String searchedString) {


        boolean flag = false;

        for (int i = 0; i < mainString.length() - searchedString.length() + 1; i++) {

            System.out.println(mainString.substring(0,2));

            if (mainString.substring(i, i + searchedString.length()).equals(searchedString)) {

                System.out.print(i + " ");
                flag = true;
            }

        }

        if (!flag) {
            System.out.print("NONE");

        }
    }



    public static void main(String[] args) {

        String str1 = "mycar";
        String str2 = "car";
        printIndex(str1, str2);


    }

}


