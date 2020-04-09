package find.duplicate.element.in.array;

import java.io.*;
import java.util.Arrays;

public class FindDuplicateElementInArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int arrLength = Integer.parseInt(reader.readLine());
        int[] arrInput = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();

        int ans = getDuplicateElement(arrInput, arrLength);
        writer.write(ans + "\n");
        writer.flush();
    }

    private static int getDuplicateElement(int[] arrInput, int arrLength) {
        int duplicateNum = 0;
        Arrays.sort(arrInput);
        for (int i = 0; i < arrLength - 1; i++) {
            if (arrInput[i] == arrInput[i + 1]) {
                duplicateNum = arrInput[i];
            }
        }
        return duplicateNum;
    }
}
