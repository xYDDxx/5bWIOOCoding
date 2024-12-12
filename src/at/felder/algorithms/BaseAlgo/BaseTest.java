package at.felder.algorithms.BaseAlgo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaseTest {

    @Test
    void revert() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        int[] result = Base.revert(input);
        assertArrayEquals(expected, result, "Das Array wurde nicht richtig inverted.");
    }

    @Test
    void max() {
        int[] input = {1, 2, 3, 4, 5};
        int expected = 5;
        int result = Base.max(input);
        assertEquals(expected, result, "Die größte Zahl wurde nicht richtig ermittelt.");
    }

    @Test
    void min() {
        int[] input = {1, 2, 3, 4, 5};
        int expected = 1;
        int result = Base.min(input);
        assertEquals(expected, result, "Die kleinste Zahl wurde nicht richtig ermittelt.");
    }
}
