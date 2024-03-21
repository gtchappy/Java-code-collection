/**
 * ClassName: UniqueNumberGenerator
 * Description:
 *
 * @Author gtc
 * @Create 2024/3/20 2:01
 * @Version 1.0
 */
public class UniqueNumberGenerator {
    public static void main(String[] args) {
        //待生成10个数字
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            //生成范围为1~10的数字
            arr[i] = (int) (Math.random() * 10 + 1);
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }
                if (arr[i] == arr[j]) {
                    i -= 1;
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
