package com.lintcode;

public class IntegerSorting463 {
	  /**
     * @param A an integer array
     * @return void
     */
    public int[] sortIntegers(int[] A,int low,int high) {
        // Write your code here
    	/*
    	 * ц╟ещеепР
    	int len = A.length;
    	for(int i = 0;i <= len-1;i++){
    		for(int j = 0;j < len-1-i;j++){
    			if(A[j]>A[j+1]){
    				int temp = 0;
    				temp = A[j];
    				A[j] = A[j+1];
    				A[j+1] = temp;
    			}
    		}
    	}
    	*/
    	
    	/*
    	 * ©Лее
    	 */

    	int first = low;
    	int last = high;
    	int key = A[low];
    	while(first < last){
    		while(first < last && A[last] >= key){
    			last--;
    		}
    		if(first < last){
    			int temp = A[last];
    			A[last] = A[first];
    			A[first] = temp;
    			first++;
    		}
 
    		while(first < last && A[first] <= key){
    			first++;
    		}
    		if(first < high){
    			int temp = A[last];
    			A[last] = A[first];
    			A[first] = temp;
    			last--;
    		}
    	}
    	System.out.print("l="+(first+1)+"h="+(last+1)+"povit="+key+"\n");
    	if(first > low)
    		sortIntegers(A,low,first-1);
    	if(last < high)
    		sortIntegers(A,first+1,high);
    	
    	return A;
//    	for(int k = 0;k < A.length;k++){
//    		System.out.println(A[k]);
//    	}
    }
    
    public static void main(String[] args) {
    	int[] A = {3,2,1,4,5};
		IntegerSorting463 sort = new IntegerSorting463();
		int[] result = sort.sortIntegers(A,0,A.length-1);
		for(int k = 0;k < result.length;k++){
    		System.out.println(result[k]);
    	}
	}
}
