package com.callor.hello;

public class Class01 {

	public static void main(String[] args) {
		
		System.out.println("**************************");
		System.out.println("*".repeat(20));
		
		for(int i = 2 ; i < 10 ; i++) {
			System.out.println("=".repeat(20));
			System.out.printf(" %d 단\n",i);
			System.out.println("-".repeat(20));
			
			for(int j = 1 ; j < 10 ; j++) {
				System.out.printf("%d x %d = %d\n",i, j , i+j);
			}
			
		}
		
	}
	
}
