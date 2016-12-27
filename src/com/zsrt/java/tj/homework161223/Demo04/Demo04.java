package com.zsrt.java.tj.homework161223.Demo04;

import java.util.Scanner;

public class Demo04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要判断的成绩(A,B,C,D)");
		String cj=sc.next();
		String results=results(cj);
		sc.close();
		if(results=="输入有误，自动退出"){
			System.out.println(results);
		}else{
		System.out.println("成绩为"+results);
		}
	}

	/**
	 * 判断成绩属于哪个层次
	 * @param cj 输入的成绩
	 */
	public static String results(String cj) {
		if(cj=="A"){
			return "优秀";
		}else if(cj=="B"){
			return "良好";
		}else if(cj=="C"){
			return "合格";
		}else if(cj=="D"){
			return "有问题";
		}else{
			return "输入有误，自动退出";
		}
	}
}
