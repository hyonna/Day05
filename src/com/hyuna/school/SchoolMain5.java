package com.hyuna.school;

import java.util.Scanner;

public class SchoolMain5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Teacher teacher = new Teacher();
		StudentView sv = new StudentView();

		System.out.println("선생님의 이름을 입력하세요.");
		teacher.name = sc.next();

		System.out.println("선생님의 과목명을 입력하세요.");
		teacher.subject = sc.next();

		// 선생님의 학생 수 입력
		// 학생의 수 만큼 학생 번호
		// 학생 이름
		// 학생 국어, 영어, 수학 점수

		boolean menu = true;

		while (menu) {

			System.out.println("1.학생정보입력");
			System.out.println("2.전체정보조회");
			System.out.println("3.학생정보검색");
			System.out.println("4.프로그램종료");
			int select = sc.nextInt();

			if (select == 1) {

				System.out.println("선생님의 학생 수 입력");
				int sNum = sc.nextInt();
				teacher.students = new Student[sNum];

				for (int i = 0; i < teacher.students.length; i++) {

					Student stu = new Student();

					System.out.println("학생 번호를 입력허세요");
					stu.num = sc.nextInt();

					System.out.println("학생 이름을 입력하세요");
					stu.name = sc.next();

					System.out.println();
					System.out.println("국어 점수를 입력하세요");
					stu.kor = sc.nextInt();

					System.out.println("영어 점수를 입력하세요");
					stu.eng = sc.nextInt();

					System.out.println("수학 점수를 입력하세요");
					stu.math = sc.nextInt();

					stu.total = stu.kor + stu.eng + stu.math;
					stu.avg = stu.total / 3.0;

					teacher.students[i] = stu;

				}

				System.out.println();

				for (int i = 0; i < teacher.students.length; i++) {

					System.out.println("=================================");
					System.out.println("선생 이름 : " + teacher.name);
					System.out.println("선생 과목 : " + teacher.subject);
					System.out.println("학생 번호 : " + teacher.students[i].num);
					System.out.println("학생 이름 : " + teacher.students[i].name);
					System.out.println(teacher.students[i].name + " 학생의 국어 점수 : " + teacher.students[i].kor + "점");
					System.out.println(teacher.students[i].name + " 학생의 수학 이름 : " + teacher.students[i].math + "점");
					System.out.println(teacher.students[i].name + " 학생의 영어 이름 : " + teacher.students[i].eng + "점");
					System.out.println(teacher.students[i].name + " 학생의 총점 : " + teacher.students[i].total + "점");
					System.out.printf("%s 학생의  평균 : %.2f 점\n", teacher.students[i].name, teacher.students[i].avg);
					System.out.println("=================================");
					System.out.println();

				}

			} else if (select == 2) {

				if (teacher.students != null) {

					System.out.println("========= 전체정보조회 =========");

					for (int i = 0; i < teacher.students.length; i++) {

						sv.listView(teacher.students[i]);

//					System.out.println("=================================");
//					System.out.println("학생 번호 : " + teacher.students[i].num);
//					System.out.println("학생 이름 : " + teacher.students[i].name);
//					System.out.println(teacher.students[i].name + " 학생의 국어 점수 : " + teacher.students[i].kor + "점");
//					System.out.println(teacher.students[i].name + " 학생의 수학 이름 : " + teacher.students[i].math + "점");
//					System.out.println(teacher.students[i].name + " 학생의 영어 이름 : " + teacher.students[i].eng + "점");
//					System.out.println(teacher.students[i].name + " 학생의 총점 : " + teacher.students[i].total + "점");
//					System.out.printf("%s 학생의 평균 : %.2f 점\n", teacher.students[i].name, teacher.students[i].avg);
//					System.out.println("=================================");
//					System.out.println();

					}

				} else {

					System.out.println("등록된 학생이 없습니다");
					break;
				}

			} else if (select == 3) {

				if (teacher.students == null) {
					System.out.println("등록된 학생이 없습니다.");
				} else {
					System.out.println("검색할 학생 번호를 입력하세요 >>");
					int sNum = sc.nextInt();

					for (int i = 0; i < teacher.students.length; i++) {
						if (sNum == teacher.students[i].num) {
							sv.view(teacher.students[i]);
							break;
							
						} else {
							
							System.out.println("해당 학생이 없습니다.");
							break;
							
						}
					}

				} 

			} else {

				System.out.println("프로그램 종료");
				break;

			}

		}

	}

}
