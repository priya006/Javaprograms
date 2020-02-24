package Queue;

public class Queue {

    //Queue could be implemented with arrays


    int rear;
    int front;
    int size;
    int[] queue = new int[5];
    int data;


    public void enqueue(int data) {

        //Inserting

        queue[rear] = data; //Always the elements are inserted from the rear
        rear++;
        size++;

    }

    public void show() {


        for (int i = 0; i < size; i++) {
            System.out.print("Elements in the queue are: ");
            System.out.println(queue[i]);
        }

    }


}
