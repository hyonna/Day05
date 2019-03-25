package com.hyuna.methods;

public class MethodMain3 {

	public static void main(String[] args) {

		MethodTest3 t3 = new MethodTest3();

		int num = 3;

		t3.test(num);

		System.out.println(num);

		Product p1 = new Product();

		p1.price = 700;

		t3.test2(p1);

		System.out.println(p1.price);

		t3.test3(p1);
		System.out.println(p1.price);
		
		
	}

}
