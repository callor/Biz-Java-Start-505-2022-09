package com.callor.hello;

public class Class007 {
	
	public static void main(String[] args) {
		String strNum;
		int intNum = 30;
		float floatNum = 30.0F;
		
		// 자동 형변환
		floatNum = intNum;
		// 강제 형변환
		intNum = (int)floatNum;
		
		// 숫자형 데이터를 문자열형 변수에 저장하기
		// 숫자형 변수 앞 또는 뒤에 없는문자열("")을
		// 연결한다.
		strNum = "" + intNum;
		strNum = intNum + "";
		System.out.println(strNum);
		
		/*
		 * String 클래스의 valueOf() method 에게
		 * 숫자 값을 전달하고
		 * 문자열로 변환 한 다음 strNum 변수에
		 * 담아달라 하는 요청
		 */
		strNum = String.valueOf(intNum);

		// 문자열형 숫자를 4칙연산이 가능한
		// 숫자로 변환하기
		System.out.println("30 + 40");
		System.out.println("30" + "40");
		
		/*
		 * Integer 클래스의 valueOf() method 에게
		 * 문자열형 숫자를 전달하고
		 * 정수형(Integer) 데이터로 변환하여
		 * num1, num2 변수에 저장해 달라
		 */
		int num1 = Integer.valueOf("30");
		int num2 = Integer.valueOf("40");
		
		
	}

}
