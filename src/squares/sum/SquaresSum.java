package squares.sum;

import java.io.*;

public class SquaresSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        long number = Integer.parseInt(reader.readLine().trim());
        long sqrResult = (number * (number + 1) * (2*number+1)) / 6;
        writer.write(sqrResult + "");
        writer.flush();
    }
}
