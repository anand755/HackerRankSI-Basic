package max.element.in.the.array;

import java.io.*;
import java.util.Arrays;

public class MaxElementInTheArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int arrLength = Integer.parseInt(reader.readLine());
        int[] arrInput = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int maxElement = getMaxElement(arrInput, arrLength);
        writer.write(maxElement + "");
        writer.flush();
    }

    private static int getMaxElement(int[] arrInput, int arrLength) {
        int maxValue = Integer.MIN_VALUE;
        for (int num : arrInput) {
            maxValue = Math.max(maxValue, num);
        }
        return maxValue;
    }
}
