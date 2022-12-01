class Main {
  public static void main(String[] args) {
    System.out.println("Shapes!");
    square(5);
    rectangle(2,4);
    rightTriangle(3);
    triangle(3);
  }
  
  public static void square(int s){
    for (int row = 0; row < s; row++){
      
      for (int col = 0; col < s; col++){
        System.out.print("* ");
      }
      System.out.println( );
    }
  }
  
  public static void rectangle(int l, int u){
     for (int row = 0; row < l; row++){
       
       for (int col = 0; col < u; col++){
         System.out.print("* ");
       }
       System.out.println( );
     }
  }
   public static void rightTriangle(int r){
     for (int row = 1; row <= r; row++){
       for (int col = 1; col <= row; col++) {
         System.out.print("* ");
       }
       System.out.println( );
     }
       
    }
  
      public static void triangle(int v){
        
        for (int row = 1; row <= v; row++){
          for (int col = v; col >= row; col--){
             System.out.print(" ");
          }
          
          for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
             System.out.println( );
        }
      }
   }
  

