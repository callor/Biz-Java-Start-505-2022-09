package com.callor.hello;

import java.util.Scanner;

public class Class020 {
	
	public static void main(String[] args) {
		
		// 키보드에서 문자열을 입력받기위한 도구
		// 별도로 객체변수(인스턴스) 라는 것을
		// 생성하여 사용한다
		Scanner scan = new Scanner(System.in);
		
		// scan.nextLine() method 가 실행되면
		// 코드가 멈추고 사용자로 부터
		// 키보드 입력이 완료될때까지(Enter)
		// 마냥 기다린다
		// 그런 상황이 되면 사용자가 당황할수 있다
		// 때문에 미리 prompt 보여서 무엇을 할지
		// 알려주는 것이 좋다
		System.out.print("문자열 입력 >> ");
		String input = scan.nextLine();
		
		System.out.println("입력한 문자열 : " + input);
		
		
	}

}
