package com.zsrt.java.tj.homework161226.Demo03;

import java.util.Scanner;

public class Demo061 {
	public static void main(String[] args) {
		computer();
	}
	/**
	 * �����������ּ�ļ�����
	 * a ��һ����
	 * b �ڶ�����
	 * st �����
	 */
	public static void computer() {
		int result = 0;
		Scanner sc=new Scanner(System.in);
		while (true){
		System.out.println("�����������,����quit�˳�");
		String st=sc.next();
		if(st.equals("quit")){
			break;
		}
		System.out.println("�������һ����");
		int a=sc.nextInt();
		System.out.println("������ڶ�����");
		int b=sc.nextInt();
		switch (st) {
		case "+":
			result=a+b;
			break;
		case "-":
			result=a-b;
			break;
		case "*":
			result=a*b;
			break;
		case "/":
			result=a/b;
			break;
		case "%":
			result=a%b;
			break;
		default:
			System.out.println("������������������");
			break;
		}
		System.out.println("���Ϊ"+result);
		}
		sc.close();
	}
}
