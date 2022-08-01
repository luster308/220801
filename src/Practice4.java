
public class Practice4 {

	public static void main(String[] args) {
		int[] array = {10,50,44,56,29,30,9,48,84,92};
		int sum = 0;
		double avg = 0;
		int min = array[0];
		int max = 0;
		
		
		System.out.print("배열 원본 = ");
		for(int su:array) {
			System.out.printf("%d\t",su);
		}
//		===================================
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[j]<=array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println();
		System.out.print("내림차순 = ");
		for(int su:array) {
			System.out.printf("%d\t", su);
		}
//		===================================
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[j]>=array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println();
		System.out.print("오름차순 = ");
		for(int su:array) {
			System.out.printf("%d\t\t", su);
		}
//		===================================
		System.out.println();
		System.out.print("합계 = ");
		for(int su:array) {
			sum += su;
		}
		System.out.print(sum);
		System.out.println();
//		===================================
		System.out.printf("평균 = %.1f\n", (double)sum/array.length);
//		===================================
		System.out.print("최대값 = ");
		for(int su:array) {
			if(max<su) {
				max = su;
			}
		}System.out.println(max);
//		===================================
		System.out.print("최소값 = ");
		for(int su:array) {
			if(min>su) {
				min = su;
			}
		}System.out.println(min);
//		===================================
	}

}
