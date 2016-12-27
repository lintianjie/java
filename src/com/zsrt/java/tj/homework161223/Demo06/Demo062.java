package com.zsrt.java.tj.homework161223.Demo06;

import java.util.Scanner;

public class Demo062 {
	public static void main(String[] args) {
		computer();
	}

	/**
	 * 进行两个数之间的简单运算
	 * a 第一个数
	 * b 第二个数
	 * st 运算符
	 */
	public static void computer() {
		int result = 0;
		Scanner sc=new Scanner(System.in);
		while (true){
		System.out.println("请输入运算符,输入quit退出");
		String st=sc.next();
		if(st.equals("quit")){
			break;
		}
		System.out.println("请输入第一个数");
		int a=sc.nextInt();
		System.out.println("请输入第二个数");
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
			System.out.println("输入有误，自动退出");
			break;
		}
		System.out.println("结果为"+result);
		}
		sc.close();
	}
}
