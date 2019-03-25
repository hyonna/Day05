package com.hyuna.methods;

import java.util.Scanner;

public class MethodMain2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		MethodTest2 methodTest2 = new MethodTest2();

		int num = 0;

		boolean menu = true;

		while (menu) {

			System.out.println("1. 급여입력");
			System.out.println("2. 고용보험");
			System.out.println("3. 의료보험");
			System.out.println("4. 국민연금");
			System.out.println("5. 산재보험");
			System.out.println("6. 종      료");
			int select = sc.nextInt();

			if (select == 1) {

				System.out.println("급여를 입력하세요");
				System.out.println();
				num = sc.nextInt();

			} else if (select == 2) {

				if (num != 0) {
					methodTest2.m1(num);
				} else {
					System.out.println("급여를 다시 입력하세요");

				}
				System.out.println();
				
			} else if (select == 3) {

				if (num != 0) {
					methodTest2.m2(num);
				} else {
					System.out.println("급여를 다시 입력하세요");
				}
				System.out.println();
				
			} else if (select == 4) {

				if (num != 0) {
					methodTest2.m3(num);
				} else {
					System.out.println("급여를 다시 입력하세요");
				}
				System.out.println();
				
			} else if (select == 5) {

				if (num != 0) {
					methodTest2.m4(num);
				} else {
					System.out.println("급여를 다시 입력하세요");
				}
				System.out.println();
				
			} else {

				System.out.println("프로그램 종료");
				break;

			}

		}

	}

}
