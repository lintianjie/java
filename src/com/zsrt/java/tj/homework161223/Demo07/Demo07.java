package com.zsrt.java.tj.homework161223.Demo07;

import java.util.Scanner;

public class Demo07 {

	public static void main(String[] args) {
		quict();
	}
	/**
	 * �����Զ��Զ�����
	 */
	public static void quict() {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������Զ���������");
		int st=sc.nextInt();
		switch (st) {
		case 1:
			System.out.println("���ְֵĺ�");
			break;
		case 2:
			System.out.println("������ĺ�");
			break;
		case 3:
			System.out.println("��үү�ĺ�");
			break;
		case 4:
			System.out.println("�����̵ĺ�");
			break;
		default:
			System.out.println("��û���趨�˿�ݲ�������");
			break;
		}
		sc.close();
	}

}
