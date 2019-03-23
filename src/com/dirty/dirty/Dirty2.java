package com.dirty.dirty;

import java.util.Arrays;
import java.util.Scanner;

public class Dirty2 {

	public static void main(String[] args) {

		// 1. 학생등록
		// 학생 수를 입력
		// 학생 번호를 입력(학생 수 만큼)
		// 학생 이름 입력
		// 학생 국어 점수 입력
		// 학생 수학 점수 입력
		// 학생 영어 점수 입력

		// 2. 전체 정보 조회
		// 학생 번호, 이름, 국어, 영어, 수학 점수 출력

		// 3. 학생 정보 검색
		// 검색할 학생의 번호를 입력 받아서 그 학생의 정보만 출력

		// 4. 프로그램 종료

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
					System.out.println((i + 1) + "번 학생 아이디를 입력하세요");
					student.id = scan.nextInt();
					System.out.println();
					System.out.println((i + 1) + "번 학생 이름을 입력하세요");
					student.name = scan.next();
					System.out.println();
					System.out.println((i + 1) + "번 학생의 국어 점수를 입력하세요");
					student.kor = scan.nextInt();
					System.out.println((i + 1) + "번 학생의 영어 점수를 입력하세요");
					student.eng = scan.nextInt();
					System.out.println((i + 1) + "번 학생의 수학 점수를 입력하세요");
					student.math = scan.nextInt();

					student.total = student.kor + student.eng + student.math;

					students[i] = student;
				}
			} else if (selection == 2) {
				for (int i = 0; i < students.length; i++) {
					System.out.println("****정보 조회****");
					System.out.println((i + 1) + "번 학생");
					System.out.println("번호 : " + students[i].id);
					System.out.println("이름 : " + students[i].name);
					System.out.println("국어 : " + students[i].kor + " 점");
					System.out.println("영어 : " + students[i].eng + " 점");
					System.out.println("수학 : " + students[i].math + " 점");
					System.out.println("총점 : " + students[i].total + " 점");
					System.out.println();
				}
			} else if (selection == 3) {
				if (students.length == 0 || students == null) {
					System.out.println("등록된 학생이 없습니다.");
				} else {
					System.out.println("검색할 학생 번호를 입력하세요 >>");
					int searchId = scan.nextInt();
					int foundIndex = -1;
					for (int i = 0; i < students.length; i++) {
						if (searchId == students[i].id) {
							foundIndex = i;
							break;
						}
					}
					if (foundIndex == -1) {
						System.out.println("해당 학생이 없습니다.");
					} else {
						System.out.println("****정보 조회****");
						System.out.println("찾은 학생");
						System.out.println("번호 : " + students[foundIndex].id);
						System.out.println("이름 : " + students[foundIndex].name);
						System.out.println("국어 : " + students[foundIndex].kor + " 점");
						System.out.println("영어 : " + students[foundIndex].eng + " 점");
						System.out.println("수학 : " + students[foundIndex].math + " 점");
						System.out.println("총점 : " + students[foundIndex].total + " 점");
						System.out.println();
					}
				}
			} else if (selection == 4) {

				for (int i = 0; i < students.length; i++) {
					for (int j = i + 1; j < students.length; j++) {
						Student stTemp;
						if (students[i].total < students[j].total) {
							
							stTemp = students[i];
							students[i] = students[j];
							students[j] = stTemp;
						}
					}
				}

				for (int i = 0; i < students.length; i++) {
					System.out.println("****정보 조회****");
					System.out.println((i + 1) + "위");
					System.out.println("번호 : " + students[i].id);
					System.out.println("이름 : " + students[i].name);
					System.out.println("국어 : " + students[i].kor + "점");
					System.out.println("영어 : " + students[i].eng + "점");
					System.out.println("수학 : " + students[i].math + "점");
					System.out.println();
					students[i].total = students[i].kor + students[i].eng + students[i].math;
					System.out.println(students[i].name + "학생의 총 점수 : " + students[i].total + "점");
					System.out.println();

				}

			} else {

				break;

			}
		}

	}
}
