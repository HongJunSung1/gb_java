package operatorTest;

public class Oper1 {
	public static void main(String[] args) {
		boolean isTrue = 10 == 11; 				//false
		System.out.println(isTrue);
		
		System.out.println(isTrue&&10 == 10); // false
		System.out.println(isTrue||10==10); 	// true
		
		
//		System.out.println(isTrue && 10 == 10); 가 true가 나오도록 수정
		
//		1번
		System.out.println(!isTrue && 10 == 10);
		
//		2번
		System.out.println(isTrue || 10==10);
		
		

	}
}
