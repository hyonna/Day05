package com.hyuna.methods;

import java.util.Scanner;

public class MethodMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. plus");
		System.out.println("2. minus");
		int select = sc.nextInt();
		
		MethodTest1 m1 = new MethodTest1();
		
		if(select == 1) {
			
			System.out.println("1번 숫자 입력");
			
			
			System.out.println();
			
		} else {
			
			
			m1.minus();
		}
		
		System.out.println("사이즈를 입력하세요");
		int size = sc.nextInt();
		
		m1.bark(55); //인자값
		


	}

}
