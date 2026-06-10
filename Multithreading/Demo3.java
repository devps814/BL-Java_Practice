package Multithreading;

public class Demo3 {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        Thread t1 = new Thread(() -> {
            System.out.println("Name of the current thread is  : " + Thread.currentThread().getName());
            System.out.println("Main thread name : " + mainThread.getState());
        });
        System.out.println(t1.getState());

        //Runnable state
        t1.start();
        System.out.println(t1.getState());

        try {
            Thread.sleep(2000); // thread.sleep() is used for
            // temporarily pause the execution of the currently running thread for a specified duration.
            System.out.println(t1.getState());
        }catch (Exception e){
            System.out.println(t1.getState()); // terminated
        }
        System.out.println(t1.getState()); // Runnable , Terminated (very rare case )
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());

    }
}
