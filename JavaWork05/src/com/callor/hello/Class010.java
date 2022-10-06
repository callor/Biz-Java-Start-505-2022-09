package com.callor.hello;

import java.util.Scanner;

/*
 * 온도에 화씨 섭씨
 * 섭씨 = 5/9 x (화씨 - 32)
 * 
 * 키보드를 통해서 화씨 온도를 입력받고
 * 섭씨온도로 변환하여 출력
 * 
 * 출력은 실수(float) 으로 소수점 2자리까지
 * 
 * ===================
 * 화씨온도는? >>
 * -------------------
 * 섭씨온도는 : 00.00
 * 
 */
public class Class010 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=".repeat(20));
		System.out.print("화씨온도는 >> ");
		int fah = scan.nextInt();
		
		float cel = (5.0F / 9.0F) * (float)(fah - 31);
		
		System.out.printf("섭씨 온도 : %5.2f\n",cel);
		System.out.println("=".repeat(20));
		
	}
	
	

}
