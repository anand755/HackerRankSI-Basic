package prime.or.not;

import java.io.*;
import java.util.Arrays;

public class PrimeOrNot {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int loopMax = (int) Math.sqrt(10E9);
        boolean[] primeBool = new boolean[(int)10E6];
        Arrays.fill(primeBool, true);

        for (int i = 2; i * i < 10E9; i++) {

            for (int j = 2; i * j < 10E9; j++) {

                primeBool[i * j] = false;
            }
        }
        int number = Integer.parseInt(reader.readLine());
        String isPrime = primeBool[number] ? "Yes" : "No";
        writer.write(isPrime);
        writer.flush();
    }
}
