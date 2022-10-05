package com.callor.hello;
/*
 * 키보드를 통해 정수를 입력받고
 * 입력받은 정수가 소수(prime) 인지  
 * 판별하여 출력
 * prime : 1과 자기 자신 이외의 약수가 없는 수
 */
public class Class012 {
	
	public static void main(String[] args) {
		int num = 9;
		
		// 소수가 아닌 경우만 찾기
		for(int index = 2; index < num ; index++) {
			if(num % index == 0) {
				System.out.println(num + " 는 소수가 아님");
				break;
			}
		}
		
		
		
		
	}
	
	
	

}
