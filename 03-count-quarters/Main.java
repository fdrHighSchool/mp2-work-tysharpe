public static void main(String[] args) {
    System.out.println(countQuarters(1275));
  }
  public static int countQuarters (int cents){
    cents = cents % 100;
    return cents / 25;
}
