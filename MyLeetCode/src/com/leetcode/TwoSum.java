package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static void main(String[] args) {
		TwoSum t = new TwoSum();
		int[] numbers = {3,2,4};
		int targe = 6;
		int[] res = t.twoSum(numbers,targe);
		for(int i = 0; i < res.length; i++){
			System.out.println(i == res.length - 1 ? res[i] : res[i] + ",");
		}
	}
	
	public int[] twoSum(int[] numbers, int target){
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0; i < numbers.length; i++){
			map.put(numbers[i], i);
		}
		
		for(int i = 0; i < numbers.length; i++){
			int newTarget = target - numbers[i];
			if(map.containsKey(newTarget) && i != map.get(newTarget)){
				return new int[]{i, map.get(newTarget)};
			}
		}
		return null;
	}
}
