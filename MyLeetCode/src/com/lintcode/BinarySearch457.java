package com.lintcode;
/*
 * 在一个排序数组中找一个数，返回该数出现的任意位置，如果不存在，返回-1
 */
public class BinarySearch457 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 2, 4, 5, 5};
		int target = 2;
		BinarySearch457 b = new BinarySearch457();
		b.findPosition(arr, target);
		System.out.println(">>>.." + b.findPosition(arr, target));
		
	}
	public int findPosition(int[] nums, int target) {
	        // Write your code here
		int index = 0;
		int len = nums.length;
		int low = 0;
		int hight = nums.length - 1;
		int flag = 0;
		while(low < hight){
			int mid = (low + hight)/2;
			if(nums[mid] == target){
				index = mid;
				break;//找到就退出循环
			}
			if(nums[mid] < target){
				low = mid + 1;
			}
			if(nums[mid] > target){
				hight = mid - 1;
			}
		}
		if(index == 0){
			return -1;
		}else{
			return index; 
		}
	}

}
