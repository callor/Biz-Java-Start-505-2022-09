package com.callor.hello;

/*
 * while 반복문을 사용하여
 * 1 ~ 100까지 수 중에서
 * 3의 배수의 합을 구하여 출력
 */
public class Class09 {
	
	public static void main(String[] args) {
		int index = 0;
		int sum = 0;
		while(index++ < 100) {
			if(index % 3 == 0) {
				sum += index;
			}
		}
		System.out.println("3의 배수 합 : " + sum);
	}

}
