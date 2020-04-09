package compute.n.factorial;

import java.io.*;

public class ComputeNFactorial {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(reader.readLine().trim());
        int factorial = computeFact(number);
        writer.write(factorial + "");
        writer.flush();
    }

    private static int computeFact(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * computeFact(number - 1);
    }
}
