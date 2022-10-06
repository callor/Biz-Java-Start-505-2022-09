package com.callor.hello;

import java.util.Scanner;

/*
 * 키보드를 통해
 * 문자열을 입력받고
 * 입력받은 문자열을 분해하여
 * 순서가 무작위인 알파벳으로 출력
 */
public class Class016 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("영 단어 >> ");
		String str = scan.nextLine();
		
		String[] strs = str.split("");
		
		for(int i = 0 ; i < 100 ; i++) {
			
			int index1 = (int)(Math.random() * strs.length);
			int index2 = (int)(Math.random() * strs.length);
			
			String _str = strs[index1];
			strs[index1] = strs[index2];
			strs[index2] = _str;
		}
		
		for(int i = 0 ; i < strs.length ; i++) {
			System.out.print(strs[i] + " ");
		}
		
		
		
	}

}
