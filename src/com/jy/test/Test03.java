package com.jy.test;

/**
* <p>Title: Test03</p>
* <p>Description: 递归金典练习</p>
* @author zoukx
* @date 2019年10月28日
*/
public class Test03 {
	
	public static void main(String[] args) {
		long result = f(3);
		System.out.println(result);
	}

	/**
	 * <p>Title: f</p>
	 * <p>Description: 获得指定位置的等比数列的值</p>
	 * @param index： 指定位置
	 * @return:该位置的值
	 */
	public static long f(int index) {
		if (index==1) {
			return 1;
		}
		
		return f(index-1)*2;
	}

}
