package check.armstrong.number;

import java.io.*;

public class CheckArmstrongNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String number = reader.readLine().trim();

        String isArmStrong = checkIfArmStrong(number);
        writer.write(isArmStrong);
        writer.flush();
    }

    private static String checkIfArmStrong(String number) {
        int formedNumber = 0;
        for (char ch : number.toCharArray()) {
            int digit = Integer.parseInt(ch + "");
            formedNumber += digit * digit * digit;
        }

        if (formedNumber==Integer.parseInt(number)){
            return "Yes";
        }else {
            return "No";
        }
    }
}
