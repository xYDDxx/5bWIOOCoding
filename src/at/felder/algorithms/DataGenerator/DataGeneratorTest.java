package at.felder.algorithms.DataGenerator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataGeneratorTest {

    @Test
    void generateDataArray() {
        int[] data = DataGenerator.generateDataArray(20);
        assertEquals(20, data.length);
        for (int element : data) {
            System.out.print(element + " ");
            assertNotNull(element);
        }
    }

    @Test
    void testGenerateDataArray() {
        int min = 10;
        int max = 50;
        int[] data = DataGenerator.generateDataArray(20, min, max);
        assertEquals(20, data.length);
        for (int element : data) {
            assertTrue(element >= min && element <= max);
        }
    }

    @Test
    void printArray() {
        int[] data = DataGenerator.generateDataArray(5);
        DataGenerator.printArray(data);
    }
}
