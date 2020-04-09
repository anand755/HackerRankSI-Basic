package narcissistic.numbers;

import java.io.*;

public class NarcissisticNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String number = reader.readLine().trim();
        String isNarcissistNumber = checkNarcissistNumber(number);
        writer.write(isNarcissistNumber);
        writer.flush();
    }

    private static String checkNarcissistNumber(String number) {
        int formedNumber = 0;
        int power = number.length();

        for (char ch : number.toCharArray()) {
            int digit = Integer.parseInt(ch + "");
            formedNumber += Math.pow(digit, power);
        }
        if (formedNumber == Integer.parseInt(number)) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
