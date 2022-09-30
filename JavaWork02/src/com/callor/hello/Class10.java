package com.callor.hello;

public class Class10 {
	public static void main(String[] args) {
		int index = 0;
		int count = 0;
		int sum = 0;
		while(index++ < 100) {
			if(index % 2 == 0 || index % 3 == 0) {
				sum += index;
				count++;
			}
		}
		System.out.printf("개수 %d, 합 %d\n",count, sum);
	}
}
