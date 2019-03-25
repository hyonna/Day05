package com.hyuna.methods;

public class MethodTest2 {

	// m1 급여를 받아서 고용보험료 0.2% 계산 출력

	// m2 급여를 받아서 의료보험료 1.3% 계산 출력

	// m3 급여를 받아서 국민연금 1.0% 계산 출력

	// m4 급여를 받아서 산재보험 0.4% 계산 출력

	public void m1(int num) {

		
		System.out.println("고용보험 : " + (int)(num * 0.002) + "원");

	}

	public void m2(int num) {

		System.out.println("의료보험 : " + (int)(num * 0.013) + "원");

	}

	public void m3(int num) {

		System.out.println("국민연금 : " + (int)(num * 0.01) + "원");

	}

	public void m4(int num) {

		
		System.out.println("고용보험 : " + (int)(num * 0.004) + "원");

	}

}
