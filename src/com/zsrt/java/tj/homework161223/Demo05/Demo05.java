package com.zsrt.java.tj.homework161223.Demo05;

import java.util.Scanner;

public class Demo05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������ɼ�(A,B,C,D)");
		String cj=sc.next();
		String results=results(cj);
		sc.close();
		if(results.equals("��������")){
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
		switch (cj) {
		case "A":
			return "��ѧ���ɼ�����";
		case "B":
			return "��ѧ���ɼ�����";
		case "C":
			return "��ѧ���ɼ�һ��";
		case "D":
			return "��ѧ���ɼ�������";
		default:
			return "��������";
		}
	}
}
