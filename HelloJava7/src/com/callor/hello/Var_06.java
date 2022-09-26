package com.callor.hello;

public class Var_06 {
	
	public static void main(String[] args) {
		int sNum = 1;
		int eNum = 500;
		int sum = 0;
		for(int index = (sNum-1) ; index < eNum ; index++) {
			sum += (index+1);
		}
		System.out.println(
				sNum + " ~ " + eNum
				+ "까지 덧셈 : " + sum);
	}
	
	
}
