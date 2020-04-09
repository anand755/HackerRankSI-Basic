package matrix.column.sum;

import java.io.*;
import java.util.Arrays;

public class MatrixColumnSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] matSize = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int rows = matSize[0];
        int cols = matSize[1];

        int[][] inputMat = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            inputMat[i] = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        }

        printColumnWiseSum(rows, cols, inputMat, writer);

        writer.flush();
    }

    //TODO Need to submit
    private static void printColumnWiseSum(int rows, int cols, int[][] inputMat, BufferedWriter writer) throws IOException {
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += inputMat[i][j];
            }
            writer.write(colSum + "\n");
        }
    }
}
