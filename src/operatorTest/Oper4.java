package operatorTest;

import java.util.Scanner;

public class Oper4 {
	public static void main(String[] args) {

//		 심리테스트
		
		/*
		 * Q.당신이 좋아하는 색을 선택하세요.
		 * 1. 빨간색
		 * 2. 노란색
		 * 3. 검은색
		 * 4. 흰색
		 * 
		 * 빨간색: 불같고 열정적이고 적극적이다.
		 * 노란색: 발랄하고 밝고 귀엽고 개성있고 착하다.
		 * 검은색: 묵묵하고 든든하고 냉철하고 멋지다.
		 * 흰색: 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
		 */
	
//		변수설정
		String questionMsg = "Q. 당신이 좋아하는 색을 선택하세요. \n1. 빨간색\n2. 노란색\n3. 검은색\n4. 흰색\n내가 고른 번호: ";
		String resultRed = "빨간색: 불같고 열정적이고 적극적이다";
		String resultYellow = "발랄하고 밝고 귀엽고 개성있고 착하다.";
		String resultBlack = "묵묵하고 든든하고 냉철하고 멋지다.";
		String resultWhite = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
		String errorMsg = "다시 입력해주세요.";
		String resultMsg = null;
		int answerNumber = 0;
		
		Scanner sc = new Scanner(System.in);
		
//		출력값
		System.out.print(questionMsg);
		answerNumber = sc.nextInt();

		resultMsg =  answerNumber == 1? resultRed : 
			answerNumber == 2? resultYellow : 
				answerNumber == 3? resultBlack : 
					answerNumber == 4? resultWhite : errorMsg;
		
		System.out.println(resultMsg);
	}
}
