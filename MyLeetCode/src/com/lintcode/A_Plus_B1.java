package com.lintcode;
/*
 * ������������a��b, �����ǵĺ�, ������ʹ�� + ����ѧ�������
 */
public class A_Plus_B1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 2;
		int b = 3;
		System.out.println(a^b);
		
		
		
//		A_Plus_B a = new A_Plus_B();
//		a.aplusb(2, 3);
//		System.out.println(">>>>..." + a.aplusb(2, 3));
	}

	public int aplusb(int a, int b) {
        // write your code here, try to do it without arithmetic operators.
		if(a==0)return b;  
        if(b==0)return a;  
        int x1 = a^b;  
        int x2 = (a&b)<<1;  
        return aplusb(x1,x2);  
    }
}
