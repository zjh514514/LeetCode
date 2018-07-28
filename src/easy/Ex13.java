package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution13 {
    public int romanToInt(String s) {

    }
}

public class Ex13 {
    public static String stringToString(String input) {
        if (input == null) {
            return "null";
        }
        return input;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String s = stringToString(line);

            int ret = new Solution13().romanToInt(s);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }
}