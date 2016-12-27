package com.zsrt.java.tj.homework161226.Demo03;

public class Demo101 {

	public static void main(String[] args) {
		tables();
	}

	/**
	 * 用while 创建九九乘法表的方法
	 */
	public static void tables() {
		int x=1;
		int y=1;
		while (x<=9) {
			while(y<=x){
				System.out.print(y+"*"+x+"="+x*y+"\t");
				y++;
			}
			System.out.println("");
			y=1;
			x++;
		}
	}

}
