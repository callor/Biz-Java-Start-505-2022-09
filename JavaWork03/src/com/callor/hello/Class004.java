package com.callor.hello;

public class Class004 {
	
	/*
	 * print() method 를 만들면서
	 * String str 이라는 변수를 선언했다
	 * 이 변수는 print() method 를 호출할때
	 * 값을 전달하는 매개체 역할을 수행한다
	 * 이 변수를 
	 * 매개변수, arguments, parameter 라고 한다
	 * print() 메서드는 전달받은 문자열을 str 변수에
	 * 받고
	 * 내부 코드에서 str 문자열 변수에 담긴 문자열을
	 * 5번씩 출력하는 일을 수행한다
	 */
	public static void print(String str) {
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(str);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		print("우리나라");
		print("대한민국");
		print("Republic of Korea");
	}

}
