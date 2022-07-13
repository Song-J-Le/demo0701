package com.wanxi.Class.demo;

public class demo1 {
    public int blood = 100;
    public String name;

    public void soubBlood(int type) {
        switch (type) {
            case 0:
                blood = blood - 30;
                break;
            case 1:
                blood = blood - 20;
                break;


        }
    }
}