package com.callor.hello;

import java.util.Scanner;

/*
 * 키보드를 통해서 10이상 50이하의 값을 입력받고
 * 1 ~ 입력한 숫자까지 덧셈을 수행하여 출력
 */
public class Class014 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 >> ");
		int num = scan.nextInt();
		
		int sum = 0;
		for(int i = 0 ; i < num ; i++) {
			sum += (i + 1);
		}
		System.out.println("결과 : " + sum);
	}

}
