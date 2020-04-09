package transpose.matrix;

import java.io.*;
import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] NM = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int rowCount = NM[0];
        int colCount = NM[1];
        int[][] inputMat = new int[rowCount][colCount];
        for (int i = 0; i < rowCount; i++) {
            inputMat[i] = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        }
        printTransposeMat(inputMat, rowCount, colCount, writer);
        writer.flush();
    }

    private static void printTransposeMat(int[][] inputMat, int rowCount, int colCount, BufferedWriter writer) throws IOException {
        for (int i = 0; i < colCount; i++) {
            for (int j = 0; j < rowCount; j++) {
                writer.write(inputMat[j][i] + " ");
            }
            writer.newLine();
        }
    }
}
