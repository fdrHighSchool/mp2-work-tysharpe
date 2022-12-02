class Main {
  public static void main(String[] args) {
     //int num = 0;
     //int grade = num % 10;
    System.out.println(lettergrade(80)); //B-
    System.out.println(lettergrade(0)); //F
    System.out.println(lettergrade(69));// D+

    
    public static String lettergrade(int num){
      String num = "";

      
      if (num >= 90) {
        num = ("A");
        }
    
      else if (num < 90 && num >= 80) {
         num =("B");
        }
      else if (num < 80 && num >= 70) {
         Snum =("C");
        } 
      else if (num < 70 && num >= 60) {
         num =("D");
        } 
      else {
         num =("F");
      }
     return num;
    }
      
      
  }
}
 
