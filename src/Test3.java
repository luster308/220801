import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gcm = 0;
		
		System.out.print("첫번째 수: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수: ");
		int num2 = sc.nextInt();

		for(int i=2;i<num1;i++) {
			if(num1%i==0&&num2%i==0) gcm=i;
		}
		int lcm = (num1/gcm) * (num2/gcm) * gcm;
		System.out.printf("%d와 %d의 GCM = %d, LCM = %d\n", num1, num2, gcm, lcm);
	}

}
