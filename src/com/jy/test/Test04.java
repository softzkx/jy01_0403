package com.jy.test;



/**
* <p>Title: Test04</p>
* <p>Description: 菲薄拉起数列</p>
* @author zoukx
* @date 2019年10月28日
*/
public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long result = f(4);
		System.out.println(result);
	}
	
	/**
	 * <p>Title: f</p>
	 * <p>Description: 获得指定位置的菲薄拉起数列的数字</p>
	 * @param index:位置
	 * @return：该位置的值
	 */
	public static long f(int index) {
		
		
		if (index==1 || index==2) {
			return 1;
		}
		
		return f(index-1)+f(index-2);
	}

}
