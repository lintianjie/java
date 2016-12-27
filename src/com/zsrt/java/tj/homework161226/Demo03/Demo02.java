package com.zsrt.java.tj.homework161226.Demo03;

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=5;
		contrast(a, b);
	}
	/**
	 * 比较两个数的大小，并将大的值赋给a
	 * @param a 第一个数
	 * @param b 第二个数
	 */
	public static void contrast(int a, int b) {
		int c;
		System.out.println("a="+a+",b="+b);
		if(a>b){
			System.out.println("a大于b");
			c=a;
			a=b;
			b=c;
		}
		System.out.println("a="+a+",b="+b);
	}

}
