package com.callor.hello;

import java.util.Scanner;

/*
 * 정수형 배열 5개를 선언하고
 * 키보드를 통하여 숫자 5개를 입력받고
 * 정수형 배열의 각 요소에 저장
 * 정수형 배열 5개에 저장된 값을 모두
 * 합산하여 출력
 */
public class Class010 {
	
	public static void main(String[] args) {
		int[] nums = new int[5];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.printf("%d 번째 정수 >> ",i +1);
			nums[i] = scan.nextInt();
		}
		
		int sum = 0;
		for(int i = 0 ; i < nums.length ; i++) {
			sum += nums[i];
		}
		System.out.println("합계 : " + sum);
		
	}

}
