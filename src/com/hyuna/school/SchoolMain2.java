package com.hyuna.school;

import java.util.Scanner;

public class SchoolMain2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		Student st1 = new Student();
//		Student st2 = new Student();

		// 학생수를 입력
		// 학생 수 만큼의 학생 객체를 생성해서 이름과 번호를 입력하고 출력

		System.out.println("학생 수를 입력하세요");
		int num = sc.nextInt();

		Student[] stu = new Student[num];
		
		Student st = null;
		

		for (int i = 0; i < num; i++) {

			st = new Student();

			System.out.println("학생 번호를 입력하세요");
			st.num = sc.nextInt();
			

			System.out.println("학생 이름을 입력하세요");
			st.name = sc.next();
			
			stu[i] = st;
			

		}
		
		
		for (int i = 0; i < num; i++) {

			System.out.println("학생 번호 : " + stu[i].num + "학생 이름 : " + stu[i].name);

		}
		
		
	}

}
