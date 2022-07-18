package controlTest;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {


////		브론즈		
////		1~100까지 출력
//		for(int i = 0 ; i <100 ; i++) {
//			System.out.println(i+1);
//		}
//		
////		100~1까지 출력
//		
//		for(int i = 0 ; i <100 ; i++) {
//			System.out.println(100-i);
//		}
//		
////		1~100까지 중 짝수만 출력
//		for(int i = 0 ; i< 100 ; i++) {
//			if((double)(i+1)/2 != (i+1)/2 ) {
//				System.out.println(i+2);
//			}
//		}
//		
////		=====================선생님 풀이=====================
//		for (int i = 0; i < 50; i++) {
//			System.out.println((i+1) * 2);
//		}
//		
//		
//		
//		
//		실버
//		1~10까지 합 출력
//		int sum = 0;
//		for(int i = 0 ; i < 10 ; i++) {
//			sum += i+1;
//		}
//		System.out.print(sum);
//		
////		1~n까지 합 출력
//		Scanner sc = new Scanner(System.in);
//		int number=0, answerNumber = 0, sum = 0;
//		
//		System.out.print("이력할 값: ");
//		answerNumber = sc.nextInt();
//		for(int i = 0; i < answerNumber ; i++) {
//			sum += i+1;
//		}
//		System.out.print("결과값: " + sum);
//		
//		
////		골드
////		A~F까지 출력
//				 
//		for(char i = 65 ; i <71 ; i ++) {
//			System.out.print(i);
//		}
//		
////		A~F까지 중 C 제외하고 출력
//		
//		for(char i = 65 ; i < 71 ; i++) {
//			if(i != 67) {
//				System.out.print(i);
//			}
//		}
////		=====================선생님 풀이=====================
//		for(int i = 0; i< 5; i++) {
//			System.out.println((char)(i>1? i+66:i+65));
//		}
//		
//		
//		다이아
//		0 1 2 3 0 1 2 3 0 1 2 3 출력
//		a%n -> 0 ~ n-1
//		
//		int sum = 0;
//		for(int i = 0 ; i<12 ; i++) {
//			sum = 4;
//			
//			if(i > 7) {
//				System.out.print(i-sum-sum);
//				System.out.print(" ");
//			}
//			else if(i > 3) {
//				System.out.print(i-sum);
//				System.out.print(" ");
//			}
//			else {
//				System.out.print(i);
//				System.out.print(" ");
//			}
//		}
//
////		=====================선생님 풀이=====================
//		for(int i = 0; i<12; i++) {
//			System.out.println(i%4 + " ");
//		}
//
//		
////		aBcDeFgHiJ...Z 출력
////		97 66 99 67 99 68...121 98
////		97 66 99
//		char number;
//		for(int i = 0 ; i < 26; i++) {
//			if((double)(i+1)/2 != (i+1)/2) { //홀수 일 때
//				number = (char)(i+97);
//				System.out.print(number);
//			}
//			else { //짝수일 때
//				number = (char)(i +65);
//				System.out.print(number);
		
////	=====================선생님 풀이=====================
//		for(int i = 0 ; i<26; i++) {
//			System.out.print((char)(i % 2 == 0 ? i + 97 : i + 65));
//		}
//			}
//		}
	}
}
