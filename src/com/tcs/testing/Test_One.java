package com.tcs.testing;

public class Test_One {// static polymorphism

	public void details(String a, String b, String c, int d) {
		System.out.println("student name = " + a);
		System.out.println("school name = " + b);
		System.out.println("city = " + c);
		System.out.println("pincode = " + d);
	}

	public static void main(String[] args) {
		Test_One h = new Test_One();
		h.details("Mani", "KRM Public School", "Perambalur", 600232);

	}

}
