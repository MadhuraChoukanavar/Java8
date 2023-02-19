package com.jsp.classTypes.testclass;

public class NonStaticInnerClass {
	int a = 10;

	private static void m4() {
		System.out.println("private in outer");
	}

	public void m1() {
		System.out.println("m1() in outer  class");
	}

	public class InnerClass {
		
		int b = 20;

		public void m2() {
			NonStaticInnerClass.m4();
			System.out.println("m2() in inner class");
		}
	}

	public void m3() {
		System.out.println(a);

	}

}
