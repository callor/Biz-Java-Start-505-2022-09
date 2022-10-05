package com.callor.hello;

public class Class019 {
	
	public static void main(String[] args) {
		int count = 0;
		for(int i = 0 ; i < 10 ; i++) {
			int num = (int)(Math.random() * 10) + 1;
			// even() 이 return 한 값을
			// count 에 누적하여 짝수의 개수를 알수 있다
			count += even(num);
		}
		System.out.println("결과 : " + count);
	}
	/*
	 * num 변수에 전달받은 값이 짝수이면 1을 return
	 */
	public static int even(int num) {
		if(num % 2 == 0) {
			return 1;
		} else {
			return 0;
		}
	}

}
