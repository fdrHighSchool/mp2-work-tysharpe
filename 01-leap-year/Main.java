public class Main {
  public static void main(String[] args) {
    int year = 2022;
    //int year = 2040;
    //int year = 1900;
    //int year = 2000;
    System.out.println(isleapyear(year));

      }
    public static boolean isleapyear(int year){

      int leap = year % 4;
      int leap1 = year % 100;
      int leap2 = year % 400;
     if (leap == 0 && leap1 == 0 && leap2 == 0){
       //System.out.println("ture");
        return(true);
     }
     
    
      else {
        //System.out.println("false");
        return(false);
      
     }
    
    

  }
  
}
