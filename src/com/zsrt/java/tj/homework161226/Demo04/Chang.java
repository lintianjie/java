package com.zsrt.java.tj.homework161226.Demo04;

import java.util.Scanner;

public class Chang {

	public static void main(String[] args) {
		cha();
	}

	/**
	 * �鿴һ�����ĸ�λ������������ĵ���
	 */
	public static void cha() {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ����������λ��������");
		int in=sc.nextInt();
		if(in>=10000){
			System.out.println("���������һ����λ��");
			System.out.println("���ĸ�λ����"+gewei(in));
			System.out.println("����ʮλ����"+shiwei(in));
			System.out.println("���İ�λ����"+baiwei(in));
			System.out.println("����ǧλ����"+qianwei(in));
			System.out.println("������λ����"+wanwei(in));
			int dao=dao(gewei(in),shiwei(in),baiwei(in),
					qianwei(in),wanwei(in));
			System.out.println("���ĵ�����"+dao);
		}else if(in>=1000){
			System.out.println("���������һ����λ��");
			System.out.println("���ĸ�λ����"+gewei(in));
			System.out.println("����ʮλ����"+shiwei(in));
			System.out.println("���İ�λ����"+baiwei(in));
			System.out.println("����ǧλ����"+qianwei(in));
			int dao=dao(gewei(in),shiwei(in),baiwei(in),qianwei(in));
			System.out.println("���ĵ�����"+dao);
		}else if(in>=100){
			System.out.println("���������һ����λ��");
			System.out.println("���ĸ�λ����"+gewei(in));
			System.out.println("����ʮλ����"+shiwei(in));
			System.out.println("���İ�λ����"+baiwei(in));
			int dao=dao(gewei(in),shiwei(in),baiwei(in));
			System.out.println("���ĵ�����"+dao);
		}else if(in>=10){
			System.out.println("���������һ����λ��");
			System.out.println("���ĸ�λ����"+gewei(in));
			System.out.println("����ʮλ����"+shiwei(in));
			int dao=dao(gewei(in),shiwei(in));
			System.out.println("���ĵ�����"+dao);
		}else{
			System.out.println("���������һ��һλ��");
			System.out.println("���ĸ�λ����"+gewei(in));
			int dao=dao(gewei(in));
			System.out.println("���ĵ�����"+dao);
		}
		sc.close();
	}

	/**
	 * �����λ��������
	 * @param in �������
	 * @return ��λ���ϵ�����
	 */
	public static int gewei(int in) {
		return in%10;
	}
	/**
	 * ���ʮλ���ϵ����� 
	 * @param in �������
	 * @return ʮλ���ϵ�����
	 */
	public static int shiwei(int in){
		return in%100/10;
	}
	/**
	 * �����λ���ϵ�����
	 * @param in �������
	 * @return ��λ���ϵ�����
	 */
	public static int baiwei(int in){
		return in%1000/100;
	}
	/**
	 * ���ǧλ���ϵ�����
	 * @param in �������
	 * @return ǧλ���ϵ�����
	 */
	public static int qianwei(int in){
		return in%10000/1000;
	}
	/**
	 * �����λ���ϵ�����
	 * @param in �������
	 * @return ��λ���ϵ�����
	 */
	public static int wanwei(int in){
		return in/10000;
	}
	public static int dao(int... x){
		int dao=0;
		for(int i=0;i<x.length;i++){
			dao=dao*10+x[i];
		}
		return dao;
	}
}
