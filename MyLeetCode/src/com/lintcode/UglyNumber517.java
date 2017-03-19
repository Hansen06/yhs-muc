package com.lintcode;

public class UglyNumber517 {
	/**
     * �ж������Ƿ�Ϊ����
     * @param num ���ж�����
     * @return true��������false���ǳ���
     */
    public boolean isUgly(int num) {
        
        if (num <= 0) {
            return false;
        }
        
        while (num % 2 == 0) num /= 2;
        while (num % 3 == 0) num /= 3;
        while (num % 5 == 0) num /= 5;
        
        if (num == 1) {
            return true;
        } else {
            return false;
        }
    }
    /*
     * �õ���index������
     */
    int GetUglyNumber_Solution1(int index)
    {
        if(index <= 0)
            return 0;
        int number = 0;
        int uglyFound = 0;
        while(uglyFound < index)
        {
            ++number;
            if(isUgly(number))
            {
                ++uglyFound;
            }
        }
        return number;
    }
    public static void main(String[] args) {
		UglyNumber517 ug = new UglyNumber517();
		boolean flag = ug.isUgly(1510);
		if(flag){
			System.out.println("it is a UglyNumber");
		}else{
			System.out.println("it is not a UglyNumber");
		}
		
		System.out.println(ug.GetUglyNumber_Solution1(1500));
	
	}
}
