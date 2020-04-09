package compute.fibonacci.number;

import java.io.*;

public class ComputeFibonacciNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] fibonacciArr = computeFibonacciSeries();
        int inputNum = Integer.parseInt(reader.readLine().trim());
        writer.write(fibonacciArr[inputNum - 1] + "");
        writer.flush();
    }

    private static int[] computeFibonacciSeries() {
        int[] fibonacciSeries = new int[20];
        fibonacciSeries[0] = 1;
        fibonacciSeries[1] = 1;
        for (int i = 2; i < 20; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }
        return fibonacciSeries;
    }
}
