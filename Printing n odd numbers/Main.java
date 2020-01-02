import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      for( int num = 1; num <= n * 2; num = num + 1)
      {
        if (num % 2 == 1)
      System.out.println(num);
	}
    }
}