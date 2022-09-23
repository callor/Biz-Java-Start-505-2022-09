package com.callor.hello;

public class Var_05 {
	
	public static void main(String[] args) {
		
		int num1 = 33;
		boolean bYes = false;
		bYes = num1 % 2 == 0;
		if(bYes) {
			System.out.println("짝수");
		}
		if(bYes != true) {
			System.out.println("짝수가 아님");
		}
		bYes = 3 == 4;
		bYes = 3 == 3;
		
		if(bYes) {
			System.out.println("bYes 는 " + bYes);
		}
		
	}

}
