/*
package chuangjian.demo01;

import java.util.Scanner;

public class 求素数 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入整数");

        boolean flag=true;

        int number=sc.nextInt();
        int k=number/2;
        for (int i=2;i<=k;i++) {
            if (number % i == 0) {
                flag = false;
                System.out.println(number + "不是素数");
                break;

            }
        }
        if (flag==true){
            System.out.println("flag语句判断"+number+"是素数");

        }
        else {
            System.out.println("flag语句判断"+number+"不是素数");
        }

    }
}
*/
