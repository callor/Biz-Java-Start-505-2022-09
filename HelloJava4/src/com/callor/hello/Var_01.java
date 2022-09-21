package com.callor.hello;

/*
 * 자바 소스코드를 작성한 파일(Var_01.java)
 */
public class Var_01 {
	
	/*
	 * 영단어() 형태의 명령어를 
	 * method(메소드), 또는 함수(function) 이라고 한다
	 * 
	 * main() {  } : main method block 이라고 한다
	 */
	public static void main(String[] args) {
		System.out.println();
		
		int num1 = 30;
		int num2 = 40;
		
		System.out.println(num1);
		System.out.println(num2);
		
		/**
		 * 두개의 변수 num1, num2 에
		 * 숫자를 각각 저장해 두고
		 * 변수에 저장된 값을 읽어서와
		 * 4칙연산과 나머지 연산을 수행하도록
		 * 명령하였다
		 * 변수 2개에 값을 저장하고
		 * 각 연산 명령이 공용으로 사용하였다
		 */
		System.out.println(num1 + num2);
		System.out.println(num1 * num2);
		System.out.println(num2 - num1);
		System.out.println(num2 / num1);
		System.out.println(num2 % num1);
		
		
		
	}

}

