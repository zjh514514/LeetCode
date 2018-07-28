import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 7.反转整数
 */
class Solution7 {
    public int reverse(int x) {
        String strX = Integer.toString(x);
        if (x < 0) {
            strX = strX.substring(1);
        }
        strX = new StringBuilder(strX).reverse().toString();
        long result = Long.parseLong(strX);
        if (x < 0) {
            result = -result;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) result;
        }
    }
}

public class Ex7 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);

            int ret = new Solution7().reverse(x);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }
}
