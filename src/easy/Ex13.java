package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 13.罗马数字转整数
 */
class Solution13 {
    public int romanToInt(String s) {
        int sum = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            switch (aChar) {
                case 'I':
                    if (i != chars.length - 1) {
                        if (chars[i + 1] == 'V') {
                            sum += 4;
                            i++;
                            break;
                        } else if (chars[i + 1] == 'X') {
                            sum += 9;
                            i++;
                            break;
                        } else {
                            sum += 1;
                            break;
                        }
                    } else {
                        sum += 1;
                        break;
                    }
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    if (i != chars.length - 1) {
                        if (chars[i + 1] == 'L') {
                            sum += 40;
                            i++;
                            break;
                        } else if (chars[i + 1] == 'C') {
                            sum += 90;
                            i++;
                            break;
                        } else {
                            sum += 10;
                            break;
                        }
                    } else {
                        sum += 10;
                        break;
                    }
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    if (i != chars.length - 1) {
                        if (chars[i + 1] == 'D') {
                            sum += 400;
                            i++;
                            break;
                        } else if (chars[i + 1] == 'M') {
                            sum += 900;
                            i++;
                            break;
                        } else {
                            sum += 100;
                            break;
                        }
                    } else {
                        sum += 100;
                        break;
                    }
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
            }
        }
        return sum;
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