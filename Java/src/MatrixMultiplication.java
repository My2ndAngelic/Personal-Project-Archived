public class MatrixMultiplication {
    public static double[][] matrixMultiplication(double[][] a, double[][] b) {
        double[][] c = new double[a.length][b[0].length];
        if (!filledMatrix(a) || !filledMatrix(b)) {
            throw new ArithmeticException("Check your matrices filled or not.");
        }
        if (!dimensionAgreement(a, b)) {
            throw new ArithmeticException("Check your dimension agreement of the input matrices");
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                double[] temp1 = rowExtractor(a, i);
                double[] temp2 = columnExtractor(b, j);
                double cij = 0;
                for (int k = 0; k < temp1.length; k++) {
                    cij += temp1[k] * temp2[k];
                }
                c[i][j] = cij;
            }
        }
        return c;
    }

    private static boolean filledMatrix(double[][] a) {
        int temp = a[0].length;
        for (int i = 1; i < a.length; i++) {
            if (a[i].length != temp) {
                return false;
            }
        }
        return true;
    }

    private static double[] rowExtractor(double[][] input, int no) {
        double[] output = new double[input[no].length];
        for (int i = 0; i < input[no].length; i++) {
            output[i] = input[no][i];
        }
        return output;
    }

    private static double[] columnExtractor(double[][] input, int no) {
        double[] output = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i][no];
        }
        return output;
    }

    private static boolean dimensionAgreement(double[][] in1, double[][] in2) {
        int a = in1[0].length;
        for (double[] ints : in1) {
            if (ints.length != a) {
                return false;
            }
        }
        return in2.length == a;
    }
}
