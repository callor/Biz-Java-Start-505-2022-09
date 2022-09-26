package com.callor.hello;

public class Var_08 {

	public static void main(String[] args) {
		

		/*
		 * num 변수를 for() 명령으로 0 ~ 10까지 생성하고
		 * num1 변수에 num + 1 연산하여 저장했다
		 * num1 변수에 담긴 값이 짝수인가를 판별하여 
		 * console 에 출력
		 */
		for(int num = 0 ; num < 10 ; num++) {
			int num1 = num + 1;
			if(num1 % 2 == 0) {
				System.out.println(num1 + "는 짝수");
			}
		}
	}
	
}
