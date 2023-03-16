import java.util.*;

public class prime {

  public static void main(String[] args) {

    primeTill();

    isPrime();

  }

  static void primeTill() {
    System.out.println("enter the number of primes ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count;

    for (int i = 1; i <= n; i++) {
      count = 0;
      for (int j = 1; j <= i; j++) {

        if (i % j == 0) {
          count++;
        }

      }
      if (count == 2) {
        System.out.print(i + " ");

      }
    }
  }

  static void isPrime() {
    System.out.println("enter the number to check prime or not:  ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int count = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        count++;
      }
    }

    if (count == 2) {
      System.out.println("yes prime");
    } else {
      System.out.println("no prime");
    }

  }

}
