package com.zsrt.java.tj.homework161223.Demo10;

public class Demo102 {

	public static void main(String[] args) {
		tables();
	}

	/**
	 * ��do while�����žų˷���ķ���
	 */
	public static void tables() {
		int x=1;
		int y=1;
		do{
			do{
				System.out.print(y+"*"+x+"="+x*y+"\t");
				y++;
			}while(y<=x);
			System.out.println("");
			y=1;
			x++;
		}while(x<=9);
	}

}
