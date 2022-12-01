import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number :");
      String num = sc.nextLine();
      int sum = 0;
     
      for(int i = 0; i < num.length(); i++) {
         sum = sum + num.charAt(i)-'0';
      }
      if(sum % 3 == 0) {
         System.out.println("Given number " + num + " is divisible by 3");
      } else {
         System.out.println("Given number " + num + " is not divisible by 3");
      }
   }
}
