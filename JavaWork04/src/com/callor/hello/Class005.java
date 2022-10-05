package com.callor.hello;

import java.util.Scanner;

/*
 * 키보드를 통하여 두 정수를 입력받고
 * 4칙연산을 수행하여 Console 에 출력
 */
public class Class005 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 1 >> ");
		int num1 = scan.nextInt();
		
		System.out.print("정수 2 >> ");
		int num2 = scan.nextInt();
		
		System.out.printf("%d + %d = %d\n",
				num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n",
				num1, num2, num1 - num2);
		System.out.printf("%d x %d = %d\n",
				num1, num2, num1 * num2);
		System.out.printf("%d / %d = %d\n",
				num1, num2, num1 / num2);
		
		
		
	}

}
