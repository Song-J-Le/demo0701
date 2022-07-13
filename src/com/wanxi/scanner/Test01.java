package com.wanxi.scanner;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int m = 0;
        while (scanner.hasNextDouble()) {
            double x = scanner.nextDouble();
            m++;
            sum = sum + x;
        }
        System.out.print(sum +"\t" );
        System.out.println(sum/m);


        scanner.close();
    }
}
