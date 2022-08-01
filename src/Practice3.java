import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액을 입력하세요: ");
		int money = sc.nextInt();   
		
		int [] array = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
//		System.out.println("방 갯수: "+array.length);
//		int mok = money / 50000;   // 2
//		int na = money % 50000;   // 45678
//		mok = na /10000;   // 4
//		na = na % 10000;   // 5678
//		mok = na / 5000;   // 1
//		na = na % 5000;    // 678
		for(int i=0;i<array.length;i++) {
			int mok = money / array[i];   // 몫
			int na = money % array[i];   // 나머지
			System.out.println(array[i]+"원권: "+mok);
			money = na;
		}
	}

}
