package com.zsrt.java.tj.homework161223.Demo04;

import java.util.Scanner;

public class Demo04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������Ҫ�жϵĳɼ�(A,B,C,D)");
		String cj=sc.next();
		String results=results(cj);
		sc.close();
		if(results=="���������Զ��˳�"){
			System.out.println(results);
		}else{
		System.out.println("�ɼ�Ϊ"+results);
		}
	}

	/**
	 * �жϳɼ������ĸ����
	 * @param cj ����ĳɼ�
	 */
	public static String results(String cj) {
		if(cj=="A"){
			return "����";
		}else if(cj=="B"){
			return "����";
		}else if(cj=="C"){
			return "�ϸ�";
		}else if(cj=="D"){
			return "������";
		}else{
			return "���������Զ��˳�";
		}
	}
}
