package com.callor.hello;

public class Var_01A {
	
	public static void main(String[] args) {
		
		int num1 = 0;
		int sum = 0;
		
		System.out.println(num1);
		System.out.println(sum);
		num1++;
		sum += num1;
		
		sum += ++num1;
		sum += ++num1;
		sum += ++num1;
		sum += ++num1;

		System.out.println(num1);
		System.out.println(sum);
		
		sum += ++num1;
		sum += ++num1;
		sum += ++num1;
		sum += ++num1;
		sum += ++num1;
		
		System.out.println("1 ~ 10까지 덧셈 : " + sum);
		
	}

}
