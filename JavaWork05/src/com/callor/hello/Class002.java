package com.callor.hello;

public class Class002 {
	
	public static void sum(int num) {
		// 매개변수로 선언된 num 를 다시 선언하면 안됨
		// int num;
		int sum = 0;
		for(int i = 0 ; i < num ; i++) {
			sum += (i+1);
		}
		System.out.println("=".repeat(20));
		System.out.printf("1 ~ %d 까지 덧셈 %d\n",
				num, sum);
		System.out.println("=".repeat(20));
	}
	
	/*
	 * main() method 에서 수행할 코드를
	 * sum() method 에게 대신 수행하도록 만들어 두고
	 * sum() method 에게 정수값을 전달하여
	 * 원하는 결과를 얻기
	 */
	public static void main(String[] args) {
		sum(10);
		sum(34);
		sum(55);
		sum(15);
		
		sum(100);
		
		
	}

}
