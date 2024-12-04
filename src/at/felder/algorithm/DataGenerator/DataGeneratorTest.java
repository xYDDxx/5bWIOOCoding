package at.felder.algorithm.DataGenerator;

import org.junit.jupiter.api.Assertions;

import javax.xml.crypto.Data;

import static org.junit.jupiter.api.Assertions.*;

class DataGeneratorTest {

    @org.junit.jupiter.api.Test
    void generateDataArray() {
        int[] data = DataGenerator.generateDataArray(20);
        for (int element: data) {
            System.out.println(element);
        }
        Assertions.assertEquals(20, data.length);
    }

    @org.junit.jupiter.api.Test
    void testGenerateDataArray() {
    }

    @org.junit.jupiter.api.Test
    void printArray() {
    }
}