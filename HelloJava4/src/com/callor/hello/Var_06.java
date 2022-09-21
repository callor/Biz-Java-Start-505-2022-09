package com.callor.hello;

public class Var_06 {
	
	public static void main(String[] args) {
		
		int num1 = 100;
		int num2 = num1; // num1 변수의 값을 읽어서
						 // 복사해서 num2 에 저장하라
		
		num1 = 200; // num1 에 200 값을 저장했지만
					// num2 와는 다른 저장소 이므로
					// num2 는 100이 그대로 유지된다
		
		
	}

}
