package com.callor.hello;

public class Class016 {
	/*
	 * add(), minus() method 를 만들었다
	 * method 를 만드는 것 : method 정의(선언)
	 * method 의 하는일
	 * 	  복잡한 코드를 하나의 그룹으로 묶고
	 * 	  한개의 명령어 처럼 사용하기 위한 것
	 * 
	 * method (return) type
	 * 	void type, void 가 아닌 type
	 * 	void type : 명령을 수행하고 결과를 알려주지 않는다
	 * 	void 가 아닌 type 
	 * 		: 명령을 수행하고 결과를 반드시 return 한다
	 * 
	 */
	public static void main(String[] args) {
		int result = add(100,200);
		System.out.println(result);
		
		minus(200,200);
	}
	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	public static void minus(int num1, int num2) {
		int result = num1 - num1;
	}

}
