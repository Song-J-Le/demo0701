package com.wanxi.Class.phone.loop;

import java.util.Scanner;

public class YangHuiTriangle {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in) ;
        //获取行号
        int n = sc.nextInt() ;
        for (int i = 1; i <=n ; i++) {
            printNum(i , n);
        }


        long endTime = System.currentTimeMillis() ;
        System.out.println("程序执行时间为："+(endTime-startTime)+"毫秒");
    }

    /*
        按要求打印第i行数字的方法
     */
    private static void printNum(int i , int n) {
        for (int j = n-i; j > 0; j--) {
            System.out.print("  ");
        }
        for(int k = 1 ; k <= i ; k++ ){
            System.out.print(getNumber(i , k)+"   ");
        }
        System.out.println();
    }

    /*
        获取第i行第j列数字(递归实现)的方法
     */
    private static int getNumber(int i , int j ) {
        if(j==1||j==i){
            return 1 ;
        }else{
            return  getNumber(i-1 , j-1 )+getNumber(i-1 , j );
        }

    }
}
