package com.callor.hello.model;

public class HelloPrint {
	
	public static void main(String[] args) {
		System.out.print("30 + 40 = ");
		System.out.println(30 + 40);
		
		System.out.println("대한" + "민국");
		System.out.println("대" + "한" + "민" + "국");
		
		// 아래 연산을 풀어쓰면...
		System.out.println("30 + 40 = " + 30 + 40);
		System.out.println("30 + 40 = 30 " + 40);
		System.out.println("30 + 40 = 30 + 40");
		
		// 작성한 코드의 의도는 30 + 40 = 70 의
		// 결과가 나오기를 바란 것이다
		// 이럴때는 연산의 우선순위를 변경해 주면된다
		System.out.println("30 + 40 = " + (30 + 40) );
		
		/*
		 * 문자열(String) + 숫자(int) 연산은
		 * 숫자를 문자열로 변환하여 연결하는 코드가
		 * 생성된다
		 * 문자열과 숫자는 덧셈(+, 연결연산) 만 
		 * 가능하다
		 * 문자열 - 숫자, 문자열 * 숫자
		 * 문자열 / 숫자, 문자열 % 숫자 등은
		 * 불가능, 문법 오류가 발생한다.
		 */
		System.out.println("30 x 40 = " + 30 * 40);
		// 문법오류가 발생하지 않도록 숫자-숫자 연산을
		// 먼저 수행하도록 해 주어야 한다
		System.out.println("30 - 40 = " + (30 - 40));
		System.out.println("30 - 40 = " + (30 - 40));
		
		/*
		 * 숫자(정수, 실수)들은 4칙연산, 나머지연산을
		 * 수행할수 있다
		 * 문자열은 덧셈(연결) 연산만 수행 가능하다
		 * 
		 * 자동 형(type) 변환
		 * 문자열 + 숫자 연산은 숫자를 자동으로 
		 * 문자열로 변환하여 연결 연산을 수행한다
		 */
		
	}

}
