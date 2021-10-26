package com.examplelambda8;

public interface AdditionInterface {
		
		public int sum(int a,int b);
		default void  sum1(int c,int d) {
		 c = 30;
		 d = 40;
		}
		
}



