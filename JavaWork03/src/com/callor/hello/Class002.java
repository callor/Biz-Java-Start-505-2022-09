package com.callor.hello;

public class Class002 {
	
	public static void main(String[] args) {
		print();
		print();
		print();
	}
	/*
	 * print() 라는 사용자 정의 메서드를 만들고
	 * 다소 복잡한 코드를 한번에 묶음으로 만들어 둔다
	 * 이 메서드는 main() 메서드에서 마치 한 명령을 실행하는 것처럼
	 * 작동할수 있다
	 * 
	 * 
	 * main() 메서드에서
	 * print() 라는 명령을 실행하면
	 * 실제 print() {   } 에 선언된 코드가 실행된다
	 * print() 메서드 호출이라고 한다.
	 */
	public static void print() {
		System.out.println("안녕하세요");
		int sum = 0;
		for(int i = 0 ; i < 100;i++) {
			sum += (i+1);
		}
		System.out.println("1 ~ 100까지 덧셈 : " + sum);
	}

}
