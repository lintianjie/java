package com.zsrt.java.tj.homework161226.Demo02;

import java.util.Scanner;

public class computer {

	public static void main(String[] args) {
		computer();
	}

	/**
	 * 两个数之间的简单运算
	 */
	public static void computer() {
		Scanner sc=new Scanner(System.in);
		int result=0;
		while (true){
		System.out.println("请输入运算符，输入quit退出计算");
		String st=sc.next();
		if(st.equals("quit")){
			System.out.println("成功退出");
			break;
		}
		System.out.println("请输入第一个数字");
		int a=sc.nextInt();
		System.out.println("请输入第二个数字");
		int b=sc.nextInt();
		if(st.equals("+")){
			result = sum(a, b);
		}else if(st.equals("-")){
			result = sub(a, b);
		}else if(st.equals("*")){
			result = multiplication(a, b);
		}else if(st.equals("/")){
			result = division(a, b);
		}else if(st.equals("%")){
			result = modulus(a, b);
		}else{
			System.out.println("输入有误，自动退出");
			break;
		}
		System.out.println(a+st+b+"="+result);
		}
		sc.close();
	}

	/**
	 * 加法运算
	 * @param a 加数
	 * @param b 被加数
	 * @return 和
	 */
	public static int modulus(int a, int b) {
		int result;
		result=a%b;
		return result;
	}

	/**
	 * 减法运算
	 * @param a 减数
	 * @param b 被减数
	 * @return 差
	 */
	public static int division(int a, int b) {
		int result;
		result=a/b;
		return result;
	}

	/**
	 * 乘法运算
	 * @param a 乘数
	 * @param b 被乘数
	 * @return 积
	 */
	public static int multiplication(int a, int b) {
		int result;
		result=a*b;
		return result;
	}

	/**
	 * 除法运算
	 * @param a 除数
	 * @param b 被除数
	 * @return 商
	 */
	public static int sub(int a, int b) {
		int result;
		result=a-b;
		return result;
	}

	/**
	 * 求模运算
	 * @param a 第一个数
	 * @param b 第二个数
	 * @return 结果
	 */
	public static int sum(int a, int b) {
		int result;
		result=a+b;
		return result;
	}

}
