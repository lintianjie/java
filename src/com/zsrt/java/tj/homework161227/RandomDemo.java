package com.zsrt.java.tj.homework161227;

import java.util.Scanner;

import org.junit.Test;

public class RandomDemo {
	/**
	 * �����Ȱ�11���˶��Ž�ȥ
	 * 
	 * ��� random floor ȡ������
	 * @throws Exception
	 */
	@Test
	public void Random(){
		String[] class1612=new String[11];
		class1612[0]="����ı";
		class1612[1]="������";
		class1612[2]="����";
		class1612[3]="����";
		class1612[4]="л����";
		class1612[5]="��־��";
		class1612[6]="��־��";
		class1612[7]="����";
		class1612[8]="�¸�";
		class1612[9]="���ٻ�";
		class1612[10]="�����";
		while(true){
		double ran=Math.random();
		double len=ran*class1612.length;
		int sj=(int)Math.floor(len);
		System.out.println(sj+class1612[sj]);
		Scanner sc=new Scanner(System.in);
		System.out.println("�Ƿ��˳����˳��밴1�������밴������");
		String in=sc.next();
		if(in.equals("1")){
			System.out.println("�ɹ��˳�");
			break;
		}
		}
	}
}
