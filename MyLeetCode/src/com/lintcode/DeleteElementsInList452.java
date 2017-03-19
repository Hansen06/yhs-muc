package com.lintcode;

public class DeleteElementsInList452 {
	   
	public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	}
		
	public class Solution {
	    /**
	     * @param head a ListNode
	     * @param val an integer
	     * @return a ListNode
	     */
		
	    public ListNode removeElements(ListNode head, int val) {
	        // Write your code here
	    	ListNode p = head;
	    	if(head == null){
	    		return head;
	    	}
	    	/*
	    	 * 没有判断头结点
	    	 */
	    	while(head.next != null){
	    		if(head.next.val == val){
	    			if(head.next.next != null){
	    				head.next = head.next.next;
	    			}
	    			else{
	    				head.next = null;
	    				break;
	    			}
	    		}else{
	    			head = head.next;
	    		}
	    	}
	    	/*
	    	 * 判断头结点
	    	 */
	    	if(p.val == val)
	    		return p.next;
	    	return p;
	    }
	    
	    /*
	     * 保持前驱节点
	     */
	    public ListNode removeElements1(ListNode head, int val) {
	        // Write your code here
	        if (null == head)
	            return head;

	        ListNode p = head;
	        ListNode pre = null;

	        while (p != null) {
	            if (p.val == val) {
	                ListNode del = p;
	                p = p.next;
	                if (pre != null) {
	                    pre.next = p;
	                } else {
	                    head = p;
	                }

	            } else {
	                pre = p;
	                p = p.next;
	            }
	        }

	        return head;
	    }
	}
	
	
	 
	public static void main(String[] args) {
//		ListNode ls = new ListNode(0);
		
	}
}
