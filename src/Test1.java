import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
//		입력받은 수를 소인수분해해서 그 결과를 각 줄에 3개씩 출력하기
		
		System.out.print("소인수 분해할 수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int su = sc.nextInt();
		int count = 0;
		
		for(int i = 2;i<=su;i++) {	
			while(su % i == 0) {
				System.out.printf("%d\t", i);
				su /= i;
				count++;
				if(count==3) {
					System.out.println();
					count=0;
				}
			}
		}
		 
		if(su != 1) {
			System.out.println(su);
		}
			}
		}
