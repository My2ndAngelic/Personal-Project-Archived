package MathUtils;

public class LinearAlgebraUtils {
//    public static <T extends Number> T[][]  matrixMultiplication(T[][] a, T[][] b) {
//        T[][] c = new T[a.length][b[0].length];
////        if (isNotMatrix(a) || isNotMatrix(b)) {
////            throw new ArithmeticException("Your input is not a matrix.");
////        }
////        if (!dimensionAgreement(a, b)) {
////            throw new ArithmeticException("Your matrices do not agree in dimension.");
////        }
//        for (int i = 0; i < c.length; i++) {
//            for (int j = 0; j < c[0].length; j++) {
//                double[] temp1 = rowExtractor(a, i);
//                double[] temp2 = columnExtractor(b, j);
//                Number cij = new Number() {
//                } 0;
//                for (int k = 0; k < temp1.length; k++) {
//                    cij += temp1[k] * temp2[k];
//                }
//                c[i][j] = cij;
//            }
//        }
//        return c;
//    }


    public static double[][] matrixMultiplication(double[][] a, double[][] b) {
        double[][] c = new double[a.length][b[0].length];
        if (isNotMatrix(a) || isNotMatrix(b)) {
            throw new ArithmeticException("Your input is not a matrix.");
        }
        if (!dimensionAgreement(a, b)) {
            throw new ArithmeticException("Your matrices do not agree in dimension.");
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

    public static <T extends Number> boolean isNotMatrix(T[][] a) {
        int temp = a[0].length;
        for (int i = 1; i < a.length; i++) {
            if (a[i].length != temp) {
                return true;
            }
        }
        return false;
    }

    public static <T extends Number> T[] rowExtractor(T[][] input, int no) {
        T[] output = new T[input[no].length];
        for (int i = 0; i < input[no].length; i++) {
            output[i] = input[no][i];
        }
        return output;
    }

    public static double[] columnExtractor(double[][] input, int no) {
        double[] output = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i][no];
        }
        return output;
    }

    public static boolean dimensionAgreement(double[][] in1, double[][] in2) {
        int a = in1[0].length;
        for (double[] ints : in1) {
            if (ints.length != a) {
                return false;
            }
        }
        return in2.length == a;
    }

    public static double vectorDotProduct(double[] a, double[] b) {
        double output = 0;
        if (a.length != b.length) {
            throw new ArithmeticException("Input vectors are not in the same space.");
        }
        for (int i = 0; i < a.length; i++) {
            output += a[i] * b[i];
        }
        return output;
    }

    public static <T extends Number> boolean isSquareMatrix(T[][] a) {
        if (isNotMatrix(a)) {
            throw new ArithmeticException("Check your matrix.");
        }
        return rowLength(a).equals(columnLength(a));
    }

    public static <T extends Number> Integer rowLength(T[][] a) {
        return rowExtractor(a,0).length;
    }

    public static <T extends Number> Integer columnLength(T[][] a) {
        return columnExtractor(a,0).length;
    }

    // Start SOF part: https://stackoverflow.com/questions/16602350/calculating-matrix-determinant
    private static double determinant1(double[][] a, int n) {
        double res;
        if (n == 1) {
            res = a[0][0];
        } else if (n == 2) {
            res = a[0][0] * a[1][1] - a[1][0] * a[0][1];
        } else {
            res = 0;
            for (int j1 = 0; j1 < n; j1++){
                double[][] m = generateSubArray (a, n, j1);
                res += Math.pow(-1.0, 1.0+j1+1.0) * a[0][j1] * determinant1(m, n-1);
            }
        }
        return res;
    }

    private static double[][] generateSubArray (double A[][], int N, int j1){
        double[][] m = new double[N-1][];
        for (int k=0; k<(N-1); k++)
            m[k] = new double[N-1];

        for (int i=1; i<N; i++){
            int j2=0;
            for (int j=0; j<N; j++){
                if(j == j1)
                    continue;
                m[i-1][j2] = A[i][j];
                j2++;
            }
        }
        return m;
    }
    // End SOF part

    public static double determinant(double[][] a) {
        if (!isSquareMatrix(a)) {
            throw new ArithmeticException("Not a square matrix.");
        } else {
            return determinant1(a, a.length);
        }
    }

    public static double[][] add(double[][] a, double[][] b) {
        if (rowLength(a) != rowLength(b)) {
            throw new ArithmeticException("Unequal row.");
        } else if (columnLength(a) != columnLength(b)) {
            throw new ArithmeticException("Unequal column");
        } else if (isNotMatrix(a) || isNotMatrix(b)) {
            throw new ArithmeticException("Check your input");
        } else {
            double[][] c = new double[a.length][a[0].length];
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[0].length; j++) {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }
            return c;
        }
    }

    public static double[][] subtract(double[][] a, double[][] b) {
        if (rowLength(a) != rowLength(b)) {
            throw new ArithmeticException("Unequal row.");
        } else if (columnLength(a) != columnLength(b)) {
            throw new ArithmeticException("Unequal column");
        } else if (isNotMatrix(a) || isNotMatrix(b)) {
            throw new ArithmeticException("Check your input");
        } else {
            double[][] c = new double[a.length][a[0].length];
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[0].length; j++) {
                    c[i][j] = a[i][j] - b[i][j];
                }
            }
            return c;
        }
    }

    public static double[][] multiplyConstant(double[][] a, double b) {
        if (isNotMatrix(a)) {
            throw new ArithmeticException("Check your input");
        } else {
            double[][] c = new double[a.length][a[0].length];
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[0].length; j++) {
                    c[i][j] = a[i][j] * b;
                }
            }
            return c;
        }
    }

    public static double[][] divideConstant(double[][] a, double b) {
        if (isNotMatrix(a)) {
            throw new ArithmeticException("Check your input");
        } else if (b == 0) {
            throw new ArithmeticException("Divide by 0");
        } else {
            double[][] c = new double[a.length][a[0].length];
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[0].length; j++) {
                    c[i][j] = a[i][j] / b;
                }
            }
            return c;
        }
    }

    public static int rank(double[][] a) {
        throw new RuntimeException("Not yet implemented");
    }
}
