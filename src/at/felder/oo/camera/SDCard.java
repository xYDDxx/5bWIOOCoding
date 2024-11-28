package at.felder.oo.camera;

import java.util.ArrayList;
import java.util.List;

public class SDCard {

    private double capacity;
    private double usedCapacity;
    private List<File> files;

    public SDCard(double capacity) {
        this.capacity = capacity;
        this.usedCapacity = 0;
        this.files = new ArrayList<>();
    }

    public boolean savePicture(File file) {
        if (this.capacity >= usedCapacity + file.getSizeOfFile()) {
            this.usedCapacity += file.getSizeOfFile();
            this.files.add(file);
            System.out.println("file added: " + file.getName());

            return true;
        }
        System.out.println("file too big: " + file.getName());
        return false;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getUsedCapacity() {
        return usedCapacity;
    }

    public void setUsedCapacity(double usedCapacity) {
        this.usedCapacity = usedCapacity;
    }

    public List<File> getFiles() {
        return files;
    }

}