package operator;

import java.util.Scanner;

public class Operator02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int num = scan.nextInt();
			
		String result =  num % 2 == 0 ? "짝수" : "홀수";	// 짝수입니까? 홀수입니까?
		
		String result2 =  num % 2 == 0 || num % 3 == 0 ? "공배수이다" : "공배수가 아닙니다.";	// num이 2와 3의 공배수입니까?
		
		System.out.println(result);
		System.out.println(result2);
		
		
		
		
		
	}

}


/*





*/