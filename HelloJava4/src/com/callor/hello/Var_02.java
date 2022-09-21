package com.callor.hello;

public class Var_02 {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		float num3 = 10.0f;
		float num4 = 20.0f;
		
		// num1 은 int type인데 
		// float type 인 34.5f 를 저장하라고
		// 명령을 내리면 오류를 보여준다
		// 이때 오류는 실수를 방지하라는 
		// 경고이며 안내문이다
		// num1 = 34.5f;
		
		// float type num3 에 
		// 정수값 30 을 저장하라고 명령을 내리면
		// 자동으로 30.0f 로 바꾸어서 저장한다
		num3 = 30;
		
		
	}

}
