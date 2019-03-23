package com.hyuna.school;


public class SchoolMain {

	public static void main(String[] args) {

		// Student class를 참조해서 Student 객체를 생성

		Student st = new Student();

		System.out.println(st);
		System.out.println(st.name);
		System.out.println(st.num);

		st.name = "james";
		st.num = 1;

		System.out.println(st.name);
		System.out.println(st.num);

		Student st2 = new Student();

		System.out.println(st2);
		System.out.println(st2.name);
		System.out.println(st2.num);

		System.out.println("=============");

		System.out.println("total : " + st.total + "점");

		st.kor = 40;
		st.eng = 40;
		st.math = 40;
		st.total = st.kor + st.eng + st.math;
		st.avg = st.total / 0.3;
		
		System.out.println("=============");
		System.out.println("total : " + st.total + "점");

	}

}
