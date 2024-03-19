package 合并字符串;

import java.util.Scanner;

/**
 * ClassName: StringConcat
 * Package: 合并字符串.
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

    public String concat(String operator, Object... strs) {
        String result = "";
        for (int i = 0; i < strs.length; i++) {
            if (i == 0) {
                result += strs[i];
            } else {
                result += (operator + strs[i]);
            }
        }
        return result;
    }
}
