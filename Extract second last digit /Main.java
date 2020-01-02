import java.util.Scanner;
class Main 
{
	public static void main (String[] args) 
    {
		// Type your code hereScanner in = new Scanner(System.in);
      Scanner in = new Scanner(System.in);
      int num=in.nextInt();
      int second_last=num/10;
      int second_last_digit=second_last%10;
      System.out.println(second_last_digit);
	}
}