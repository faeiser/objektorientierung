package stack;

public class Main {
    public static void main(String[] args) throws StackTooSmallException {
        Stack test = new Stack();
            test.push(22);
            test.push(33);
            test.push(44);
            test.push(55);
            System.out.println(test.size());
            System.out.println(test.peek());
            System.out.println(test.pop());
            System.out.println(test.size());
            System.out.println(test.peek());
            test.pop(2);
            System.out.println(test.size());
            System.out.println(test.peek());
            System.out.println("pop: " +test.pop());
            System.out.println(test.size());
            // System.out.println(test.peek());
            System.out.println(test.pop());
    }
}
