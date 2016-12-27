package com.zsrt.java.tj.homework161223.Demo07;

import java.util.Scanner;

public class Demo07 {

	public static void main(String[] args) {
		quict();
	}
	/**
	 * 设置自动自动拨号
	 */
	public static void quict() {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入自动拨号数字");
		int st=sc.nextInt();
		switch (st) {
		case 1:
			System.out.println("拨爸爸的号");
			break;
		case 2:
			System.out.println("拨妈妈的号");
			break;
		case 3:
			System.out.println("拨爷爷的号");
			break;
		case 4:
			System.out.println("拨奶奶的号");
			break;
		default:
			System.out.println("您没有设定此快捷拨号数字");
			break;
		}
		sc.close();
	}

}
