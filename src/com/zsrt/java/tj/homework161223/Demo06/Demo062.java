package com.zsrt.java.tj.homework161223.Demo06;

import java.util.Scanner;

public class Demo062 {
	public static void main(String[] args) {
		computer();
	}

	/**
	 * ����������֮��ļ�����
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
		if(st.equals("+")){
			result=a+b;
		}else if(st.equals("-")){
			result=a-b;
		}else if(st.equals("*")){
			result=a*b;
		}else if(st.equals("/")){
			result=a/b;
		}else if(st.equals("%")){
			result=a%b;
		}else{
			System.out.println("���������Զ��˳�");
			break;
		}
		System.out.println("���Ϊ"+result);
		}
		sc.close();
	}
}
