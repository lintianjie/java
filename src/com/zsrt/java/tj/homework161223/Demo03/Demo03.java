package com.zsrt.java.tj.homework161223.Demo03;

import java.util.Scanner;

public class Demo03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个数a");
		int a=sc.nextInt();
		System.out.println("请输入第二个数b");
		int b=sc.nextInt();
		int max=max(a, b);
		sc.close();
		System.out.println(a+"和"+b+"中"+max+"最大");
	}
	/**
	 * 比较两个数的大小，最大值找出
	 * @param a 第一个数
	 * @param b 第二个数
	 */
	public static int max(int a, int b) {
		int max;
		if(a>b){
			max=a;
		}else{
			max=b;
		}
		return max;
	}

}
