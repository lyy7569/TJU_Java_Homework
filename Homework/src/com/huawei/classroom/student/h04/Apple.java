package com.huawei.classroom.student.h04;

public class Apple {
		//成员变量
		private String color;
		private int size;
		
		//构造方法
		public Apple(int size, String color) {
			this.size = size;
			this.color = color;
		}
		public Apple() {
			this(10,"red");
		}
		
		//成员方法
		public int getSize() {
			return size;
		}
		public String getColor() {
			return color;
		}
}
