package com.dirty.dirty;

import java.util.Arrays;
import java.util.Scanner;

public class Dirty3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student[] students = null;

		while (true) {
			System.out.println("************");
			System.out.println("1. 학 생 등 록 ");
			System.out.println("2. 전 체 정 보 조 회");
			System.out.println("3. 학 생 정 보 검 색");
			System.out.println("4. 전 체 정 보 총 점 순"); // 최대값부터 정렬
			System.out.println("5. 프로그램 종료");
			System.out.println("************");
			int selection = scan.nextInt();

			if (selection == 1) {
				// 내가 입력한 수 만큼 객체를 넣을 배열 크기가 정해진다.
				System.out.println("학생수를 입력하세요");
				int stNum = scan.nextInt();
				students = new Student[stNum];

				for (int i = 0; i < stNum; i++) {
					Student student = new Student();
					students[i] = student.input(i);
				}

			} else if (selection == 2) {
				for (int i = 0; i < students.length; i++) {
					students[i].print();
				}
			} else {
				break;

			}
		}

	}
}
