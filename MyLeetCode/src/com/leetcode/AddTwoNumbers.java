package com.leetcode;


public class AddTwoNumbers {
	
	public static void main(String[] args) {
		
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode c1 = l1;
		ListNode c2 = l2;
		ListNode pre = new ListNode(0);//set pre head
		ListNode d = pre;
		int sum = 0;
		while(c1 != null || c2 != null){
			if(c1 !=null){ //add one list
				sum += c1.val;
				c1 = c1.next; //move on
			}
			if(c2 != null){ //add another list
				sum += c2.val;
				c2 = c2.next;//move on
			}
			
			//buile next node
			d.next = new ListNode(sum%10);
			sum /= 10;
			d = d.next;
		}
		if(sum == 1)
			d.next = new ListNode(1);
		
		return pre.next;
        
    }
	public class ListNode{
		int val;
		ListNode next;
		public ListNode(int x) {
			val = x;
			next = null;
		}
	}
}
