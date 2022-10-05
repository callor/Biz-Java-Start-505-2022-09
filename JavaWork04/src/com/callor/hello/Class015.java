package com.callor.hello;

import java.util.Scanner;

/*
 * 키보드를 통해서 정수1과 정수2를 입력받고
 * 정수1 ~ 정수2까지 덧셈을 구하여 출력
 */
public class Class015 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 1 >> ");
		int num1 = scan.nextInt();
		
		System.out.print("정수 2 >> ");
		int num2 = scan.nextInt();
		int sum = 0;
		// num1 : 3,  num2 : 5 라면
		// 3 + 4 + 5
		for(int index = num1 ; index <= num2 ; index++) {
			sum += index;
		}
		System.out.println("결과 : " + sum);
		
	}

}
