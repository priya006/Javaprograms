package learnings.interfaceconcepts.examples;

public class RotateString {


    public static boolean rotateString(String A, String B) {


        StringBuilder stringBuilder = new StringBuilder(A);


        if (A.length() == 0) return false;

        for (int i = 0; i < A.length(); i++) {
            stringBuilder.append(A.charAt(i));
           // String convertedToString = String.valueOf(stringBuilder.deleteCharAt(0));
            String convertedToString = stringBuilder.deleteCharAt(0).toString();

            if (convertedToString.equals(B))
                return true;
        }

        return false;
    }



    public static void main(String[] args) {

        boolean isRotateString = rotateString("malayalam", "malayalam");
        System.out.println(isRotateString);


        String s = "priya";
        


    }
}
