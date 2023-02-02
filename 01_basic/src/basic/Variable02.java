package basic;

public class Variable02 {
	int a; //필드, 초기화
	
	public static void main(String[] args) {
		int a = 5;	//지역변수(local variable) 쓰레기값
		System.out.println("지역변수 a = " + a);
		
		System.out.println("필드 a = " + a); // local a 출력
	}

}
