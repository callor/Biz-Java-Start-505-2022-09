package com.callor.hello;

/*
 * 1 ~ 100까지 임의 수 10개를 만들고
 * 그 중에서 3의 배수인 수가 몇개인가 출력
 */
public class Class04 {
	
	public static void main(String[] args) {
		
		int count = 0;
		for(int i = 0 ; i < 10 ; i++) {
			int num1 = (int)(Math.random() * 100) + 1;
			if(num1 % 3 == 0) {
				System.out.print(num1 + " ");
				count++;
			}
		}
		System.out.println("갯수 :" + count);
	}

}
