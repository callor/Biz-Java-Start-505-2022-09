package com.callor.hello;

public class Var_07 {

	public static void main(String[] args) {
		
		int num1 = 0;
		int sum = 0;
		
		// 1
		++ num1;
		sum += num1;

		// 2
		++ num1;
		sum += num1;
		
		// 3
		++ num1;
		sum += num1;
		
		// 4
		++ num1;
		sum += num1;
		
		// 5
		++ num1;
		sum += num1;

		System.out.println("1 ~ 5 까지 덧셈 : " 
							+ sum);
		
		sum = 0;
		num1 = 0;
		sum += ++num1; // num1 : 1
		sum += ++num1; // num1 : 2
		sum += ++num1; // num1 : 3
		sum += ++num1; // num1 : 4
		sum += ++num1; // num1 : 5
		sum += ++num1; // num1 : 6
		
		/*
		 * 만약(if) 괄호안의 연신식이 true 이면
		 * 변수 num1 에 저장된 값이 5 인가?( == )
		 */
		if( num1 == 5 ) { 
			System.out.println("지금 num1 은 " 
						+ num1 
						+ " 이다");
		}
		if(num1 % 2 == 0) {
			System.out.println(num1 + "는(은) 짝수");
		}
		if(num1 % 2 != 0) {
			System.out.println(num1 + "은(는) 짝수가 아님");
		}
		if(num1 % 3 == 0) {
			System.out.println(num1 + "는 3의 배수");
		}
		if(num1 % 3 != 0) {
			System.out.println(num1 + "는 3의 배수가 아니라");
		}
		
		
	}
	
}
