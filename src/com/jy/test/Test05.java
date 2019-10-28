package com.jy.test;



/**
* <p>Title: Test05</p>
* <p>Description: 2+22+222+2222.。。。。。</p>
* @author zoukx
* @date 2019年10月28日
*/
public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2+22+222
		System.out.println(sumAll(5));

	}
	
	// 2 获得每一位相加的结果
	public static long sumAll(int index) {
		long sum = 0;
		for (int i = 1; i <= index; i++) {
			sum = sum + getNumByIndex(i);
		}
		return sum;
	}
	
	// 1 获得指定的位置的值
	public static long getNumByIndex(int index) {
		if (index==1) {
			return 2;
		}
		
		return getNumByIndex(index-1)*10+2;
	}

}
