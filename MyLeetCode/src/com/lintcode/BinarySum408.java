package com.lintcode;

public class BinarySum408 {

	public static void main(String[] args) {
		
		String a = "11";
		String b = "1";
		
		BinarySum408 b1 = new BinarySum408();
		b1.addBinary(a, b);
		System.out.println(b1.addBinary(a, b));
		
//		String arr[] = a.split("");
//		System.out.println(a.split("").length);
//		for(int i = 1;i < arr.length; i++){
//			System.out.println(arr[i]);
//		}
		
	}
	public String addBinary(String a, String b) {
		
		String result = "";  
        int aLen = a.length() - 1;  
        int bLen = b.length() - 1;  
        int sum = 0;  
        while(aLen>=0 || bLen>=0){  
            if(aLen>=0){  
                sum +=Integer.parseInt(a.substring(aLen,aLen+1));  
                aLen--;  
            }  
            if(bLen>=0){  
                sum +=Integer.parseInt(b.substring(bLen,bLen+1));  
                bLen--;  
            }  
            if(sum==2){  
                result = "0" + result;  
                sum=1;  
            }else if(sum==0 || sum==1) {  
                result = sum +"" + result;  
                sum = 0;  
            }else if(sum==3){  
                result = "1" + result;  
                sum = 1;  
            }  
        }  
        if(sum==1)  
            result = "1" + result;  
        return result;  
    }
}
