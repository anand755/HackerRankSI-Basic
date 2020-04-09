package reverse.array;

import java.io.*;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int arrLength = Integer.parseInt(reader.readLine());
        long[] arrInput = Arrays.stream(reader.readLine().split("\\s")).mapToLong(Long::parseLong).toArray();

        printArrayInReverse(arrInput, arrLength - 1, writer);
        writer.flush();
    }

    private static void printArrayInReverse(long[] arrInput, int index, BufferedWriter writer) throws IOException {
        if (index < 0) {
            return;
        }
        writer.write(arrInput[index] + " ");
        printArrayInReverse(arrInput, index - 1, writer);
    }
}
