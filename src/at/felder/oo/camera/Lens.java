package at.felder.oo.camera;

public class Lens {
    private double focalLenght;
    private Manufacturer manufacturer;

    public Lens(double focalLenght, Manufacturer manufacturer) {
        this.focalLenght = focalLenght;
        this.manufacturer = manufacturer;
    }

    public double getFocalLenght() {
        return focalLenght;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

}
