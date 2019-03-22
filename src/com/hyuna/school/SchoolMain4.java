package com.hyuna.school;

import java.util.Scanner;

public class SchoolMain4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("학생 수를 입력하세요");
		int num = sc.nextInt();

		Student[] stu = new Student[num];

		Student st = null;

		for (int i = 0; i < num; i++) {

			st = new Student();

			System.out.println();
			System.out.println("학생 번호를 입력하세요");
			st.num = sc.nextInt();

			System.out.println("학생 이름을 입력하세요");
			st.name = sc.next();
			
			System.out.println(st.name + "학생의 국어점수를 입력하세요");
			st.kor = sc.nextInt();

			System.out.println(st.name + "학생의 영어점수를 입력하세요");
			st.eng = sc.nextInt();
			
			System.out.println(st.name + "학생의 수학점수를 입력하세요");
			st.math = sc.nextInt();

			st.total = st.kor + st.eng + st.math;
			st.avg = st.total / 3.0;
			
			stu[i] = st;
			
			

		}
		
		System.out.println();
		

		System.out.println("**학 생 정 보**");
		System.out.println();
		
		for (int i = 0; i < num; i++) {

			System.out.println("=================================");
			System.out.println("학생 번호 : " + stu[i].num);
			System.out.println("학생 이름 : " + stu[i].name);
			System.out.println(stu[i].name + " 학생의 국어 점수 : " + stu[i].kor + "점");
			System.out.println(stu[i].name + " 학생의 수학 이름 : " + stu[i].math + "점");
			System.out.println(stu[i].name + " 학생의 영어 이름 : " + stu[i].eng + "점");
			System.out.println(stu[i].name + " 학생의 총점 : " + stu[i].total + "점");
			System.out.printf("%s 학생의  평균 : %.2f 점\n",stu[i].name, stu[i].avg);
			System.out.println("=================================");
			System.out.println();

		}

	}

}
