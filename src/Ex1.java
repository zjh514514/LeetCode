import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 1.两数之和
 */
class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        /**
         * 一遍hash表
         */
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");

        /**
         * 两遍hash表
         */
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], i);
//        }
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            if (map.containsKey(complement) && map.get(complement) != i) {
//                return new int[] { i, map.get(complement) };
//            }
//        }
//        throw new IllegalArgumentException("No two sum solution");
//    }
        /**
         * 粗暴解
         */
//        int a, b;
//        int[] result = new int[2];
//        for (int i = 0; i < nums.length - 1; i++) {
//            a = nums[i];
//            for (int j = i + 1; j < nums.length; j++) {
//                b = nums[j];
//                if (a + b == target) {
//                    result[0] = i;
//                    result[1] = j;
//                    System.out.println("i:" + i + "j:" + j);
//                    return result;
//                }
//            }
//        }
//        return result;
//    }
    }
}

public class Ex1 {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for (int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }

        String result = "";
        for (int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static String integerArrayToString(int[] nums) {
        return integerArrayToString(nums, nums.length);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        long startTime = System.currentTimeMillis();   //获取开始时间
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);
            line = in.readLine();
            int target = Integer.parseInt(line);

            int[] ret = new Solution1().twoSum(nums, target);

            String out = integerArrayToString(ret);

            System.out.print(out);

            long endTime = System.currentTimeMillis(); //获取结束时间

            System.out.println("程序运行时间： " + (endTime - startTime) / 1000 + "ms");
        }
    }
}