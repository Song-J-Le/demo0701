package com.wanxi.demo2;

public class AppLication {
    public static void main(String[] args) {
        Student student = new Student();
        Student xm = new Student();
        Student xh = new Student();

        xm.name = "小明";
        xh.name = "小红";
        xm.age = 8;
        xh.age = 9;
        System.out.println(xm.name);
        System.out.println(xm.age);
        System.out.println();
    }
}
