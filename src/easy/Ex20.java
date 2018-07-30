package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Solution20 {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        if (s.length() == 0) {
            return true;
        }
        if (chars[0] == '(' || chars[0] == '{' || chars[0] == '[') {
            Stack<String> stack = new Stack<>();
            for (char aChar : chars) {
                if (aChar == '(') {
                    stack.push("a");
                } else if (aChar == '{') {
                    stack.push("b");
                } else if (aChar == '[') {
                    stack.push("c");
                } else if (aChar == ')') {
                    if (!stack.empty() && stack.peek().equals("a")) {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else if (aChar == '}') {
                    if (!stack.empty() && stack.peek().equals("b")) {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else if (aChar == ']') {
                    if (!stack.empty() && stack.peek().equals("c")) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
            return stack.empty();
        } else {
            return false;
        }
    }
}

public class Ex20 {
    public static String stringToString(String input) {
        if (input == null) {
            return "null";
        }
        return input.substring(1, input.length() - 1);
    }

    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String s = stringToString(line);

            boolean ret = new Solution20().isValid(s);

            String out = booleanToString(ret);

            System.out.print(out);
        }
    }
}