package com.callor.hello;

public class Var_02 {
	
	public static void main(String[] args) {
		int num1 = 0 ;
		/*
		 * for() 명령문은 같은 코드를 반복하여
		 * 실행하기 위한 코드이다
		 * 
		 * 아래코드에서는 num1 변수를 1씩 증가하면서
		 * console 에 출력하고
		 * 만약 num1 이 5보다 커지면 break 명령이
		 * 실행되어서 더이상 반복코드를 실행하지 말라
		 */
		for( ;; ) {
			num1 ++;
			if(num1 > 5) {
				break;
			}
			System.out.println(num1);
		}
	}
	

}
