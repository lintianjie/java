package com.zsrt.java.tj.homework161223.Demo03;

import java.util.Scanner;

public class Demo03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ����a");
		int a=sc.nextInt();
		System.out.println("������ڶ�����b");
		int b=sc.nextInt();
		int max=max(a, b);
		sc.close();
		System.out.println(a+"��"+b+"��"+max+"���");
	}
	/**
	 * �Ƚ��������Ĵ�С�����ֵ�ҳ�
	 * @param a ��һ����
	 * @param b �ڶ�����
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
