package org.example.HW22;

public class Matrix {

    public int average(int[] numbers) {

        double average = 0;
        double sum = 0;
        for (int j = 0; j < numbers.length; j++) {
            sum += numbers[j];
            average = sum / numbers.length;
        }
        return (int) average;
    }

    public boolean isSquare(int[][] array) {
        boolean counter = true;

        for (int[] arr : array) {
            if (array.length == arr.length) {
                counter = true;
            } else {
                counter = false;
            }
        }
        return counter;
    }
}