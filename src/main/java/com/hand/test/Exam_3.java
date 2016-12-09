package com.hand.test;

import java.util.Scanner;

public class Exam_3 {
public static void main(String[] args) {
	int a ,sum = 0;
    boolean leap = false ;
    boolean b = false;
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入年 月 日，以空格隔开：");
    a = scanner.nextInt();
    if(a > 2 && a <= 12)
      b = true;
    if(a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
      leap = true;
    a = scanner.nextInt();
    switch(a){
      case 2 : sum = 31;break;
      case 3 : sum = 59;break;
      case 4 : sum = 90;break;
      case 5 : sum = 120;break;
      case 6 : sum = 151;break;
      case 7 : sum = 181;break;
      case 8 : sum = 212;break;
      case 9 : sum = 243;break;
      case 10 : sum = 273;break;
      case 11 : sum = 304;break;
      case 12 : sum = 334;break;
      default : System.out.println("error");
    }
    a = scanner.nextInt();
    sum += a;
    if(leap && b)
      sum ++;
    System.out.println("您输入的日期是该年第" + sum + "天");

}
}
