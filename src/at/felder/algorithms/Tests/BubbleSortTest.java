package at.felder.algorithms.Tests;

import at.felder.algorithms.BubbleSort;
import at.felder.algorithms.Sorter;
import java.util.Arrays;

public class BubbleSortTest {

    public static void main(String[] args) {
        testBubbleSort();
    }

    private static void testBubbleSort() {
        Sorter bubbleSort = new BubbleSort("BubbleSort");
        int[] input = {5, 2, 9, 1, 5, 6};
        int[] expected = {1, 2, 5, 5, 6, 9};
        int[] result = bubbleSort.sort(input);
        System.out.println("BubbleSort Test: " + (Arrays.equals(result, expected) ? "Passed" : "Failed"));
    }

}