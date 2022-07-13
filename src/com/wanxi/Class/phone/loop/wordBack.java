package com.wanxi.Class.phone.loop;
import java.util.Scanner;
public class wordBack {
    public static  void main(String args[]){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();          //输入一个字符串
        if(isPalindrome(str,0)){
            System.out.println("字符串 " + str + "是回文串");
        }else{
            System.out.println("字符串 " + str +"不是回文串");
        }
    }

    public static boolean isPalindrome(String str,int index){
//            System.out.println(str.charAt(0) + "  " + str.charAt(str.length() - 1));
        if(str.charAt(0) == str.charAt(str.length() - 1)){
            if(str.length() > 2){
                return isPalindrome(str.substring(index+1,str.length()-1),0);
            }else return true;

        }else return false;

    }
}
