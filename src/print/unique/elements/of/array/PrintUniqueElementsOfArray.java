package print.unique.elements.of.array;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PrintUniqueElementsOfArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int arrLength = Integer.parseInt(reader.readLine());
        int[] arrInput = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        printUniqueElements(arrInput, writer);
        writer.flush();
    }

    //TODO Need to submit
    private static void printUniqueElements(int[] arrInput, BufferedWriter writer) throws IOException {

        Map<Integer, Integer> numberFreqMap = new HashMap<>();

        for (int num : arrInput) {
            int currFreq = numberFreqMap.getOrDefault(num, 0);
            numberFreqMap.put(num, currFreq + 1);
        }

        for (int num : arrInput) {
            if (numberFreqMap.get(num) == 1) {
                writer.write(num + " ");
            }
        }
    }
}
