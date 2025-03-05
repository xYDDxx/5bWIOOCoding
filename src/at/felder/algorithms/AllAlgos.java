package at.felder.algorithms;
import java.util.Arrays;
import java.util.Random;

public class AllAlgos {

    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        for (int size : sizes) {
            int[] array = generateRandomArray(size);

            System.out.println("Array size: " + size);

            if (size <= 1000000) {
                runAlgorithm("Bubble Sort", array, AllAlgos::bubbleSort);
                runAlgorithm("Insertion Sort", array, AllAlgos::insertionSort);
                runAlgorithm("Selection Sort", array, AllAlgos::selectionSort);
            } else {
                System.out.println("Skipping Bubble, Insertion, and Selection Sort for size: " + size);
            }

            runAlgorithm("Quick Sort", array, (arr) -> quickSort(arr, 0, arr.length - 1));

            System.out.println();
        }
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    private static void runAlgorithm(String name, int[] originalArray, Algorithm algorithm) {
        int[] array = Arrays.copyOf(originalArray, originalArray.length);
        long start = System.nanoTime();
        try {
            algorithm.sort(array);
            long end = System.nanoTime();
            double duration = (end - start) / 1_000_000_000.0;
            if (duration > 20) {
                System.out.println(name + " failed: Took longer than 20 seconds");
            } else {
                System.out.printf("%s: %.3f seconds%n", name, duration);
            }
        } catch (Exception e) {
            System.out.println(name + " failed: " + e.getMessage());
        }
    }

    private static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    private static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);

            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    @FunctionalInterface
    interface Algorithm {
        void sort(int[] array);
    }
}
