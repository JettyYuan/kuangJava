/* 实现循环交互式的加减乘除计算机（两个参数）
 * @Author: Jetty 
 * @Date: 2022-09-13 22:07:19 
 * @Last Modified by: Jetty
 * @Last Modified time: 2022-09-13 22:08:00
 */
package Demo5;

import java.util.*;

public class Demo5 {
    public static void main(String[] args) {
        double x;
        double y;
        System.out.print("请选择计算方式(输入Q退出): ");
        Scanner in = new Scanner(System.in);
        char ch = (in.next()).charAt(0);
        while (ch != 'Q') {
            switch (ch) {
                case '+' -> {
                    System.out.println("输入需要运算符的两个数字: ");
                    x = in.nextDouble();
                    y = in.nextDouble();
                    System.out.println("运算结果为: " + addition(x, y));
                }
                case '-' -> {
                    System.out.println("输入需要运算符的两个数字: ");
                    x = in.nextDouble();
                    y = in.nextDouble();
                    System.out.println("运算结果为: " + subtraction(x, y));
                }
                case '*' -> {
                    System.out.println("输入需要运算符的两个数字: ");
                    x = in.nextDouble();
                    y = in.nextDouble();
                    System.out.println("运算结果为: " + multiplication(x, y));
                }
                case '/' -> {
                    System.out.println("输入需要运算符的两个数字: ");
                    x = in.nextDouble();
                    y = in.nextDouble();
                    if (y == 0) {
                        System.out.println("分母不能为0!");
                    } else {
                        System.out.println("运算结果为: " + divisionMethod(x, y));
                    }
                }
            }
            System.out.print("请选择计算方式(输入Q退出): ");
            ch = (in.next()).charAt(0);
        }
        System.out.println("程序已终止");
        in.close();
    }

    public static double addition(double x, double y) {
        return x + y;
    }

    public static double subtraction(double x, double y) {
        return x - y;
    }

    public static double multiplication(double x, double y) {
        return x * y;
    }

    public static double divisionMethod(double x, double y) {
        return x / y;
    }
}
