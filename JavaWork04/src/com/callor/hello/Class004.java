package com.callor.hello;

import java.util.Scanner;

public class Class004 {
	/*
	 * 키보드를 통하여 두 정수를 입력받고
	 * 덧셈을 계산하여 Console 에 출력하기
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 >>");
		int num1 = scan.nextInt();
		
		System.out.print("두번째 정수 >> ");
		int num2 = scan.nextInt();
		
		System.out.printf("%d + %d = %d\n",
				num1, num2, num1 + num2);
		
	}

}
