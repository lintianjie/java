package com.zsrt.java.tj.homework161226.Demo03;

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=5;
		max(a, b);
	}
	/**
	 * 比较两个数的大小，最大值找出
	 * @param a 第一个数
	 * @param b 第二个数
	 */
	public static void max(int a, int b) {
		int max;
		if(a>b){
			max=a;
		}else{
			max=b;
		}
		System.out.println(a+","+b+"中"+max+"较大");
	}

}
