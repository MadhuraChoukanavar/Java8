package com.jsp.classTypes.anonymous;

public class TestForLambda {
	public static void main(String[] args) {
//		interfaceLambdatest  l=new interfaceLambdatest ()
//				{
//				public void sight()
//				{
//			System.out.println("senior will sight at park");
//				}};
//				l.sight();
		
		
		
//		interfaceLambdatest  l= ()->{
//			System.out.println("senior will sight at park");
//		};
//		l.sight();
		
		
		
		interfaceLambdatest  l= (i)->System.out.println("senior will sight at park ." + i);
		
		l.sight( 90);
		
}
}
