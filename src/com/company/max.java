import java.util.Scanner;

public class max {
  public static void main(String[] args) {
    double a, b, c;
    Scanner x = new Scanner(System.in);
    System.out.println("Enter the 1st number: ");
    a = x.nextDouble();
    System.out.println("Enter the 2nd number: ");
    b = x.nextDouble();
    System.out.println("Enter the 2nd number: ");
    c = x.nextDouble();
    if ((a > b) && (a > c)) {
      System.out.println(a + " is maximum number ");
    }
    if ((b > a) && (b > c)) {
      System.out.println(b + " is maximum number ");
    }
    if ((c > a) && (c > b)) {
      System.out.println(c + " is maximum number ");
    }
    x.close();
  }
}
