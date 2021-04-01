package com.java;

public class Armstrong {
	public static void main(String[] args) {
		int a =  153;
		int original=a;
		int c = 0;
		while (a>0) {
			int r = a%10;
			c=c+(r*r*r);
			a=a/10;
		}
		System.out.println(a);
		System.out.println(original);
		System.out.println(c);
			if (original==c) {
				System.out.println("armstrong");
			} else {
				System.out.println("not armstrong");
			}
	}

}
