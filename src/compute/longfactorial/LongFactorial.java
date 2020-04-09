package compute.longfactorial;

import java.io.*;

public class LongFactorial {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(reader.readLine().trim());
        long factorial = computeFact(number);
        writer.write(factorial + "");
        writer.flush();
    }

    private static long computeFact(int number) {
        if (number == 0 || number == 1) {
            return 1L;
        }
        return number * computeFact(number - 1);
    }
}
