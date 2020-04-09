package compute.a.power.b;

import java.io.*;
import java.util.Arrays;

public class ComputeAPowerB {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] AB = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int a = AB[0];
        int b = AB[1];
        long result = computeApowerB(a, b);
        writer.write(result + "");
        writer.flush();
    }

    private static long computeApowerB(int a, int b) {
        long result = 1L;
        while (b-- > 0) {
            result *= a;
        }
        return result;
    }
}
