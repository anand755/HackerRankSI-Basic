package sum.of.all.odd.elements;

import java.io.*;
import java.util.Arrays;

public class SumOfAllOddElements {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int arrLength = Integer.parseInt(reader.readLine());
        int[] arrInput = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();

        long totalSum = getSumOfOddElements(arrInput, arrLength);
        writer.write(totalSum + "\n");
        writer.flush();
    }

    private static long getSumOfOddElements(int[] arrInput, int arrLength) {

        long sum = 0L;
        for (int num : arrInput) {
            sum += num % 2 == 0 ? 0 : num;
        }
        return sum;
    }
}
