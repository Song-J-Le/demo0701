package com.wanxi.Class.demo;

public class Index {
    public static void main(String[] args) {
        demo1 haDiSi = new demo1();//實體化妖怪
        haDiSi.name = "哈迪斯";
        int blood = haDiSi.blood;

        haDiSi.soubBlood(0);
        System.out.println(haDiSi.blood);
    }
}
