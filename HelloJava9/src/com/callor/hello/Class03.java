package com.callor.hello;

public class Class03 {
	
	public static void main(String[] args) {
		
		/*
		 * 한줄에 별이 5번찍히고
		 * 줄을 바꾸어가면서 찍히도록 
		 *   * * * * *
		 *   * * * * *
		 *   * * * * *
		 *   * * * * *
		 *   * * * * *
		 */
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		for(int i = 0; i < 25 ; i++) {
			System.out.print("* ");
			if((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
		/*
		 * 1 ~ 100까지 정수를
		 * 한줄에 5개씩 출력하는 코드를 작성
		 */
		for(int i = 0 ; i < 100 ; i++) {
			System.out.print((i + 1) + " ");
		}
	}

}
