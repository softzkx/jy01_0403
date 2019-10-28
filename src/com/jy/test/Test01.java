package com.jy.test;



/**
* <p>Title: Test01</p>
* <p>Description: 递归学习</p>
* for巡海都能改成递归的形式 但是 递归不一定用循环能解决
* 以后用递归的场景不多 但是有些特定的场景不用递归 做不出来（如给你一个文件夹 找里面那个的文件）
* @author zoukx
* @date 2019年10月28日
*/
public class Test01 {

	public static void main(String[] args) {
		
		sayHello(3);
	}
	
	/**
	 * <p>Title: sayHello</p>
	 * <p>Description: </p>
	 * @param count 打印的次数
	 */
	public static void sayHello(int count) {
		if(count<1) {
			return;
		}
		System.out.println("hello world");
		count = count-1;
		sayHello(count);
	}

}
