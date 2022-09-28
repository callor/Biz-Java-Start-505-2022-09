package com.callor.hello;

/*
 * for() 반복문을 사용하여 7단 구구단을 출력하기
 */
public class Class01 {
	
	public static void main(String[] args) {
		
		int dan = 7;
		int index = 1;
		for(index = 1; index < 10 ; index++ ) {
			System.out.printf("%d x %d = %d\n",dan,index, dan * index);
		}
		
		for(int num = 1; num < 10 ; num++) {
			System.out.printf("%d x %d = %d\n",dan, num, dan * num);
		}
		
		
	}
	
	

}
