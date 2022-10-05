package com.callor.hello;

/*
 * 1 ~ 100까지 임의의 정수를 10개 만들고
 * 10개의 정수중에 prime 수가 몇개인가
 * 결과를 출력 
 */
public class Class021 {
	
	public static int prime(int num) {
		for(int i = 2 ; i < num ; i++) {
			if(num % i == 0) {
				return 0;
			}
		}
		return 1;
	}

}
