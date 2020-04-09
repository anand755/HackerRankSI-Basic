package check.bit;

import java.io.*;

public class CheckBit {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] NI = reader.readLine().split("\\s");

        long number = Long.parseLong(NI[0]);
        int index = Integer.parseInt(NI[1]);
        boolean isSet = checkBit(number, index);
        writer.write(isSet + "");
        writer.flush();
    }

    private static boolean checkBit(long number, int index) {
        return ((number & (1L << index)) == (1L << index));
    }
}
