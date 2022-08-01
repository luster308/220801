
public class Test2 {

	public static void main(String[] args) {
//1부터 100까지 소수를 출력하기
		int count = 0;

		for (int i = 2; i < 101; i++) {
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 1) {
				System.out.printf("%d\t", i);
			}
			count = 0;
		}

	}

}
