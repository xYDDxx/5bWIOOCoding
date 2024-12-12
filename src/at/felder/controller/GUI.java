package at.felder.controller;

import at.felder.algorithms.BubbleSort;
import at.felder.algorithms.InsertionSort;
import at.felder.algorithms.SelectionSort;
import at.felder.algorithms.Sorter;

public class GUI {
    public static void main(String[] args) {
        Controller controller = new Controller();

        Sorter bubbleSort = new BubbleSort("BubbleSorter");
        Sorter insertionSort = new InsertionSort("InsertionSorter");
        Sorter selectionSort = new SelectionSort("SelectionSorter");

        controller.addSorter(bubbleSort);
        controller.addSorter(insertionSort);
        controller.addSorter(selectionSort);

        controller.run();

    }
}
