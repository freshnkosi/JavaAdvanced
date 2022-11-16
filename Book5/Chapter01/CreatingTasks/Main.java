package CreatingTasks;

//First, we’re going to create the tasks.
// Each task will be performed by one thread represented by the class Thread:

public class Main {
    public static void main(String[] args) {

        /*Now we're adding tasks to our threads, after overriding the
        run method in our Runnable interface.
        */
        Thread task1 = new Thread(new PrintHelloTask("Task 1"));
        Thread task2 = new Thread(new PrintHelloTask("Task 2"));
        Thread task3 = new Thread(new PrintHelloTask("Task 3"));
        Thread task4 = new Thread(new PrintHelloTask("Task 4"));

        //When running the Tasks
        //You just need to call the start method:
        task1.start();
        task2.start();
        task3.start();
        task4.start();
    }
}
