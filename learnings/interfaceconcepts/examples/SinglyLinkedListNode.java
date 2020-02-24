package learnings.interfaceconcepts.examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;
import java.util.HashMap.*;

public class SinglyLinkedListNode {


    public static void main(String[] args) {


        Scanner Scanner = new Scanner(System.in);
        int totalNoOfElementsInArray = Scanner.nextInt();
        LinkedList<Integer> LinkedList = new LinkedList();

        for (int i = 0; i < totalNoOfElementsInArray; i++) {
            int arrayElement = Scanner.nextInt();
            LinkedList.add(arrayElement);
        }
        int queries = Scanner.nextInt();
        int elementToBeInserted = Scanner.nextInt();
        LinkedList.add(totalNoOfElementsInArray, elementToBeInserted);
        int elementToBeDeletedInPosition = Scanner.nextInt();
        //  int  elementToBeDeleted    =   Scanner.nextInt();
        LinkedList.removeFirst();
        System.out.println(LinkedList);


    }

}
