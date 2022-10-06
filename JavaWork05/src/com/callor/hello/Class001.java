package com.callor.hello;

/*
 * method
 * 비슷한 일을 반복하여 어떤 명령들을 수행해야 할 경우
 * 명령들 묶음을 method 로 구현하고
 * 필요한 곳에서 method 를 호출하여 처리를 수행하도록
 * 구현하는 코딩 방식
 * 
 * 복잡하고 반복적인 코드 그룹을
 * 좀더 간소하게 사용하위한 방식
 */
public class Class001 {
	
	public static void main(String[] args) {
		print("대한민국");
		print("우리나라");
		print("Republic of Korea");
	}
	
	/*
	 * str 이라는 String 형 매개변수를 갖는
	 * print() method
	 * 
	 * str 변수에 어떤 문자열을 전달받고
	 * 전달받은 문자열을 Console 에 출력하기
	 */
	public static void print(String str) {
		System.out.println("=".repeat(20));
		System.out.print("확인 : ");
		System.out.println(str);
		System.out.println("=".repeat(20));
	}

}
