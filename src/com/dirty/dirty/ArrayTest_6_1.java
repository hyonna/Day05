package com.dirty.dirty;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest_6_1 {

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

		Scanner sc = new Scanner(System.in);

		int num = 0;
		String[] name = null;
		int[] id = null;
		int[] kor = null;
		int[] eng = null;
		int[] math = null;
		int[] total = null;
		int temp = 0;
		String sTemp = "";
		

		boolean menu = true;

		while (menu) {

			System.out.println("************");
			System.out.println("1. 학 생 등 록 ");
			System.out.println("2. 전 체 정 보 조 회");
			System.out.println("3. 학 생 정 보 검 색");
			System.out.println("4. 전 체 정 보 총 점 순"); // 최대값부터 정렬
			System.out.println("5. 프로그램 종료");
			System.out.println("************");

			int select = sc.nextInt();

			if (select == 1) {

				if (id == null) {

					System.out.println("학생수를 입력하세요");
					int sNum = sc.nextInt();
					id = new int[sNum];
					name = new String[sNum];
					kor = new int[sNum];
					eng = new int[sNum];
					math = new int[sNum];
					total = new int[sNum];
					

				}

				System.out.println();

				for (int i = 0; i < id.length; i++) {

					System.out.println((i + 1) + "번 학생 아이디를 입력하세요");
					id[i] = sc.nextInt();

					System.out.println();

					System.out.println((i + 1) + "번 학생 이름을 입력하세요");
					name[i] = sc.next();

					System.out.println();

					System.out.println((i + 1) + "번 학생의 국어 점수를 입력하세요");
					kor[i] = sc.nextInt();
					System.out.println((i + 1) + "번 학생의 영어 점수를 입력하세요");
					eng[i] = sc.nextInt();
					System.out.println((i + 1) + "번 학생의 수학 점수를 입력하세요");
					math[i] = sc.nextInt();
					
					
					total[i] += kor[i] + eng[i] + math[i];
					System.out.println((i + 1) + "학생의 총 점수 : " + total[i] + "점");

				}

				num++;

				System.out.println();

			} else if (select == 2) {

				if (id != null) {

					for (int i = 0; i < id.length; i++) {

						System.out.println("****정보 조회****");
						System.out.println((i + 1) + "번 학생");
						System.out.println("번호 : " + id[i]);
						System.out.println("이름 : " + name[i]);
						System.out.println("국어 : " + kor[i] + "점");
						System.out.println("영어 : " + eng[i] + "점");
						System.out.println("수학 : " + math[i] + "점");
						System.out.println();

					}

				} else {

					System.out.println("등록된 학생이 없습니다");

				}

			} else if (select == 3) {

				if (id != null) {

					System.out.println("검색할 학생의 번호를 입력하세요");
					int idNum = sc.nextInt();
					int index = 0;

					for (int i = 0; i < id.length; i++) {

						if (id[i] == idNum) {

							index = i;
							break;

						}

					}

					System.out.println("학생 번호가 " + idNum + " 인 학생의 정보");
					System.out.println("번호  : " + id[index]);
					System.out.println("이름  : " + name[index]);
					System.out.println("국어  : " + kor[index] + "점");
					System.out.println("영어  : " + eng[index] + "점");
					System.out.println("수학  : " + math[index] + "점");
					System.out.println();

				} else {

					System.out.println("등록된 학생이 없습니다");

				}

			} else if(select == 4) {
				
				if (id != null) {

					System.out.println("****총점 순 정렬****");
					
					for (int i = 0; i < total.length; i++) {

						for(int j = i + 1; j < total.length; j++) {
						
							if(total[i] < total[j]) {
						
								temp = total[i];
								total[i] = total[j];
								total[j] = temp;
						
								temp = id[i];
								id[i] = id[j];
								id[j] = temp;
								
								temp = kor[i];
								kor[i] = kor[j];
								kor[j] = temp;
								
								temp = eng[i];
								eng[i] = eng[j];
								eng[j] = temp;
								
								temp = math[i];
								math[i] = math[j];
								math[j] = temp;
								
								sTemp = name[i];
								name[i] = name[j];
								name[j] = sTemp;
										
								
							}
						
						}
						
						
					}
					
					for (int i = 0; i < id.length; i++) {

						System.out.println("****정보 조회****");
						System.out.println((i + 1) + "위");
						System.out.println("번호 : " + id[i]);
						System.out.println("이름 : " + name[i]);
						System.out.println("국어 : " + kor[i] + "점");
						System.out.println("영어 : " + eng[i] + "점");
						System.out.println("수학 : " + math[i] + "점");
						System.out.println();
						total[i] = kor[i] + eng[i] + math[i];
						System.out.println(name[i] + "학생의 총 점수 : " + total[i] + "점");
						System.out.println();

					}

				} else {

					System.out.println("등록된 학생이 없습니다");

				}
					
					

				
				
			} else {

				break;

			}

		}

		System.out.println("프로그램 종료");

	}

}
