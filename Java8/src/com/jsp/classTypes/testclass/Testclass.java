package com.jsp.classTypes.testclass;

import com.jsp.classTypes.testclass.NonStaticInnerClass.InnerClass;

public class Testclass {

	public static void main(String[] args) {
		NonStaticInnerClass outerClass = new NonStaticInnerClass();
		outerClass.m1();
		InnerClass innerclass = outerClass.new InnerClass();
		innerclass.m2();

	}

}
