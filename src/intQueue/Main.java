package intQueue;

public class Main {
    public static void main(String[] args) throws QueueTooSmallException {
        Queue queue = new Queue();

        queue.enqueue(22);
        queue.enqueue(33);
        queue.enqueue(44);
        queue.enqueue(55);
        queue.size();
        queue.dequeue();
        queue.size();
        queue.dequeue();
        queue.size();
        queue.enqueue(33);
        queue.size();
        queue.dequeue();
        queue.size();
        queue.enqueue(66);
        queue.enqueue(77);
        queue.enqueue(88);
        queue.size();
        queue.dequeue(5);
        queue.size();
        queue.dequeue();
    }
}
