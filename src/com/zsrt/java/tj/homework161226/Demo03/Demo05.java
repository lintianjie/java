package com.zsrt.java.tj.homework161226.Demo03;

public class Demo05 {

	public static void main(String[] args) {
		String cj="A";
		results(cj);
	}

	/**
	 * �жϳɼ������ĸ����
	 * @param cj ����ĳɼ�
	 */
	public static void results(String cj) {
		switch (cj) {
		case "A":
			System.out.println("��ѧ���ɼ�����");
			break;
		case "B":
			System.out.println("��ѧ���ɼ�����");
			break;
		case "C":
			System.out.println("��ѧ���ɼ�һ��");
			break;
		case "D":
			System.out.println("��ѧ���ɼ�������");
			break;
		default:
			System.out.println("��������");
			break;
		}
	}
}
