package com.callor.hello;

public class Class07 {
	
	public static void main(String[] args) {
		int num1 = 1;
		while(num1 % 3 != 0) {
			num1 = (int)(Math.random() * 100) + 1;
			System.out.print(num1 + " ");
		}
	}

}
