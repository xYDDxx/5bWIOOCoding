package at.felder.oo.camera;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GUI {
    private Camera camera;
    Scanner scanner = new Scanner(System.in);
    private List<SDCard> sdCards;

    public GUI(Camera camera) {
        this.camera = camera;
        this.sdCards = new ArrayList<>();
    }

    public void runCamera() {
        boolean guiRunning = true;
        while (guiRunning) {
            System.out.println("What would you like to do?");
            System.out.println("Press 1 - Take Picture");
            System.out.println("Press 2 - Add SD-Card");
            System.out.println("Press 3 - Remove SD-Card");
            System.out.println("Press 4 - Free Memory of the SD-Card");
            System.out.println("Press 5 - Set Resolution of Camera");
            System.out.println("Press 3 - Remove SD-Card");
            System.out.println("Press 9 - Shut Down");
            int s = scanner.nextInt();

            switch (s) {
                case 1:
                    System.out.println("Enter the name of the picture:");
                    String nameOfPicture = scanner.next();
                    camera.takePicture(nameOfPicture);
                    break;

                case 2:
                    System.out.println("Enter the capacity of the SD-Card:");
                    Double capacity = scanner.nextDouble();
                    SDCard sdCard = new SDCard(capacity);

                    camera.setSdCard(sdCard);
                    break;

                case 3:
                    camera.removeSdCard();
                    break;

                case 4:
                    camera.getFreeMemoryOfSD();
                    break;

                case 5:
                    Resolution resolution = camera.getResolution();
                    System.out.println("Enter the Resolution of the Camera (1-Low, 2-Medium, 3-High):");
                    int cameraResolution = scanner.nextInt();
                    if (cameraResolution == 1) {
                        resolution = Resolution.LOW;
                    } else if (cameraResolution == 2) {
                        resolution = Resolution.MEDIUM;
                    } else if (cameraResolution == 3) {
                        resolution = Resolution.HIGH;
                    }
                    camera.setResolution(resolution);
                    break;

                case 9:
                    guiRunning = false;
                    break;

                default:
                    break;

            }
            System.out.println("-----------------------");

        }
    }

    public List<SDCard> getSdCards() {
        return sdCards;
    }

    public void setSdCards(SDCard sdCard) {
        this.sdCards.add(sdCard);
    }
}