/* 分别计算并输出0-100奇数和偶数的和
 * @Author: Jetty 
 * @Date: 2022-09-13 20:02:47 
 * @Last Modified by: Jetty
 * @Last Modified time: 2022-09-13 20:09:48
 */
package Demo1;

public class Demo1 {
    public static void main(String[] args) {
        int oddsum = 0;
        int evensum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                evensum += i;
            } else {
                oddsum += i;
            }
        }
        System.out.println("奇数和为：" + oddsum);
        System.out.println("偶数和为：" + evensum);
    }
}
