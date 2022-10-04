package com.callor.hello;

public class Class015 {
	
	public static void main(String[] args) {
		int[] scores = new int[10];
		for(int i = 0 ; i < scores.length ; i++) {
			scores[i] = (int)(Math.random() * 50) + 51;
		}
		
		int sum = 0;
		for(int i = 0 ; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총점 : " + sum);
		
		float avg = (float)sum / (float)scores.length;
		System.out.println("평균 : " + avg);
	}
}
