package com.zsrt.java.tj.homework161223.Demo01;

import java.util.Scanner;

public class Demo01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int in=sc.nextInt();
		String st=panduan(in);
		System.out.println(in+"��"+st);
		sc.close();
	}
	/**
	 * �ж���������Ƿ�Ϊ����
	 * @param x ��������
	 */
	public static String panduan(int x) {
		if(x%400==0){
			return "����";
		}else if(x%4==0&&x%100!=0){
			return "����";
		}else{
			return "��������";
		}
	}

}
