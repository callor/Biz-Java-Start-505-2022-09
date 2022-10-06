package com.callor.hello;

public class Class004 {
	
	public static void scorePrint(int[] scores) {
		System.out.println("=".repeat(20));
		int sum = 0;
		for(int i = 0 ; i < scores.length ; i++) {
			System.out.println(scores[i]);
			sum += scores[i];
		}
		System.out.println("-".repeat(20));
		System.out.println(sum);
		System.out.println("=".repeat(20));
	}
	public static void main(String[] args) {
		int[] scores = new int[10];
		for(int i = 0 ; i < scores.length ; i++) {
			scores[i] = (int)(Math.random() * 100) + 1;
		}
		scorePrint(scores);
	}
}
