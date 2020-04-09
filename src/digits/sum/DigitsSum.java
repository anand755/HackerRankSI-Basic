package digits.sum;

import java.io.*;

public class DigitsSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String strNumber = reader.readLine();
        int sum = getSumOfDigits(strNumber.toCharArray());
        writer.write(sum + "");
        writer.flush();
    }

    private static int getSumOfDigits(char[] strNumber) {
        int sum = 0;
        for (char digit : strNumber) {
            sum += Integer.parseInt(digit + "");
        }
        return sum;
    }
}
