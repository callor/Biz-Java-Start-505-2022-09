package com.callor.hello;

public class Class04 {
	
	public static void main(String[] args) {
		
		int num1 = 33;
		// num1 변수에 저장된 숫자가 10 이상이고
		// 50 이하인지 판별하기
		if(num1 >= 10) {
			if(num1 <= 50) {
				System.out.println("10 이상 50 이하인 숫자");
			}
		}
		// num1 에 저장된 숫자가
		// 10이상 이면서(and) 50 이하인 경우를 판별 
		if(num1 >= 10 && num1 <= 50) {
			System.out.println("10이상 50이하인 숫자");
		}
		
		// num1 에 저장된 숫자가
		// 50 이상 이거나(or) 10 이하인 경우를 판변
		if(num1 >= 50 || num1 <= 10) {
			System.out.println("10이하 이거나 50이상인 숫자");
		}
		
		// num1 에 저장된 숫자가
		// 3의 배수 또는 5의 배수 인가를 판별
		if(num1 % 3 == 0 || num1 % 5 == 0) {
			System.out.println("3 또는 5의 배수");
		}
		
		// num1 에 저장된 숫자가
		// 3의 배수 또는 6의 배수 또는 7의 배수 인가를 판별
		if(num1 % 3 == 0 || num1 % 6 == 0 || num1 % 7 == 0) {
			
		}
		

		
	}

}
