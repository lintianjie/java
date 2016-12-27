package com.zsrt.java.tj.homework161227;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayDemo {
	/**
	 * 高级的for循环 
	 * for(变量的类型 变量的名称： 数组的名称）
	 * 
	 * @throws Exception
	 */
	public void dome03() throws Exception{
		
		
	}
	@Test
	//数组的空间是连续的。动态的初始化
	//定义出来的变量ages保存在栈空间中。new 保存在堆空间
	public void dome02() throws Exception{
		int[] ages=new int[3];
		
		ages[0]=23;
		ages[1]=18;
		ages[2]=16;
		System.out.println(ages[2]);
		int len=ages.length;
		System.out.println(len);
	}
	@Test
	public void deme01() throws Exception{
		//静态的初始化
		int[] ages=new int[]{23,18,16};
		int[] score={75,80,95};
		System.out.println(ages[2]);
		System.out.println(Arrays.toString(score));
	}
}
