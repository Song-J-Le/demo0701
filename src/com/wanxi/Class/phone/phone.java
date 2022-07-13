package com.wanxi.Class.phone;

public class phone {
    //    品牌(brand),价格(price)和颜色(color)
    public String brand;
    public float price;
    public String color;

/*
正在使用价格为3998元黑色的小米手机打电话....
正在使用价格为3998元黑色的小米手机发短信....
*/

    public void callPhone(int type) {
        switch (type) {
            case 0:
                System.out.println("正在使用价格为"+price+"元"+color+"的"+brand+"手机打电话....");
                break;
            case 1:
                System.out.println("正在使用价格为"+price+"元"+color+"的"+brand+"手机打发短信....");
                break;
        }
    }

}
