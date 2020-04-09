package compute.area.of.rectangle;

import java.io.*;
import java.util.Arrays;

public class ComputeAreaOfRectangle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        long[] LB = Arrays.stream(reader.readLine().split("\\s")).mapToLong(Long::parseLong).toArray();
        long area = LB[0] * LB[1];
        writer.write(area + "");
        writer.flush();
    }
}
