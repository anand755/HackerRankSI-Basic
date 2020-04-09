package magic.square;

import java.io.*;
import java.util.Arrays;

public class MagicSquare {

    private static int cost = Integer.MAX_VALUE;

    private static int[][] inputMat = new int[3][3];

    public static void main(String[] args) throws IOException {
        boolean[] flag = new boolean[10];
        int[] arr = new int[9];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));


        for (int i = 0; i < 3; i++) {
            inputMat[i] = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        }

        magicFunc(arr, flag, 0);

        writer.write(cost + "");
        writer.flush();
    }


    private static void magicFunc(int[] arr, boolean[] flag, int idx) {
        if (idx == 9 && isValid(arr)) {
            if (isValid(arr)) {
                cost = Math.min(cost, getCost(arr, inputMat));
                //printMatrix(arr);
            }
            return;
        }

        for (int i = 1; i <= 9; i++) {
            if (!flag[i]) {
                arr[idx] = i;
                flag[i] = true;
                magicFunc(arr, flag, idx + 1);
                flag[i] = false;
            }
        }

    }

    private static int getCost(int[] arr, int[][] inputMat) {
        int cost = 0;
        int[] inputArr = new int[9];


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inputArr[i * 3 + j] = inputMat[i][j];
            }
        }

        for (int i = 0; i < 9; i++) {
            cost += Math.abs(arr[i] - inputArr[i]);
        }
        return cost;
    }

    private static void printMatrix(int[] arr) {
        System.out.println("Magic Square");
        for (int i = 0; i < 9; i = i + 3) {
            System.out.println(arr[i] + " " + arr[i + 1] + " " + arr[i + 2]);
        }
    }

    private static boolean isValid(int[] arr) {
        return (check(arr, 0, 1) && check(arr, 3, 1) && check(arr, 6, 1) &&
                check(arr, 0, 3) && check(arr, 1, 3) && check(arr, 2, 3)
                && check(arr, 0, 4) && check(arr, 2, 2));
    }

    private static boolean check(int[] arr, int idx, int d) {
        return (arr[idx] + arr[idx + d] + arr[idx + d + d] == 15);
    }
}
