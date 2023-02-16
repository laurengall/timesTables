
// import Scanner
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("How many rows would you like in your times table?");
    int rows = input.nextInt() + 1;
    System.out.println("How many columns would you like in your times table?");
    int cols = input.nextInt() + 1;
    int[][] table = new int[rows][cols];
    makeTable(rows, cols, table);
    for (int k = 1; k < table.length; k++) {
      System.out.println();
      for (int j = 1; j < table[k].length; j++) {
        System.out.print(table[k][j] + " ");
      }
    }
  }

  public static void makeTable(int rows, int cols, int[][] table) {
    for (int a = 1; a < rows; a++) {
      for (int b = 1; b < cols; b++) {
        table[a][b] = a * b;
      }
    }
  }
}