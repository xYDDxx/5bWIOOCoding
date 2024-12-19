package at.felder.algorithms.Tests;

import at.felder.algorithms.SelectionSort;
import at.felder.algorithms.Sorter;
import java.util.Arrays;

public class SelectionSortTest {

    public static void main(String[] args) {
        testSelectionSort();
    }

    private static void testSelectionSort() {
        Sorter selectionSort = new SelectionSort("SelectionSort");
        int[] input = {64, 25, 12, 22, 11};
        int[] expected = {11, 12, 22, 25, 64};
        int[] result = selectionSort.sort(input);
        System.out.println("SelectionSort Test: " + (Arrays.equals(result, expected) ? "Passed" : "Failed"));
    }
}
