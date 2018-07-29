package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 14.最长公共前缀
 */
class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder start = new StringBuilder();
        if (strs.length > 1) {
            char[] char1 = strs[0].toCharArray();
            char[] char2 = strs[1].toCharArray();
            int length = char1.length > char2.length ? char2.length : char1.length;
            for (int a = 0; a < length; a++) {
                if (char1[a] == char2[a]) {
                    start.append(char1[a]);
                } else {
                    break;
                }
            }
            String startStr = start.toString();
            for (int i = 2; i < strs.length; i++) {
                if (startStr.length() == 0) {
                    break;
                }
                while (!strs[i].startsWith(startStr)) {
                    startStr = startStr.substring(0, startStr.length() - 1);
                }
            }
            return startStr;
        } else if (strs.length == 1) {
            return strs[0];
        } else {
            return start.toString();
        }
    }
}

public class Ex14 {
    public static String[] stringToStringArray(String input) {
        input = input.substring(1, input.length() - 1);
        String[] arr = input.split(",");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].substring(1, arr[i].length() - 1);
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String[] strs = stringToStringArray(line);

            String out = (new Solution14().longestCommonPrefix(strs));

            System.out.print(out);
        }
    }
}