package compress.a.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompressAString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputStr = reader.readLine();
        compressStr(inputStr.toCharArray());
    }

    private static void compressStr(char[] inputStr) {
        int currCount = 1;
        char currChar = inputStr[0];
        int pos = 1;
        StringBuilder str = new StringBuilder();

        while (pos < inputStr.length) {
            if (inputStr[pos] == currChar) {
                currCount++;
            } else {
                str.append(currChar).append(currCount);
                currChar = inputStr[pos];
                currCount = 1;
            }
            pos++;
        }
        str.append(currChar).append(currCount);
        System.out.println(str.toString());
    }
}
