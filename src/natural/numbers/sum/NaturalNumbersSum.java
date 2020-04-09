package natural.numbers.sum;

import java.io.*;

public class NaturalNumbersSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        long number = Integer.parseInt(reader.readLine().trim());
        long result = (number * (number + 1)) / 2;
        writer.write(result + "");
        writer.flush();
    }
}
