package com.zsrt.java.tj.homework161226.Demo02;

import java.util.Scanner;

public class computer {

	public static void main(String[] args) {
		computer();
	}

	/**
	 * ������֮��ļ�����
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
			System.out.println("���������Զ��˳�");
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
