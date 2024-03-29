import java.util.Scanner;
/**
 * ClassName: StringConcat
 * Description:
 *
 * @Author gtc
 * @Create 2024/3/20 1:53
 * @Version 1.0
 */
public class StringConcat {
    public static void main(String[] args) {
        StringConcat test = new StringConcat();
        Scanner scanner = new Scanner(System.in);
        //接收链接字符
        System.out.println("请输入想要用来链接的字符");
        String operator = scanner.nextLine();
        //接收拼接字符
        System.out.println("请输入想要用来拼接的字符,用“,”分隔");
        String inputString = scanner.nextLine();
        String[] splitString = inputString.split(",");
        System.out.println(test.concat(operator, (Object[]) splitString));
    }

    /**
     * 使用指定的运算符将多个字符串连接成一个新的字符串。
     * @param operator 连接字符串时使用的运算符。
     * @param str 要连接的字符串数组。
     * @return 连接后的字符串结果。
     */
    public String concat(String operator, Object... str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            if (i == 0) {
                result.append(str[i]);
            } else {
                result.append(operator).append(str[i]);
            }
        }
        return result.toString();
    }
}
