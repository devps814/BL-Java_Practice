import java.util.LinkedList;
import java.util.Queue;

public class PrinterQueueSimulation {

    public static void main(String[] args) {

        Queue<String> printerQueue = new LinkedList<>();
        printerQueue.add("Document 1");
        printerQueue.add("Document 2");
        printerQueue.add("Document 3");

        System.out.println("Printing Documents:");
        while (!printerQueue.isEmpty()) {
            String document = printerQueue.poll();

            System.out.println(document + " Printed");
        }
    }
}