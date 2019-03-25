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
			
			
			m1.hap();
			
		} else {
			
			
			m1.minus();
		}
		
		m1.bark();
		
//		MethodTest1 m1 = new MethodTest1();
//		
//		m1.hap(); //멤버 메서드 호출
//		
//		//메서드 명  minus
//		// 10 - 20의 결과물 출력
//		
//		m1.minus();

	}

}
