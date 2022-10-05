package com.callor.hello;

import java.util.Scanner;

/*
 * 키보드를 통해 정수를 입력받고
 * 입력받은 정수가 소수(prime) 인지  
 * 판별하여 출력
 * prime : 1과 자기 자신 이외의 약수가 없는 수
 */
public class Class013 {
	
	public static void main(String[] args) {
		
		int num = 9;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 >> ");
		num = scan.nextInt();
		
		// 소수 인 경우를 찾으려면
		// for() 반복문이 완료되었는지
		// 아니면 중간에 중단되었는지를 먼저 파악
		int index ;
		for(index = 2; index < num ; index++) {
			if(num % index == 0) {
				break;
			}
		}
		if(index < num) {
			System.out.println(num + "는 소수가 아님");
		} else {
			System.out.println(num + "는 소수");
		}
		
		
		
		
	}
	
	
	

}
