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
	 * 判断输入年份是否为闰年
	 * @param x 输入的年份
	 */
	public static void panduan(int x) {
		if(x%400==0){
			System.out.println(x+"是闰年");
		}else if(x%4==0&&x%100!=0){
			System.out.println(x+"是闰年");
		}else{
			System.out.println(x+"不是闰年");
		}
	}

}
