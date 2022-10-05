package com.callor.hello;

import java.util.Scanner;

/*
 * 키보드를 통해 정수를 입력받고
 * 입력받은 정수가 짝수인지 아닌지 판별하여
 * 출력
 */
public class Class011 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 >> ");
		int num = scan.nextInt();
		if(num % 2 == 0) {
			System.out.println(num + " 는 짝수");
		} else {
			System.out.println(num + " 짝수가 아님");
		}
		
		
		
	}

}
