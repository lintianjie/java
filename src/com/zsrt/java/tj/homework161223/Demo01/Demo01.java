package com.zsrt.java.tj.homework161223.Demo01;

import java.util.Scanner;

public class Demo01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int in=sc.nextInt();
		String st=panduan(in);
		System.out.println(in+"是"+st);
		sc.close();
	}
	/**
	 * 判断输入年份是否为闰年
	 * @param x 输入的年份
	 */
	public static String panduan(int x) {
		if(x%400==0){
			return "闰年";
		}else if(x%4==0&&x%100!=0){
			return "闰年";
		}else{
			return "不是闰年";
		}
	}

}
