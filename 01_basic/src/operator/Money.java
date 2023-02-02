package operator;

public class Money {

	public static void main(String[] args) {
		
		int money = 5378;
		int chunwon = money / 1000; 
		int backwon = ( money % 1000) / 100;
		int shipwon = (( money % 1000) % 100) / 10;
		int ilwon = (( money % 1000) % 100) % 10;
		
		System.out.println("현금 : " + money + "원");
		System.out.println("천원 : " + chunwon + "장");
		System.out.println("백원 : " + backwon + "개");
		System.out.println("십원 : " + shipwon + "개");
		System.out.println("일원 : " + ilwon + "개");
		
	}

}






/*
[문제] 현금 5378원

[실행결과]
현금 5378원
천원 : 5장
백원 : 3개
십원 : 7개
일원 : 8개
*/