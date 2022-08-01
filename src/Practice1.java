import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("계산하실 초: ");
		int su = sc.nextInt();
		
		int hour = su / 3600;
		int sec = su % 3600;
		int min = sec /60;
		sec = sec % 60;
		
		System.out.printf("%d초는 %d시간 %d분 %d초입니다.", su, hour, min, sec);
	}

}
