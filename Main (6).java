// import ArrayList and Scanner
import java.util.ArrayList;
import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
Scanner input = new Scanner(System.in);
    ArrayList<Integer> top = new ArrayList<Integer>(); 
    ArrayList<Integer> bot = new ArrayList<Integer>();    
    System.out.println("How many rows would you like in your times table?"); 
    int rows = input.nextInt(); 
    create(rows, top); 
  System.out.println("How many columns would you like in your times table?"); 
    int cols = input.nextInt(); 
    create(cols, bot);
    System.out.println(top); 
    System.out.println(bot); 
    int [][] table; 
  }
// add ints 1-12 to the ArrayList
  public static void create(int x, ArrayList<Integer> arr){
    for (int i = 1; i < x + 1; i++){
      arr.add(i); 
    }
  }
}