package com.callor.hello;

public class Class002 {
	
	public static void main(String[] args) {
		/*
		 * 이중(다중) for() 반복문
		 * 바깥쪽의 for() 은 i 값이 0 ~ 4까지 반복
		 * 그 동안 안쪽의 for() 은 j 값이 0 ~ 까지 반복
		 * 
		 * 만약 안쪽의 for() 블럭에 명령문이 있다면
		 * 전체 반복 횟수는 총 25번이 된다
		 */
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.println("대한민국");
			}
		}
	}

}
