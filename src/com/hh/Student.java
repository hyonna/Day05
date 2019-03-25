package com.hh;

import java.util.Scanner;

public class Student {

	// 멤버변수 선언

	String name;
	int id;
	int kor;
	int eng;
	int math;
	int total;
	double avg;

	// 멤버메서드 선언 -> Dirty3 번을 참고하시오.
	public Student input(int index) {
		Scanner scan = new Scanner(System.in);

		System.out.println((index + 1) + "번 학생 아이디를 입력하세요");
		id = scan.nextInt();
		System.out.println();
		System.out.println((index + 1) + "번 학생 이름을 입력하세요");
		name = scan.next();
		System.out.println();
		System.out.println((index + 1) + "번 학생의 국어 점수를 입력하세요");
		kor = scan.nextInt();
		System.out.println((index + 1) + "번 학생의 영어 점수를 입력하세요");
		eng = scan.nextInt();
		System.out.println((index + 1) + "번 학생의 수학 점수를 입력하세요");
		math = scan.nextInt();
		total = kor + eng + math;
		avg = total / 3.0;

		return this;
	}

	public void print() {
		System.out.println("****정보 조회****");
		System.out.println("번호 : " + id);
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor + " 점");
		System.out.println("영어 : " + eng + " 점");
		System.out.println("수학 : " + math + " 점");
		System.out.println("총점 : " + total + " 점");
		System.out.println();
	}

}
