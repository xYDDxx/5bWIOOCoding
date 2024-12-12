package at.felder.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import at.felder.algorithms.Sorter;

public class Controller {

    private List<Sorter> sorters = new ArrayList<>();
    private Sorter selectedSorter;
    private boolean running;

    public Controller() {
        running = true;
        selectedSorter = null;
    }

    public void addSorter(Sorter sorter) {
        sorters.add(sorter);
    }

    public void displaySorters() {
        int index = 1;
        for (Sorter sorter : sorters) {
            System.out.println(index + ": " + sorter.getName());
            index++;
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (running) {

            System.out.println("1 - Show all sorting algorithms");
            System.out.println("2 - Select a sorting algorithm");
            System.out.println("3 - Sort numbers");
            System.out.println("4 - Exit");

            int input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 1:
                    displaySorters();
                    break;
                case 2:
                    System.out.println("Available sorting algorithms:");
                    displaySorters();
                    System.out.print("Select a number: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    selectedSorter = sorters.get(index - 1);
                    System.out.println("Selected: " + selectedSorter.getName());
                    break;
                case 3:
                    if (selectedSorter == null) {
                        System.out.println("No sorting algorithm selected.");
                        break;
                    }
                    System.out.print("Enter numbers separated by commas: ");
                    String inputNumbers = scanner.nextLine();
                    String[] numberStrings = inputNumbers.split(",");
                    int[] numbers = Arrays.stream(numberStrings).mapToInt(s -> Integer.parseInt(s.trim())).toArray();
                    int[] sortedNumbers = selectedSorter.sort(numbers);
                    System.out.println("Sorted: " + Arrays.toString(sortedNumbers));
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        scanner.close();
    }
}
