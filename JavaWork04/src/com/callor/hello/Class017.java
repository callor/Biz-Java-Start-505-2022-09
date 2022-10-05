package com.callor.hello;

public class Class017 {
	
	/*
	 * 1 ~ 10까지 덧셈을 하고
	 * 결과를 return 하는 method
	 */
	public static int sum() {
		int sum = 0;
		for(int i = 0 ; i < 10 ; i++) {
			sum += (i + 1);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		/*
		 * sum() method 에게 
		 * (어떤)명령 들을 수행하고
		 * 결과를 result 변수에 저장해 달라
		 */
		int result = sum();
		// 결과를 출력
		System.out.println(result);
	}

}
