package com.wanxi.scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        //输入多个数字，求平均值和总和，每输入一个数字用回车确认，通过输入非数字来结束输入并输出执行结果
        Scanner scanner = new Scanner(System.in);

//        和
        double sum = 0;
//        计算输入了多少个数字
        int m = 0;
        System.out.println("请输入数字，回车确定，输入非数字字符结束：");
//        通过循环判断是否还有输入，并在里面对每一次进行求和和统计
        while (scanner.hasNextDouble()) {
            double x = scanner.nextDouble();
            m++;
            sum = sum + x;
            System.out.println("你输入了第" + m + "个数据，当前结果sum=" + sum);
        }
        System.out.println(m + "个数的和为" + sum);
        System.out.println(m + "个数的平均值为" + sum / m);


        scanner.close();
    }
}
