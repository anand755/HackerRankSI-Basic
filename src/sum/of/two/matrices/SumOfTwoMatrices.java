package sum.of.two.matrices;

import java.io.*;
import java.util.Arrays;

public class SumOfTwoMatrices {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] matSize = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int N = matSize[0];
        int M = matSize[1];
        int[][] inputBothMat = new int[2 * N][M];

        for (int i = 0; i < 2 * N; i++) {
            inputBothMat[i] = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        }

        printSumOfTwoMatrix(inputBothMat, N, M, writer);

        writer.flush();
    }

    private static void printSumOfTwoMatrix(int[][] inputBothMat, int N, int M, BufferedWriter writer) throws IOException {
        int[][] sumMat = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sumMat[i][j] = inputBothMat[i][j] + inputBothMat[i + N][j];
                writer.write(sumMat[i][j] + " ");
            }
            writer.newLine();
        }
    }
}
