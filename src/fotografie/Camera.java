package fotografie;

public class Camera {
    private String brand;
    private double megaPixels, displaySize;
    private Lens lens;
    static int counter;

    public Camera(String brand, double megaPixels, double displaySize, Lens lens)
            throws MaximumFocalLengthTooSmall {
        this.brand = brand;
        this.megaPixels = megaPixels;
        this.displaySize = displaySize;
        this.lens = lens;
        counter++;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getMegaPixels() {
        return megaPixels;
    }

    public void setMegaPixels(double megaPixels) {
        this.megaPixels = megaPixels;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Camera.counter = counter;
    }

    public Lens getLens() {
        return lens;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }

    @Override
    public String toString() {
        return "Camera [brand=" + brand + ", displaySize=" + displaySize + ", megaPixels="
                + megaPixels + ", lens=" + lens + "]";
    }

}
