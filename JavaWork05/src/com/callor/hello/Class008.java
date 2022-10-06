package com.callor.hello;

public class Class008 {
	
	public static void main(String[] args) {
		int[] nums = new int[64];
		
		// nums 배열에 0 부터 63번까지
		// 순서대로 1 ~ 64까지 정수를 저장해 놓았다
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = i + 1;
		}
		
		for(int i = 0 ; i < 100 ; i++) {
			
			int index1 = (int)(Math.random() * 64);
			int index2 = (int)(Math.random() * 64);
			
			int _num = nums[index1];
			nums[index1] = nums[index2];
			nums[index2] = _num;
			
		}
		
		int[] lottos = new int[6];
		for(int i = 0 ; i < 6 ; i++) {
			// System.out.print(nums[i] + "  ");
			lottos[i] = nums[i];
		}
		
		for(int i = 0 ; i < lottos.length ; i++) {
			for(int j = i + 1 ; j < lottos.length ; j++) {
				if(lottos[i] > lottos[j]) {
					int _num = lottos[i];
					lottos[i] = lottos[j];
					lottos[j] = _num;
				}
			}
		}
		
		for(int i = 0 ; i < lottos.length ; i++) {
			System.out.print(lottos[i] + "  ");
		}
		
		
	}

}
