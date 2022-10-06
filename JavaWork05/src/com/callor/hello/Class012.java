package com.callor.hello;

public class Class012 {
	
	public static void main(String[] args) {
		
		/*
		 * 테스트 자동화
		 * 키보드로 입력하거나
		 * 정해진 값으로 코드를 테스트하지 않고
		 * 임의로 생성된 값으로 테스트 하는 것
		 * 
		 * 임의의 섭씨 온도 100 개를 생성하여
		 * Class011 의 cel2fah() method 와
		 * Class010 의 온도변환 명령이
		 * 잘 작성되었는지 검증하는 코드
		 * 
		 */
		for(int i = 0 ; i < 100 ; i++) {
			int cel = (int)(Math.random() * 90) + 10;
			float fah = Class011.cel2fah(cel);
			float result = (5.0F / 9.0F) * (float)(fah - 31);
			System.out.printf("섭씨:%d, 화씨:%5.2f, 섭씨:%5.2f\n",cel, fah,result );
		}
	}
}
