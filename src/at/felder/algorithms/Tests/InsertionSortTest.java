package at.felder.algorithms.Tests;

import at.felder.algorithms.BubbleSort;
import at.felder.algorithms.InsertionSort;
import at.felder.algorithms.Sorter;
import java.util.Arrays;

public class InsertionSortTest {

    public static void main(String[] args) {
        testInsertionSort();
    }

    private static void testInsertionSort() {
        Sorter insertionSort = new InsertionSort("InsertionSort");
        int[] input = {4, 3, 2, 10, 12, 1, 5, 6};
        int[] expected = {1, 2, 3, 4, 5, 6, 10, 12};
        int[] result = insertionSort.sort(input);
        System.out.println("InsertionSort Test: " + (Arrays.equals(result, expected) ? "Passed" : "Failed"));
    }
}