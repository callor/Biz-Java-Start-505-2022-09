package com.callor.hello;

/*
 * 5개 교과목을 저장할 변수를 선언하고
 * 각각 교과목에 
 * 50 ~ 100까지 중에 임의의 점수를 저장하고
 * 5개 교과목의 총점과 평균을 구하여
 * 출력
 */
public class Class008 {
	
	public static void main(String[] args) {
		int intKor = 88;
		int intEng = 77;
		int intMath = 97;
		int intSci = 77;
		int intMusic = 89;
		
		int sum = intKor + intEng + intMath + intSci + intMusic;
		sum = intKor;
		sum += intEng;
		sum += intMath;
		sum += intSci;
		sum += intMusic;
		
		// 정수형변수 sum 을 float 로 변환하고
		// 실수 5.0F 로 나누기
		float avg = (float)sum / 5.0F;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
	}

}
