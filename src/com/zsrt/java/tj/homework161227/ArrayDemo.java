package com.zsrt.java.tj.homework161227;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayDemo {
	/**
	 * �߼���forѭ�� 
	 * for(���������� ���������ƣ� ��������ƣ�
	 * 
	 * @throws Exception
	 */
	public void dome03() throws Exception{
		
		
	}
	@Test
	//����Ŀռ��������ġ���̬�ĳ�ʼ��
	//��������ı���ages������ջ�ռ��С�new �����ڶѿռ�
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
		//��̬�ĳ�ʼ��
		int[] ages=new int[]{23,18,16};
		int[] score={75,80,95};
		System.out.println(ages[2]);
		System.out.println(Arrays.toString(score));
	}
}
