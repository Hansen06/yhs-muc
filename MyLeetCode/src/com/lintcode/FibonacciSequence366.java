package com.lintcode;

/*
 * 查找斐波纳契数列中第 N 个数。
 * by yhs 2017/3/1
 */
public class FibonacciSequence366 {

	  /**
     * @param n: an integer
     * @return an integer f(n)
     */
    int fibonacci(int n) {		
        // write your code here
    	/*
    	 * 采用递归思想
    	 */
//    	if(n == 1){
//    		return 0;
//    	}else if(n==2||n==3){
//    		return 1;
//    	}else{
//    		return fibonacci(n-2)+fibonacci(n-1);
//    	}
    	
    	
//    	if(n == 1)
//    		return 0;
//    	if(n == 2)
//    		return 1;
//    	int a = 0;
//    	int b = 1;
//    	int c = 0;
//    	for(int i = 3;i <= n;i++){
//    		c = a + b;
//    		a = b;
//    		b = c;
//    	}
//    	return c;
    	
    	int []result = new int[100];
    	result[0] = 0;
    	result[1] = 1;
    	for(int i = 2;i < result.length;i++){
    		return result[i] = result[i-1] + result[i-2];
    	}
    	return result[n-1];
    }
    int getFibonacci(int m){
    	if(m==0){
    		return 0;
    	}else if(m==1||m==2){
    		return 1;
    	}else{
    		return getFibonacci(m-2)+getFibonacci(m-1);
    	}
    }
    public static void main(String[] args) {
		FibonacciSequence366 fb = new FibonacciSequence366();
		System.out.println(fb.fibonacci(47));
//		System.out.println(fb.getFibonacci(10));
	}
}
