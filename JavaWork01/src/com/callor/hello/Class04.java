package com.callor.hello;

public class Class04 {
	
	public static void main(String[] args) {
		
		float fNum1 = 0.0F;
		System.out.println(fNum1);
		
		double dNum1 = 0.0;
		System.out.println(dNum1);
		
		int intNum1 = 0;
		System.out.println(intNum1);
		
		/*
		 * fNum1 과 dNum1 에 저장된 값이 겉모습으로는
		 * 0 이지만
		 * 실제로는 소수점 이하 자릿수가 다르다
		 * dNum1 에 저장된 값이 훨씬 자릿수가 많다
		 * 때문에 dNum1 의 값을 fNum1 에 저장할수 없다
		 * 
		 * 만약 dNum1 에 저장된 값을
		 * fNum1 에 저장하려면 "강제로 float 형"으로
		 * 변환해 주어야 한다.
		 * "강제 형 변환","명시적 형 변환"
		 */
		fNum1 = (float)dNum1;
		
		/*
		 * 이 경우는 dNum1 가 double 형 이기 때문에
		 * 자연스럽게 float 인 fNum1 에 저장된 값이
		 * double 형으로 변환되어 저장된다
		 * "자동 형 변환", "묵시적 형 변환"
		 */
		dNum1 = fNum1;
		dNum1 = (double)fNum1;
		
		intNum1 = (int)fNum1;
		intNum1 = (int)dNum1;
		
		// 숫자형 변수에 담긴 값을
		// 문자열형 변수에 복사하려면
		// 숫자형 변수에 문자열을 덧셈 해주면 된다
		String str = "";
		str = intNum1 + "";
		str = "" + fNum1;
		// 문자열형 변수에 담긴 값을
		// 숫자형 변수에 담으려면 
		// 새로운 도구를 사용해야한다
		// intNum1 = str;
		
		
		
	}
	

}
