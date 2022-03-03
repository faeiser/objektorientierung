package intQueue;

import java.util.ArrayList;
import java.util.List;

public class Queue {

    private List<Integer> list = new ArrayList<Integer>();

    void enqueue(int newElement) {
        list.add(newElement);
        System.out.println("enqueue --> "+list.get(list.size()-1));
    }

    int size() {
        System.out.println("size --> "+list.size());
        return list.size();
    }

    int dequeue() throws QueueTooSmallException {
        if (list.size() == 0) {
            throw new QueueTooSmallException();
        } else {
            System.out.println("dequeue --> "+list.get(0));
            return list.remove(0);
        }
    }

    int[] dequeue(int n) {
        int[] dequeue;
        dequeue = new int[n];

        System.out.print("dequeue --> ");

        for (int i = 0; i < n; i++) {
            dequeue[i] = list.get(0);
            System.out.print("(" + list.get(0) + ") ");
            list.remove(0);
        }
        System.out.println();
        return dequeue;
    }
}
