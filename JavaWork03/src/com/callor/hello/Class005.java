package com.callor.hello;

public class Class005 {
	/*
	 * 두개의 정수형 매개변수를 갖는
	 * add() 메서드를 선언해 두고
	 * main() 메서드에서
	 * 두 정수를 각각 전달하여
	 * 4칙 연산을 출력하도록 한다
	 */
	public static void add(int num1, int num2) {
		System.out.printf("%d + %d = %d\n",
				num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n",
				num1, num2, num1 - num2);
		System.out.printf("%d x %d = %d\n",
				num1, num2, num1 * num2);
		System.out.printf("%d / %d = %d\n",
				num1, num2, num1 / num2);
	}
	
	public static void main(String[] args) {
		add(10,20);
		add(100,10);
		add(5, 3);
	}

}
