package triangle.validator;

import java.io.*;
import java.util.Arrays;

public class TriangleValidator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] ABC = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int a = ABC[0];
        int b = ABC[1];
        int c = ABC[2];
        String isTriangle = (a + b > c && b + c > a && c + a > b) ? "Yes" : "No";
        writer.write(isTriangle);
        writer.flush();
    }
}
