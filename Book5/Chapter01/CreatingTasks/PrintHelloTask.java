package CreatingTasks;
/*
The created tasks have not yet been assigned to a logic.
 If you take a look at the official documentation,
  you’ll notice that the thread constructor gets a Runnable argument.
  This class describes something that needs to be done, which fits perfectly with the
   concept of a task. Let’s create the task by implementing the Runnable interface:
*/


public class PrintHelloTask implements Runnable {
    private String name;

    public PrintHelloTask(String name){
        this.name = name;
    }

    /*
    Runnable has a run method that contains the task logic. In the above example, the task prints
    the id of the thread during its execution.
    */

    @Override
    public void run() {
        /*
        When threads are running, sometimes we need to track its execution to see if anything goes wrong.
         This can be made with JConsole.

         First, we need to increase the execution time of PrintHelloTask.
          Let’s do this by using the method sleep:
         */
       /* try {
            Thread.sleep(60000);
        } catch (InterruptedException e){
            System.out.println(name + "foi interrompida!");
            e.printStackTrace();
        }*/

        System.out.println("Hello, "+ name+ "!");
    }
}
