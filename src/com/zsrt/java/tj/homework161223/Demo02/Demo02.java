package com.zsrt.java.tj.homework161223.Demo02;

import java.util.Scanner;

public class Demo02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ����a");
		int a=sc.nextInt();
		System.out.println("������ڶ�����b");
		int b=sc.nextInt();
		contrast(a, b);
		System.out.println("��������С��������Ϊ"+a+","+b);
		sc.close();
	}
	/**
	 * �Ƚ��������Ĵ�С���������ֵ����a
	 * @param a ��һ����
	 * @param b �ڶ�����
	 */
	public static void contrast(int a, int b) {
		int c;
		System.out.println("a="+a+",b="+b);
		if(a>b){
			System.out.println("a����b");
			c=a;
			a=b;
			b=c;
		}else{
			System.out.println("aС��b");
		}
	}

}
