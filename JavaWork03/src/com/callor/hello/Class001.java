package com.callor.hello;

public class Class001 {
	
	public static void main(String[] args) {
		
		/*
		 * i 값이 1 ~ 5까지 변화하는 동안
		 * j 값은 i 값에 따라 
		 * 0 ~ 1
		 * 0 ~ 2
		 * 0 ~ 3
		 * 0 ~ 4
		 */
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j = 0 ; j < i ; j++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
