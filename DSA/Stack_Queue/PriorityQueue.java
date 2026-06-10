package DSA.Stack_Queue;

// Q19_PriorityQueueLazyDeletion.java
// Priority queue with lazy deletion
import java.util.*;

public class PriorityQueue {
    private java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>();
    private Set<Integer> deleted = new HashSet<>();

    public void insert(int x) {
        pq.offer(x);
    }

    public void delete(int x) {
        deleted.add(x);
    }

    public Integer poll() {
        while (!pq.isEmpty() && deleted.contains(pq.peek())) {
            deleted.remove(pq.poll());
        }
        return pq.poll();
    }

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.insert(5);
        pq.insert(1);
        pq.insert(3);
        pq.delete(1);
        System.out.println(pq.poll()); // 3
    }
}