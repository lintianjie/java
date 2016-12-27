package com.zsrt.java.tj.homework161223.Demo02;

import java.util.Scanner;

public class Demo02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个数a");
		int a=sc.nextInt();
		System.out.println("请输入第二个数b");
		int b=sc.nextInt();
		contrast(a, b);
		System.out.println("两个数从小到大排列为"+a+","+b);
		sc.close();
	}
	/**
	 * 比较两个数的大小，并将大的值赋给a
	 * @param a 第一个数
	 * @param b 第二个数
	 */
	public static void contrast(int a, int b) {
		int c;
		System.out.println("a="+a+",b="+b);
		if(a>b){
			System.out.println("a大于b");
			c=a;
			a=b;
			b=c;
		}else{
			System.out.println("a小于b");
		}
	}

}
