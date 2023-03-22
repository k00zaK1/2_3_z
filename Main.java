import java.util.Random;
class Main {
  public static void main(String[] args) {
    int suma = 0 ;
  Random random = new Random();
    int[] Liczba = new int[5];
    for (int i= 0; i < 5; i++){
       Liczba[i] = random.nextInt(101);
      System.out.println("Liczby to :" + Liczba[i]);    
    }
    
  }
}