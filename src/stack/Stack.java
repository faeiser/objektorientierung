package stack;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    private List<Integer> list = new ArrayList<Integer>();

    public void push(int newElement) {
        list.add(newElement);
    }

    public int size() {
        return list.size();
    }

    public int pop() throws StackTooSmallException {
        if (list.size() == 0) {
            throw new StackTooSmallException();
        } else {
            return list.remove(list.size() - 1);
        }
    }

    public int peek() throws StackTooSmallException {
        if (list.size() == 0) {
            throw new StackTooSmallException();
        } else {
            return list.get(list.size() - 1);
        }
    }

    public int[] pop(int n) {
        int[] pop;
        pop = new int[n];

        System.out.print("pop --> ");
        for (int i = (list.size() - 1); i > 0; i--) {
            pop[i - 1] = list.get(i);
            System.out.print("(" + list.get(i) + ") ");
            list.remove(i);
        }
        System.out.println();
        return pop;
    }
}
