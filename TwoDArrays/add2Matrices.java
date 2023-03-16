import java.util.*;

public class add2Matrices {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("enter rows of 1st matrix");
    int row1 = sc.nextInt();
    // System.out.println("enter coloumn of 1st matrix");
    int col1 = sc.nextInt();
    int[][] a = new int[row1][col1];

    System.out.println("enter the elements of M1");
    for (int i = 0; i < row1; i++) {
      for (int j = 0; j < col1; j++) {
        a[i][j] = sc.nextInt();
      }
    }

    System.out.println("enter rows of 2nd matrix");
    int row2 = sc.nextInt();
    // System.out.println("enter coloumn of 2nd matrix");
    int col2 = sc.nextInt();
    int[][] b = new int[row1][col1];

    System.out.println("enter the elements of M1");
    for (int i = 0; i < row2; i++) {
      for (int j = 0; j < col2; j++) {
        b[i][j] = sc.nextInt();
      }
    }

    System.out.println("matrix 1");
    printMatrix(a);
    System.out.println("matrix 2");
    printMatrix(b);
    System.out.println("addition of 2 matirces are");
    add(a, row1, col1, b, row2, col2);

  }

  static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
    if (r1 != r2 || c1 != c2) {
      System.out.println("not possible");
      return;
    }

    int[][] sum = new int[r1][c1];
    for (int i = 0; i < r1; i++) {
      for (int j = 0; j < c1; j++) {
        sum[i][j] = a[i][j] + b[i][j];
      }
    }

    printMatrix(sum);

  }

  static void printMatrix(int a[][]) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
  }
}