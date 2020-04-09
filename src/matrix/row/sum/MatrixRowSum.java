package matrix.row.sum;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;

public class MatrixRowSum {
    //ToDo Need to Submit
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

        printRowWiseSum(rows, cols, inputMat, writer);
        writer.flush();
    }

    private static void printRowWiseSum(int rows, int cols, int[][] inputMat, BufferedWriter writer) throws IOException {
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += inputMat[i][j];
            }
            writer.write(rowSum + "\n");
        }
    }
}
