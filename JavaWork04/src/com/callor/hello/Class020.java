package com.callor.hello;

public class Class020 {
	
	public static void main(String[] args) {
		int num1 = (int)(Math.random() * 100) + 1;
		int result = prime(num1);
		if(result == 1) {
			System.out.println(num1 + "소수");
		} else {
			System.out.println(num1 + "소수가 아님");
		}
	}
	public static int prime(int num) {
		for(int i = 2 ; i < num ; i++) {
			if(num % i == 0) {
				return 0;
			}
		}
		return 1;
	}

}
