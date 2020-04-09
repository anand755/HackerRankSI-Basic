package number.of.multiples;

import java.io.*;

public class NumberOfMultiples {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        long range = Long.parseLong(reader.readLine().trim());
        long outCount = (range / 3 + range / 5 - range / 15);
        writer.write(outCount + "");
        writer.flush();
    }
}
