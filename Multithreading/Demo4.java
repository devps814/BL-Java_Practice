package Multithreading;

public class Demo4 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread start !");

        Thread t1 = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()){
                System.out.println("Running");
            }
//            try {
//                Thread.sleep(2000);
//            }
//            catch(Exception e) {}
//            System.out.println("New thread -0 starts ");
        });
        t1.setDaemon(true); // stop when main thread completed
        t1.start();
        try {
            Thread.sleep(2000);
        }catch (Exception e){}

//        t1.interrupt(); // gives a signal to stop what it is doing.
//        t1.join(); // let t1 get completes its execution
        System.out.println(t1.getState());
    }
}
// Thread.yield() -> this is used to give their cpu time to someone else with same priority and that wants to run.
//OS can reject this .
//It is like suggestion to OS , the current thread doesn't go to waiting, time-waiting , blocked .
// It does only go to runnable state.

//Thread --> interrupt flag (default false)
// t1.interrupt() -> Sends a signal to t1 it should stop doing what its doing.
// We can gracefully handle ->
// we can make a thread run untill a condition .
//cancelling a lomg running task
// used to stop thread pool.
// interrupted() -> return interrupt flag value but also set it back to false (default).
// isInterrupted() -> only return the value(T/F).

// isAlive() ->  check whether the current thread is existed or not .
// currentThread() -> reference of current running thread .

// Daemon Threads --> Background running threads.
// Stops immediately once main thread is completed .