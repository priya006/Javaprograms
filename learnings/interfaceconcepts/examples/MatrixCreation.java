package learnings.interfaceconcepts.examples;

import java.util.Scanner;

public class MatrixCreation {

    public static void main(String[] args) {


        System.out.println("Enter row and column of MatrixA");

        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int column = input.nextInt();

        int[][] matrixA = new int[row][column];
        int[][] matrixB = new int[row][column];
        int[][] sumOfTwoMatrix = new int[row][column];

        System.out.println("Enter MatrixA root");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrixA[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter MatrixB root");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                matrixB[i][j] = input.nextInt();
            }
        }


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                sumOfTwoMatrix[i][j] = matrixA[i][j] + matrixB[i][j];

            }
        }


        System.out.println("Sum of two matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                System.out.print(sumOfTwoMatrix[i][j] + "\t");
            }
        }


    }
}
