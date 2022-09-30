package com.callor.hello;

public class Class05 {
	
	public static void main(String[] args) {
		int count = 0;
		for(count = 0 ;count < 10 ; count++) {
			int num1 = (int)(Math.random() * 100) + 1;
			System.out.print(num1 + " ");
			if(num1 % 3 == 0) {
				System.out.println();
				break;
			}
		}
		System.out.println("몇번째 : " + (count + 1));
	}

}
