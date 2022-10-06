package com.callor.hello;

import java.util.Scanner;

/*
 * 화씨 = (float)섭씨 * 1.8F + 32.0F
 * 화씨 = (섭씨 * 9/5) + 32
 * 
 * cel2fah() 메서드를 선언하여
 * 섭씨 온도를 전달받아 화씨 변환한 다음 return
 * 
 * main() 에서는 섭씨 온도를 키보드를 통해 입력받고
 * cel2fah() 메서드에 전달하여 결과를 받아서
 * 출력
 * 
 */

public class Class011 {
	
	/*
	 * 섭씨온도(int) 를 매개변수로 전달받아
	 * 화씨온도(float) 로 계산한 후 return 
	 * 
	 * method 만들때 void 키워드나
	 * 변수 타입(int, float) 의 키워드를 사용할수 있다
	 * 이러한 것을 method의 return type 이라고 한다
	 * void 키워드 : void type
	 * 그외 키워드(예,int) : int return type 
	 * 
	 * float return type 의 cel2fah() 
	 * method 라고 부른다
	 */
	public static float cel2fah(int cel) {

		// 화씨 = (float)섭씨 * (1.8F + 32.0F)
		float fah = (float)cel * 1.8f + 32.0f;
		return fah;
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("섭씨온도 >> ");
		int cel = scan.nextInt();
		
		float fah = cel2fah(cel);
		System.out.println(fah);
	}
}
