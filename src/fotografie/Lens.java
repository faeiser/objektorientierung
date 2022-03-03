package fotografie;

public class Lens {
    private double lensMin, lensMax;
    private String brand;
    static int counter;

    public Lens(String brand, double lensMin, double lensMax) throws MaximumFocalLengthTooSmall {
        this.brand = brand;
        this.lensMin = lensMin;
        this.lensMax = lensMax;
        if (lensMax < lensMin) {
            throw new MaximumFocalLengthTooSmall();
        }
        counter++;
    }

    @Override
    public String toString() {
        return "Lens [brand=" + brand + ", lensMax=" + lensMax + ", lensMin=" + lensMin + "]";
    }

    public double getLensMin() {
        return lensMin;
    }

    public void setLensMin(double lensMin) {
        this.lensMin = lensMin;
    }

    public double getLensMax() {
        return lensMax;
    }

    public void setLensMax(double lensMax) {
        this.lensMax = lensMax;
    }
}
