package com.callor.hello;

/*
 * 1 ~ 100까지 임의 수를 10개 만들고
 * 모두 출력
 * 출력을 하는 과정에서 임의 수가 3의 배수이면
 * 반복문을 중단
 */
public class Class03 {
	
	public static void main(String[] args) {
		for(int i = 0 ; i < 10 ; i++) {
			int num1 = (int)(Math.random() * 100) + 1;
			System.out.println(num1);
			if(num1 % 3 == 0) {
				break;
			}
		}
	}
	

}
