package learnings.interfaceconcepts.examples;

public class Exception extends Throwable {
    public static void main(String[] args) {


/*        try {
            String a = null; //null value
            System.out.println(a.charAt(0));
        } catch (NullPointerException e) {
            //  System.out.println("NullPointerException..");
            System.err.println(e.getMessage());
            //  e.printStackTrace();
        }

        //Since the exception was handled in the program properly the program did not terminate
        int e = 6 + 5;
        System.out.println(e);*/


        //ArrayIndexOutOfBoundException

     int  d =    Integer.parseInt("7");
     System.out.print(d);
        try{

            int[] a = {2,3};
            for(int i =0 ; i >a.length;i++){

                System.out.println(a[7]);

            }

        }catch (ArrayIndexOutOfBoundsException ax){

            System.err.println(ax.getMessage());
            ax.printStackTrace();
        }






   /*     String c = null;
        char d = c.charAt(0);
        System.out.println(d);


        int e = 6 + 5;
        System.out.println(e);*/


    }
}




