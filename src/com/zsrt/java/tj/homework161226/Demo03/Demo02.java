package com.zsrt.java.tj.homework161226.Demo03;

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=5;
		contrast(a, b);
	}
	/**
	 * �Ƚ��������Ĵ�С���������ֵ����a
	 * @param a ��һ����
	 * @param b �ڶ�����
	 */
	public static void contrast(int a, int b) {
		int c;
		System.out.println("a="+a+",b="+b);
		if(a>b){
			System.out.println("a����b");
			c=a;
			a=b;
			b=c;
		}
		System.out.println("a="+a+",b="+b);
	}

}
