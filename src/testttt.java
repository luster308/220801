
public class testttt {

	public static void main(String[] args) {
		int[] array = {10,50,44,56,29,30,9,48,84,92};
		
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
			System.out.printf(su+"\t");
	}

}
}