package learnings.interfaceconcepts.examples;

public class ThreadConcept {

    public static class priya extends Thread {

        //Java Thread Example by extending Thread class

        @Override
        public void run() {

            System.out.println
                    ("priya running thread ");
        }

    }
    public static void main(String[] args) {
        priya thread = new priya();
        thread.start();

        Thread.yield(); //The current thread will pause and give chance for other threads who are waiting.



        try {

            Thread.sleep(500);

        } catch (InterruptedException ex) {
            System.err.println(ex.getMessage());
        } finally {
            System.out.println("finally block executes anyways");
        }

    }
}
