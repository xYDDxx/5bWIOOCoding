package at.felder.algorithms.BaseAlgo;

public class Base {

        public static int[] revert(int[] data) {
            int[] reversed = new int[data.length];
            for (int i = 0; i < data.length; i++) {
                reversed[i] = data[data.length - 1 - i];
            }
            return reversed;
        }

        public static int max(int[] data) {
            int max = data[0];
            for (int i = 1; i < data.length; i++) {
                if (data[i] > max) {
                    max = data[i];
                }
            }
            return max;
        }

        public static int min(int[] data) {
            int min = data[0];
            for (int i = 1; i < data.length; i++) {
                if (data[i] < min) {
                    min = data[i];
                }
            }
            return min;
        }
    }

