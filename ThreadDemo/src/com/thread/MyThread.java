package com.thread;

import java.util.Scanner;

public class MyThread {
    public static void main(String[] args) {
        System.out.println("输入你要输出的线程数");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("线程开始");
        for (int i = 0; i <=a; i++) {
            int sum=(int)Math.round(Math.random()*(5-1)+1);
            Thread tr=new Thread("线程"+i){
                public void run(){
                    try {
                        Thread.sleep(sum*1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(this.getName());
                }
            };
            tr.start();
        }
        System.out.println("线程结束");
    }
}
class aaa{
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        long time = end - begin;
        System.out.println(time + "");
    }
 }
 class bbb {
     public static void main(String[] args) {
         long begin = System.currentTimeMillis();
         String str = "";
         for (int i = 0; i < 10000; i++) {
             str = str + i;
         }
         long end = System.currentTimeMillis();
         long time = end - begin;
         System.out.println(time + "");
     }
 }
class ccc{
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        long time = end - begin;
        System.out.println(time + "");
    }
}