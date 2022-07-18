package operatorTest;

import java.util.Scanner;

public class Oper2 {
	public static void main(String[] args) {
//		두 정수 입력받기
		
		Scanner sc = new Scanner(System.in);
		
//		변수값 설정
		int firstNumber = 0, secondNumber = 0;
		String noticeMsg = "두 정수 입력받기: ", lastMsg = "받은 정수: ", resultNumber = null;
		boolean isBigger = false, isSame = false;
		
		
//		두 정수 입력하기
		System.out.print(noticeMsg);
		firstNumber = sc.nextInt();
		secondNumber = sc.nextInt();
		
//		결과값 출력
		System.out.println(lastMsg + firstNumber + ", " +secondNumber);

//		조건식
		isBigger = firstNumber > secondNumber;
		isSame = firstNumber == secondNumber;
		
		resultNumber = isBigger? "큰 값 : " + firstNumber : isSame ? "두 수가 같습니다" : " 큰 값 : " +secondNumber;
		
//		최종 결과값 출력
		System.out.println(resultNumber);
		
	}
}
