package com.huawei.classroom.student.h04;

public class Triangle {
	//边长A、B、C
	private int A;
	private int B;
	private int C;
	private double area;
	
	public Triangle() {	
	}
	
	public int getA(int A) {
		return this.A = A;
	}
	public int getB(int B) {
		return this.B = B;
	}
	public int getC(int C) {
		return this.C = C;
	}
	public void setA(int A) {
		this.A = A;
	}
	public void setB(int B) {
		this.B = B;
	}
	public void setC(int C) {
		this.C = C;
	}
	
	public double getArea() {
		double p = (A + B + C) / 2.0;//计算半周长
		area = Math.sqrt(p*(p-A)*(p-B)*(p-C));//计算面积
		return area;
	}
}
