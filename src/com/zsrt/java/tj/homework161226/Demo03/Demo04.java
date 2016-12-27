package com.zsrt.java.tj.homework161226.Demo03;

public class Demo04 {

	public static void main(String[] args) {
		String cj="A";
		results(cj);
	}

	/**
	 * 判断成绩属于哪个层次
	 * @param cj 输入的成绩
	 */
	public static void results(String cj) {
		if(cj=="A"){
			System.out.println("优秀");
		}else if(cj=="B"){
			System.out.println("良好");
		}else if(cj=="C"){
			System.out.println("合格");
		}else if(cj=="D"){
			System.out.println("有问题");
		}else{
			System.out.println("输入有误，请重新输入");
		}
	}
}
