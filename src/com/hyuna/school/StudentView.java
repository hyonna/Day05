package com.hyuna.school;

public class StudentView {
	
	//listView 
	//학생 정보 전체 출력
	
	
	
	public void listView(Student student) {
		
		
		System.out.println("=================================");
		System.out.println("학생 번호 : " + student.num);
		System.out.println("학생 이름 : " + student.name);
		System.out.println(student.name + " 학생의 국어 점수 : " + student.kor + "점");
		System.out.println(student.name + " 학생의 수학 이름 : " + student.math + "점");
		System.out.println(student.name + " 학생의 영어 이름 : " + student.eng + "점");
		System.out.println(student.name + " 학생의 총점 : " + student.total + "점");
		System.out.printf("%s 학생의 평균 : %.2f 점\n", student.name, student.avg);
		System.out.println("=================================");
		System.out.println();
		
		
		
		
	}
	
	
	//view
	//한명의 학생 정보를 출력
	
	public void view(Student student) {
		
		
		System.out.println("****찾은 학생****");
		System.out.println("=================================");
		System.out.println("번호 : " + student.num);
		System.out.println("이름 : " + student.name);
		System.out.println("국어 : " + student.kor + " 점");
		System.out.println("영어 : " + student.eng + " 점");
		System.out.println("수학 : " + student.math + " 점");
		System.out.println("총점 : " + student.total + " 점");
		System.out.printf("평균 : %.2f 점\n",student.avg);
		System.out.println("=================================");
		System.out.println();
		
		
		
	}
	

}
