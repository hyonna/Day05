package com.hyuna.methods;

public class MethodTest1 {
	
	//멤버 메서드 합
	public void hap() {
		
		System.out.println(10 + 20);
		
	}
	
	public void minus() {
		
		System.out.println(10 - 20);
		
	}
	
	//메서드명 bark
	//메서드 내에 size 변수를 선언하고 임의의 값을 입력
	//size - 90보다 크면 대형견 - 컹컹컹
	//size - 60보다 크면 중형견 - 멍멍멍
	//그 외 - 소형견 - 왈왈왈
	
	public void bark() {
		
		int size = 50;
		
		if(size >= 90) {
			
			System.out.println("대형견 - 컹컹컹");
			
			
		} else if(size >= 60 && size < 90) {
			
			System.out.println("중형견 - 멍멍멍");
			
		} else {
			
			System.out.println("소형견 - 왈왈왈");
			
		}
		
		
	}
	
	
	
	
}
