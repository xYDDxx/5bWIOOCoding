package at.felder.oo.camera;

public class Main {
    public static void main(String[] args) {
        SDCard sdCard1 = new SDCard(10);
        Manufacturer manufacturer1 = new Manufacturer("Leica", "USA");
        Lens lens1 = new Lens(100, manufacturer1);
        Camera camera1 = new Camera(200, 200, "black", Resolution.HIGH, sdCard1, lens1, manufacturer1);

        GUI gui = new GUI(camera1);
        gui.runCamera();

    }
}
