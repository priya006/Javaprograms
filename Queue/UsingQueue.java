package Queue;

public class UsingQueue {
    public static void main(String[] args) {


        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(55);
        queue.enqueue(550);

        System.out.println("size: " +queue.size);
        queue.show();

    }
}
