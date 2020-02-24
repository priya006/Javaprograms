package learnings.interfaceconcepts.examples;


import java.util.LinkedList;
import java.util.List;

public class LInkedLIst {

    //	The LinkedList is implemented using nodes linked to each other

    private static Node head;
    private static Node secondNode;
    private static LinkedList llist;


    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void printList() {
        //Node n = head;
        if (head != null) {
            System.out.println(head.data + "First or head");
            //head =  head.next;
            System.out.println(head.next.data + "Second");
        //    System.out.println(llist.get(0).toString() + "index 0");


        }
    }

    public static void main(String args[]) {

        llist = new LinkedList();

        head = new Node(5);
        Node secondNode = new Node(10);
        Node thirdNode = new Node(15);

        //linking sequentially
        head.next = secondNode;
        secondNode.next = thirdNode;

        llist.add(head);
        llist.add(secondNode);
        llist.add(thirdNode);


        

        //different concept

   /*     LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("Item1");
        Object firstvar = linkedlist.get(0);
        System.out.println("First element: " +firstvar);*/

        printList();
    }


}
