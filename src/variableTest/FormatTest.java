package variableTest;

public class FormatTest {

	public static void main(String[] args) {
		// 이름, 나이, 몸무게 저장할 변수 선언

		String name = "홍준성";
		int age = 31;
		double weight = 74.8;

		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d살\n몸무게 : %.1fkg", age, weight);
	}

}
