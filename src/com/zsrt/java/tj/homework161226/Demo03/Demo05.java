package com.zsrt.java.tj.homework161226.Demo03;

public class Demo05 {

	public static void main(String[] args) {
		String cj="A";
		results(cj);
	}

	/**
	 * 判断成绩属于哪个层次
	 * @param cj 输入的成绩
	 */
	public static void results(String cj) {
		switch (cj) {
		case "A":
			System.out.println("该学生成绩优秀");
			break;
		case "B":
			System.out.println("该学生成绩良好");
			break;
		case "C":
			System.out.println("该学生成绩一般");
			break;
		case "D":
			System.out.println("该学生成绩有问题");
			break;
		default:
			System.out.println("输入有误");
			break;
		}
	}
}
