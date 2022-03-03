package fotografie;

public class Main {
    public static void main(String[] args) throws MaximumFocalLengthTooSmall {

        Lens canon_EF = new Lens("canon_EF", 50, 50);
        Lens sony_FE = new Lens("sony_FE", 85, 85);
        Lens tamron_18_200mm = new Lens("tamron_18_200mm", 18, 200);

        Camera lumix_DMC_FZ1000 = new Camera("Panasonic Lumix_DMC_FZ1000", 20.1, 3, tamron_18_200mm);
        System.out.println(lumix_DMC_FZ1000.toString());

        Camera cyber_shot_DSC_RX100_III = new Camera("Sony Cyber_shot_DSC_RX100_III", 20.1, 3, sony_FE);
        System.out.println(cyber_shot_DSC_RX100_III.toString());

        Camera powerShot_SX540_HS = new Camera("Canon PowerShot_SX540_HS", 20.3, 3.0, canon_EF);
        System.out.println(powerShot_SX540_HS.toString());

        Camera d750 = new Camera("Nikon D750", 20.3, 3.0, tamron_18_200mm);
        System.out.println(d750.toString());

        System.out.println("CameraCounter: " + Camera.counter);
        System.out.println("LensCounter: " + Lens.counter);

        lumix_DMC_FZ1000.setLens(sony_FE);
        System.out.println(lumix_DMC_FZ1000.toString());
    }
}
