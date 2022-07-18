package controlTest;

import java.util.Scanner;

public class IfTask {
	
	public static void main(String[] args) {
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

//		if문 작성
//		if(answerNumber == 1) {
//			resultMsg = resultRed;
//		}
//		else if(answerNumber == 2) {
//			resultMsg = resultYellow;
//		}
//		else if(answerNumber == 3) {
//			resultMsg = resultBlack;
//		}
//		else if(answerNumber == 4) {
//			resultMsg = resultWhite;
//		}
//		else {
//			resultMsg = errorMsg;
//		}		

//		switch문 사용
		switch(answerNumber) {
		case 1:
			resultMsg = resultRed;
			break;
		case 2:
			resultMsg = resultYellow;
			break;
		case 3:
			resultMsg = resultBlack;
			break;
		case 4:
			resultMsg = resultWhite;
			break;
		default:
			resultMsg = errorMsg;
			break;
		}
				
		System.out.println(resultMsg);
	}

}
