package com.huawei.classroom.student.h04;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class MyStack {
	private int[] stack;
	private int top;//跟踪栈的顶部元素的索引
	private int capacity;
	
	public MyStack(int size) {
		stack = new int[size];
		capacity = size;
		top = -1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	public boolean isFull() {
		return top == capacity - 1;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		int element = stack[top];
		top --;
		return element;
	}
	
	public void push(int e) {
		if(isFull()) {
			throw new RuntimeException("Stack is full");
		}
		top++;
		stack[top] = e;
	}
}
