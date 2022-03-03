package intQueue;

public class QueueTooSmallException extends Exception {
    public void triggerQueueTooSmallException() throws QueueTooSmallException {
        throw new QueueTooSmallException();
    }

    @Override
    public String getMessage() {
        return "Queue to Small!";
    }
}
