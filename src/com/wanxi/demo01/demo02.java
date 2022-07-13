package com.wanxi.demo01;

public class demo02 {
    public static void main(String[] args) {

//        pig();
//        money();
//        run();
//        triangle();
//        t2(10);
    }

    //     1949年到2019年中所有是猪年的年份
    public static void pig() {

        int x = 1949;
        int y = 2019;
        for (int z; x < y; ) {
            z = y - 12;
            y = z;
            if (x <= y)
                System.out.println(y);
        }
        System.out.println("===========================");
    }


    public static void triangle() {

        /*直角三角形--1*/
//        int x, y;
//        for (x = 0; x < 5; x++) {
//            for (y = 0; y <= x; y++) {
//                System.out.print("@");
//            }
//            System.out.println();
//        }

//        @
//        @@
//        @@@
//        @@@@
//        @@@@@

        /*直角三角形--2*/

//        int x, y;
//        for (x = 5; x > 0; x--) {
//            for (y = 0; y < x; y++) {
//                System.out.print("@");
//            }
//            System.out.println();
//        }

//@@@@@
//@@@@
//@@@
//@@
//@

        /*直角三角形--3*/

//        int x, y;
//        for (x = 1; x <= 5; x++) {
//            for (y = 5; y > x; y--) {
//                System.out.print(" ");
//            }
//            for (int z = 0; z < x; z++) {
//                System.out.print("@");
//            }
//            System.out.println();
//        }

//    @
//   @@
//  @@@
// @@@@
//@@@@@

        /*直角三角形--4*/

        int x, y;
        for (x = 0; x <= 5; x++) {
            for (y = 0; y < x; y++) {
                System.out.print(" ");
            }
            for (int z = 5; z > x; z--) {
                System.out.print("@");
            }
            System.out.println();
        }
        System.out.println("===========================");
    }
//         @@@@@
//          @@@@
//           @@@
//            @@
//             @

    public static void t2(int num) {
        int x, y;
        for (x = 1; x <= num; x++) {
            for (y = 0; y < x; y++) {
                if (y == x - 1 || y == 0 || x == num) {
                    System.out.print("@");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("===========================");
    }


//        @
//        @@
//        @ @
//        @  @
//        @@@@@


    //        小明手中有一张10元纸币。需要到商店兑换零钱。商店只有1元纸币和5角硬币。那么请列举出所有的兑换方式。
    public static void money() {

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 20; j++) {
                if (i * 10 + j * 5 == 100) {
                    System.out.println(i + "个1元纸币" + "和" + j + "个5角硬币");
                    System.out.println("===========================");
                }
            }
        }
    }

    //中国有闰年的说法。闰年的规则是：四年一闰，百年不闰，四百年再闰。
// （年份能够被4整除但不能被100整除算是闰年，年份能被400整除也是闰年）。请打印出1988年到2019年的所有闰年年份。
    public static void run() {
        int a;
        for (a = 1988; a < 2019; a++) {
            if (a % 400 == 0 || a % 4 == 0 && a % 100 != 0) {
                System.out.println(a);
            }
        }
        System.out.println("===========================");

    }


}

