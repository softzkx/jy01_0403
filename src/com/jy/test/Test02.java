package com.jy.test;



/**
* <p>Title: Test02</p>
* <p>Description: 递归练习打印三角形</p>
* @author zoukx
* @date 2019年10月28日
*/
public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printX(3);
		
		
		
		
	}
	
	/**
	 * <p>Title: printX</p>
	 * <p>Description: 接收一个参数 在一行上打印参数个数的星星</p>
	 * @param count:个数
	 */
	public static void printX(int count) {
		if(count<=0) {
			return;
		}
		printX(count-1);
		for (int i = 0; i < count; i++) {
			System.out.print("*");
		}
		System.out.println();
		
	}

}
