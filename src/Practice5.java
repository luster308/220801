import java.util.Scanner;

public class Practice5 {

   public static void main(String[] args) {
      
      //준과제
      //입력받은 수를 소인수분해해서 그 결과를 각 줄에 3개씩 출력하시오
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("숫자를 입력하세요: ");
      int su = sc.nextInt();
      
      int i=2;
      int j=0; //줄바꿈
      
      while(su!=1) {
         if(su%i==0) {
            System.out.print(i+"\t");
            su/=i; //su=su/i
            i=2;
            j++;

         }else {
            i++;
         }
         
         if(j==3) {
            System.out.println();
            j=0;
         }
      }//while
      
      
      

      
      
      
      
      
      
   }//main

}//class