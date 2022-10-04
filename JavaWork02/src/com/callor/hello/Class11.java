package com.callor.hello;

public class Class11 {
	
	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random() * 100) + 1;
			System.out.println(num);
			if(num % 5 == 0) {
				break;
			}
		}
	}

}
