package com.zsrt.java.tj.homework161226.Demo01;

import java.util.Scanner;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class Computer {

	public static void main(String[] args) {
		computer();
	}

	/**
	 * ������֮��ļ�����
	 * a ��һ����
	 * b �ڶ�����
	 * st �����
	 */
	public static void computer() {
		Scanner sc=new Scanner(System.in);
		int result=0;
		while (true){
		System.out.println("�����������������quit�˳�����");
		String st=sc.next();
		if(st.equals("quit")){
			System.out.println("�ɹ��˳�");
			break;
		}
		System.out.println("�������һ������");
		int a=sc.nextInt();
		System.out.println("������ڶ�������");
		int b=sc.nextInt();
		switch(st){
			case "+":
				result = sum(a, b);
				break;
			case "-":
				result = sub(a, b);
				break;
			case "*":
				result = multiplication(a, b);
				break;
			case "/":
				result = division(a, b);
				break;
			case "%":
				result = modulus(a, b);
				break;
			default:
				System.out.println("������������������");
				break;
		}
		System.out.println(a+st+b+"="+result);
		}
		sc.close();
	}

	/**
	 * �ӷ�����
	 * @param a ����
	 * @param b ������
	 * @return ��
	 */
	public static int modulus(int a, int b) {
		int result;
		result=a%b;
		return result;
	}

	/**
	 * ��������
	 * @param a ����
	 * @param b ������
	 * @return ��
	 */
	public static int division(int a, int b) {
		int result;
		result=a/b;
		return result;
	}

	/**
	 * �˷�����
	 * @param a ����
	 * @param b ������
	 * @return ��
	 */
	public static int multiplication(int a, int b) {
		int result;
		result=a*b;
		return result;
	}

	/**
	 * ��������
	 * @param a ����
	 * @param b ������
	 * @return ��
	 */
	public static int sub(int a, int b) {
		int result;
		result=a-b;
		return result;
	}

	/**
	 * ��ģ����
	 * @param a ��һ����
	 * @param b �ڶ�����
	 * @return ���
	 */
	public static int sum(int a, int b) {
		int result;
		result=a+b;
		return result;
	}
}
