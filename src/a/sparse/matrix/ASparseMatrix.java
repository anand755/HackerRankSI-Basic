package a.sparse.matrix;

import java.io.*;
import java.util.Arrays;

public class ASparseMatrix {
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
        String isSparseMat = checkSparseMat(inputMat, rowCount, colCount);
        writer.write(isSparseMat);
        writer.flush();
    }

    private static String checkSparseMat(int[][] inputMat, int rowCount, int colCount) {

        int thresoldVal = (rowCount * colCount) / 2;
        int zeroCount = 0;

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (inputMat[i][j] == 0) {
                    zeroCount++;
                    if (zeroCount > thresoldVal) {
                        return "Yes";
                    }
                }
            }
        }
        return "No";
    }
}
