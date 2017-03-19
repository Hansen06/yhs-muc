package com.lintcode;

public class StringUtils524 {
	/**
     * @param originalStr the string we want to append to with spaces
     * @param size the target length of the string
     * @return a string
     */
    static public String leftPad(String originalStr, int size) {
        // Write your code here
    	StringBuffer sb = null;
    	int originalStr_len = originalStr.length();
        while(originalStr_len < size){
        	sb = new StringBuffer();
        	sb.append(" ").append(originalStr);
        	originalStr = sb.toString();
        	originalStr_len = originalStr.length();
        	
        }
		return originalStr;
        
    }

    /**
     * @param originalStr the string we want to append to
     * @param size the target length of the string
     * @param padChar the character to pad to the left side of the string
     * @return a string
     */
    static public String leftPad(String originalStr, int size, char padChar) {
        // Write your code here
    	StringBuffer sb = null;
    	int originalStr_len = originalStr.length();
        while(originalStr_len < size){
        	sb = new StringBuffer();
        	sb.append(padChar).append(originalStr);
        	originalStr = sb.toString();
        	originalStr_len = originalStr.length();
        	
        }
    	return originalStr;
    }
    
    public static void main(String[] args) {
		StringUtils524 s = new StringUtils524();
		String str = s.leftPad("1", 2,'a');
		System.out.println(str);
	}
}
