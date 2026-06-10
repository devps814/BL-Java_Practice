package Multithreading;

public class Demo5 {
    public static void main(String[] args) throws InterruptedException{
        Counter c1 = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++){
                c1.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++){
                c1.increment();
            }
        });
        // Here Race condition 
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c1.count);
    }
}

class Counter {
    public int count = 0;

    void increment(){
        count++;
    }
}
