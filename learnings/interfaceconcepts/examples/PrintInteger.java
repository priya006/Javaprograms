package learnings.interfaceconcepts.examples;

public class PrintInteger {


    public static void main(String[] args) {


        double[] doubleArray = {0.1, 5.2, 5.3, 6.3, 83.3};

        for(int i =0;i < doubleArray.length ; i++ ){

            System.out.printf("%.2f ", doubleArray[i]);
        }

    }
}
