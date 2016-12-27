package com.zsrt.java.tj.homework161223.Demo05;

import java.util.Scanner;

public class Demo05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入成绩(A,B,C,D)");
		String cj=sc.next();
		String results=results(cj);
		sc.close();
		if(results.equals("输入有误")){
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
		switch (cj) {
		case "A":
			return "该学生成绩优秀";
		case "B":
			return "该学生成绩良好";
		case "C":
			return "该学生成绩一般";
		case "D":
			return "该学生成绩有问题";
		default:
			return "输入有误";
		}
	}
}
