package com.callor.hello;

/*
 * 1 ~ 100까지 중에 임의 수 20개를 만들고
 * 2의 배수 이거나 3의 배수 인 수를
 * 모두 출력하고
 * 2의 배수 이거나 3의 배수인 수들의 합을 구하여
 * 출력
 */
public class Class02 {
	
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0 ; i < 20 ; i++) {
			int num1 = (int)(Math.random() * 100) + 1;
			if(num1 % 2 == 0 || num1 % 3 == 0) {
				System.out.println(num1);
				sum += num1;
			}
		}
		System.out.println(sum);
	}
	

}
