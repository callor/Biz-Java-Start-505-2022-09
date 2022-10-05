package com.callor.hello;

import java.util.Scanner;

/*
 * 이름, 국어, 영어 성적을 입력받고
 * 홍길동님 총점은 00 입니다
 */
public class Class006 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 >> ");
		String name = scan.nextLine();
		
		System.out.print("국어 >> ");
		int intKor = scan.nextInt();
		
		System.out.print("영어 >> ");
		int intEng = scan.nextInt();
		
		System.out.printf("%s 님 총점은 %d 입니다\n",
				name, intKor + intEng);
		
		
		
	}

}
