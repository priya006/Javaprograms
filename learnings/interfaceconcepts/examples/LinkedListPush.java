package learnings.interfaceconcepts.examples;


import java.util.LinkedList;

public class LinkedListPush {


    Node next;
    static Node head;

    class Node {

        int data;

        Node(int data) {

            this.data = data;
            next = null;

        }

    }

    static void deleteList() {

        head = null;
    }

    public void push(int new_data) {

        Node head = new Node(new_data);


    }


    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.push(5);
        llist.push(15);
        llist.push(25);
        llist.push(35);

        System.out.println(llist);


        deleteList();
        System.out.println("Linked list deleted");
        System.out.println(llist);
    }


}
