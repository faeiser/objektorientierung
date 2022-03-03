package stack;

public class StackTooSmallException extends Exception {

    public void triggerStackTooSmallException() throws StackTooSmallException {
        throw new StackTooSmallException();
    }

    @Override
    public String getMessage() {
        return "Stack to Small!";
    }
}
