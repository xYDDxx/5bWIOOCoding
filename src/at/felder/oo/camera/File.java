package at.felder.oo.camera;

import java.time.LocalDateTime;

public class File {
    private String name;
    private double sizeOfFile;
    private LocalDateTime dateOfFile;

    public File(String name, double sizeOfFile, LocalDateTime dateOfFile) {
        this.name = name;
        this.sizeOfFile = sizeOfFile;
        this.dateOfFile = dateOfFile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSizeOfFile() {
        return sizeOfFile;
    }

    public LocalDateTime getDateOfFile() {
        return dateOfFile;
    }

}
