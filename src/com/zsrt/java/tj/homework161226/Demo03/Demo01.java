package com.zsrt.java.tj.homework161226.Demo03;

public class Demo01 {

	public static void main(String[] args) {
		int a=2000;
		int b=300;
		int c=2016;
		panduan(a);
		panduan(b);
		panduan(c);
	}
	/**
	 * �ж���������Ƿ�Ϊ����
	 * @param x ��������
	 */
	public static void panduan(int x) {
		if(x%400==0){
			System.out.println(x+"������");
		}else if(x%4==0&&x%100!=0){
			System.out.println(x+"������");
		}else{
			System.out.println(x+"��������");
		}
	}

}
