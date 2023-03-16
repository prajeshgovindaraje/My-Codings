package patterns;

import javax.sound.sampled.SourceDataLine;

public class patterns {

  public static void main(String[] args) {

    // pattern1();
    // pattern2();
    // pattern3();
    pattern4();

  }

  // 1
  // 2 2
  // 3 3 3
  // 4 4 4 4
  static void pattern1() {

    int row = 4;
    int count = 0;

    for (int i = 1; i <= row; i++) {
      count++;

      for (int j = 1; j <= i; j++) {
        System.out.print(count);

      }
      System.out.println();

    }

  }

  // 1
  // 1 2
  // 1 2 3
  // 1 2 3 4
  // 1 2 3 4 5
  static void pattern2() {
    int n = 5;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  // 0 0 0 0 *
  // 0 0 0 * *
  // 0 0 * * *
  // 0 * * * *
  // * * * * *
  static void pattern3() {
    int n = 5;
    int space = n;

    for (int i = 1; i <= n; i++) {

      for (int j = 1; j <= space - 1; j++) {
        System.out.print(" ");
      }
      space--;

      for (int k = 1; k <= i; k++) {
        System.out.print("*");
      }

      System.out.println();

    }
  }

  // * * * *
  // 0 * * *
  // 0 0 * *
  // 0 0 0 *
  static void pattern4() {
    int n = 4;
    int star = n;

    for (int i = 1; i <= n; i++) {
      for (int j = 2; j <= i; j++) {
        System.out.print(" ");
      }

      for (int k = star; k > 0; k--) {
        System.out.print("*");
      }
      star--;
      System.out.println();

    }
  }

}
