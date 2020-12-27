import java.util.Arrays;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        double[][] a = {{1, 2, 3}}; // 2 x 3 matrix
        double[][] b = {{4},{5},{6}}; // 3 x 4 matrix
        System.out.println(Arrays.deepToString(MatrixMultiplication.matrixMultiplication(a, b)));
    }
}
