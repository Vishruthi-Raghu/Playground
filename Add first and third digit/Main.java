import java.util.Scanner;
class Main
{
	public static void main (String[] args) 
    {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int num=in.nextInt();
      int first_digit=num/100;
      int third_digit=num%10;
      int sum=first_digit+third_digit;
      System.out.println(sum);
	}
}