package cubes.sum;

import java.io.*;

public class CubesSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        long number = Integer.parseInt(reader.readLine().trim());
        long result = (number * (number + 1)) / 2;
        long cubeResult = result * result;
        writer.write(cubeResult + "");
        writer.flush();
    }
}
