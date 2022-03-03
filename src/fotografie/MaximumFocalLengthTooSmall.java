package fotografie;

public class MaximumFocalLengthTooSmall extends Exception {
    public void triggerMaximumFocalLengthTooSmall() throws MaximumFocalLengthTooSmall {
        throw new MaximumFocalLengthTooSmall();
    }

    @Override
    public String getMessage() {
        return "Maximum focal length too small";
    }

}
