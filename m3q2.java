//2. Program to multiply two given matrices?  
public class m3q2 {
    public static void main(String[] args) {
        // Define two matrices
        int[][] matrixA = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrixB = {{7, 8}, {9, 10}, {11, 12}};

        // Multiply the matrices and print the result
        int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);
        printMatrix(resultMatrix);
    }

    // Function to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++)
            for (int j = 0; j < colsB; j++)
                for (int k = 0; k < colsA; k++)
                    result[i][j] += A[i][k] * B[k][j];

        return result;
    }

    // Function to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row)
                System.out.print(element + " ");
            System.out.println();
        }
    }
}
