package com.huawei.classroom.student.h03;

import java.math.BigInteger;
import java.util.Arrays;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//isNarcissisticNum 测试用例
		if(!Home03.isNarcissisticNum(405)) {
			System.out.println("isNarcissisticNum 测试用1通过");
		}
		if(Home03.isNarcissisticNum(153)) {
			System.out.println("isNarcissisticNum测试用2通过");
		}
		
		//Perfectnumber 测试用例
		if(Home03.Perfectnumber(8128)) {
			System.out.println("Perfectnumber 测试用1通过");
		}
		
		//factorial 测试用例
		if(Home03.factorial(1)==1) {
			System.out.println("factorial 测试用1通过");
		}
		//binToDec 测试用例
		//System.out.println(Home03.binToDec("111"));
		
		//getRoot 测试用例
		if(Arrays.equals(Home03.getRoot(1, -2, 1), new double[] {1,1})) {
			System.out.println("getRoot 测试用1通过");
		}
		if(Home03.getRoot(1, -2, 2) == null) {
			System.out.println("getRoot 测试用2通过");
		}
		
		//getPascalTriangle 测试用例
		if(Arrays.equals(Home03.getPascalTriangle(1), new int[]{1})) {
			System.out.println("getPascalTriangle 测试用例1通过");
		}
		if(Arrays.equals(Home03.getPascalTriangle(2), new int[]{1,1})) {
			System.out.println("getPascalTriangle 测试用例2通过");
		}
		if(Arrays.equals(Home03.getPascalTriangle(3), new int[]{1,2,1})) {
			System.out.println("getPascalTriangle 测试用例3通过");
		}
		if(Arrays.equals(Home03.getPascalTriangle(4), new int[]{1,3,3,1})) {
			System.out.println("getPascalTriangle 测试用例4通过");
		}
		
		//zipSpace 测试用例
		if(Home03.zipSpace("12  3 4").equals("1234") ) {
			System.out.println("zipSpace 测试用1通过");
		}
	}
	 

}
