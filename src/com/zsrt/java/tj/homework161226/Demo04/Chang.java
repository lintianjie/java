package com.zsrt.java.tj.homework161226.Demo04;

import java.util.Scanner;

public class Chang {

	public static void main(String[] args) {
		cha();
	}

	/**
	 * 查看一个数的各位数，且求出它的倒序
	 */
	public static void cha() {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个不大于五位的正整数");
		int in=sc.nextInt();
		if(in>=10000){
			System.out.println("您输入的是一个五位数");
			System.out.println("它的个位数是"+gewei(in));
			System.out.println("它的十位数是"+shiwei(in));
			System.out.println("它的百位数是"+baiwei(in));
			System.out.println("它的千位数是"+qianwei(in));
			System.out.println("它的万位数是"+wanwei(in));
			int dao=dao(gewei(in),shiwei(in),baiwei(in),
					qianwei(in),wanwei(in));
			System.out.println("它的倒序是"+dao);
		}else if(in>=1000){
			System.out.println("您输入的是一个四位数");
			System.out.println("它的个位数是"+gewei(in));
			System.out.println("它的十位数是"+shiwei(in));
			System.out.println("它的百位数是"+baiwei(in));
			System.out.println("它的千位数是"+qianwei(in));
			int dao=dao(gewei(in),shiwei(in),baiwei(in),qianwei(in));
			System.out.println("它的倒序是"+dao);
		}else if(in>=100){
			System.out.println("您输入的是一个三位数");
			System.out.println("它的个位数是"+gewei(in));
			System.out.println("它的十位数是"+shiwei(in));
			System.out.println("它的百位数是"+baiwei(in));
			int dao=dao(gewei(in),shiwei(in),baiwei(in));
			System.out.println("它的倒序是"+dao);
		}else if(in>=10){
			System.out.println("您输入的是一个二位数");
			System.out.println("它的个位数是"+gewei(in));
			System.out.println("它的十位数是"+shiwei(in));
			int dao=dao(gewei(in),shiwei(in));
			System.out.println("它的倒序是"+dao);
		}else{
			System.out.println("您输入的是一个一位数");
			System.out.println("它的个位数是"+gewei(in));
			int dao=dao(gewei(in));
			System.out.println("它的倒序是"+dao);
		}
		sc.close();
	}

	/**
	 * 求出个位数的数字
	 * @param in 被求的数
	 * @return 个位数上的数字
	 */
	public static int gewei(int in) {
		return in%10;
	}
	/**
	 * 求出十位数上的数字 
	 * @param in 被求的数
	 * @return 十位数上的数字
	 */
	public static int shiwei(int in){
		return in%100/10;
	}
	/**
	 * 求出百位数上的数字
	 * @param in 被求的数
	 * @return 百位数上的数字
	 */
	public static int baiwei(int in){
		return in%1000/100;
	}
	/**
	 * 求出千位数上的数字
	 * @param in 被求的数
	 * @return 千位数上的数字
	 */
	public static int qianwei(int in){
		return in%10000/1000;
	}
	/**
	 * 求出万位数上的数字
	 * @param in 被求的数
	 * @return 万位数上的数字
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
