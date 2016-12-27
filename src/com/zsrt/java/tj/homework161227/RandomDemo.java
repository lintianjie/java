package com.zsrt.java.tj.homework161227;

import java.util.Scanner;

import org.junit.Test;

public class RandomDemo {
	/**
	 * 我首先把11个人都放进去
	 * 
	 * 随机 random floor 取出来。
	 * @throws Exception
	 */
	@Test
	public void Random(){
		String[] class1612=new String[11];
		class1612[0]="张泽谋";
		class1612[1]="吴荣来";
		class1612[2]="钟鹏";
		class1612[3]="刘浩";
		class1612[4]="谢文威";
		class1612[5]="黄志杰";
		class1612[6]="张志东";
		class1612[7]="胡斌";
		class1612[8]="陈皋";
		class1612[9]="曾少华";
		class1612[10]="林天杰";
		while(true){
		double ran=Math.random();
		double len=ran*class1612.length;
		int sj=(int)Math.floor(len);
		System.out.println(sj+class1612[sj]);
		Scanner sc=new Scanner(System.in);
		System.out.println("是否退出，退出请按1，继续请按任意数");
		String in=sc.next();
		if(in.equals("1")){
			System.out.println("成功退出");
			break;
		}
		}
	}
}
