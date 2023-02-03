package operator;

public class Boxing {
    
    public static void main(String[] args) {
        int a = 25;
        double b = (double) a / 3;

        String c = "25";

        //int d = (int)c; // error (기본형) 객체형
        int d = Integer.parseInt(c); // 문자열을 정수로 변환
    }
}
