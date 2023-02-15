
// import ArrayList and Scanner
import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> top = new ArrayList<Integer>();
    ArrayList<Integer> bot = new ArrayList<Integer>();
    System.out.println("How many rows would you like in your times table?");
    int rows = input.nextInt() + 1;
    create(rows, top);
    System.out.println("How many columns would you like in your times table?");
    int cols = input.nextInt() + 1;
    create(cols, bot);
    int[][] table = new int[rows][cols];
    makeTable(rows, cols, table);
    for (int k = 1; k < table.length; k++) {
      System.out.println();
      for (int j = 1; j < table[k].length; j++) {
        System.out.print(table[k][j] + " ");
      }

    }
  }

  public static void create(int x, ArrayList<Integer> arr) {
    for (int i = 1; i < x + 1; i++) {
      arr.add(i);
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