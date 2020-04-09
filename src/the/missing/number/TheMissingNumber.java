package the.missing.number;

import java.io.*;
import java.util.Arrays;

public class TheMissingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arrInput = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int missingNumber = findMissingNumber(arrInput);
        writer.write(missingNumber+"");
        writer.flush();

    }

    private static int findMissingNumber(int[] arrInput) {
        int arrXor = 0;
        int naturalXor = 100;
        for (int i = 1; i <= 99; i++) {
            arrXor = arrXor ^ arrInput[i - 1];
            naturalXor = naturalXor ^ i;
        }
        return arrXor ^ naturalXor;
    }
}
