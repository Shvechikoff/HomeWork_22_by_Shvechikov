import org.example.HW22.Matrix;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatrixTest {

    Matrix matrix = new Matrix();

    int[] numbers = {5, 5, 5};

    int[][] testMatrix = new int[5][5];

    @Test
    public void shouldGetReturnAverage() {

        int actualResult = matrix.average(numbers);
        int expectedResult = 5;

        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void shouldGetReturnIsSquare() {

        boolean actualResult = matrix.isSquare(testMatrix);
        boolean expectedResult = true;

        assertEquals(actualResult, expectedResult);
    }
}