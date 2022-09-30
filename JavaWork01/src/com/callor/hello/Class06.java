package com.callor.hello;

public class Class06 {
	
	public static void main(String[] args) {
		
		for(int i = 0 ; i < 10 ; i++) {
			int num1 = (int)(Math.random() * 10);
			if(num1 % 2 == 0) {
				System.out.printf("%d:짝수\n",num1);
			}
		}
		
	}
	

}
