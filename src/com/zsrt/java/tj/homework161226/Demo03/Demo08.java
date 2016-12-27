package com.zsrt.java.tj.homework161226.Demo03;

public class Demo08 {

	public static void main(String[] args) {
		star();
		}

	/**
	 * 一个简单的图形方法
	 */
	public static void star() {
		for(int i=1;i<=4;i++){
			for(int z=4;z>i;z--){
				System.out.print("\t");
			}
			for(int x=0;x<i*2-1;x++){
				System.out.print("*\t");
			}
			System.out.println("");
			}
		for(int i=1;i<=3;i++){
			for(int z=0;z<i;z++){
				System.out.print("\t");
			}
			for(int x=5;x>i*2-2;x--){
				System.out.print("*\t");
			}
			System.out.println("");
		}
	}

}
