package com.zsrt.java.tj.homework161226.Demo03;

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=5;
		max(a, b);
	}
	/**
	 * �Ƚ��������Ĵ�С�����ֵ�ҳ�
	 * @param a ��һ����
	 * @param b �ڶ�����
	 */
	public static void max(int a, int b) {
		int max;
		if(a>b){
			max=a;
		}else{
			max=b;
		}
		System.out.println(a+","+b+"��"+max+"�ϴ�");
	}

}
