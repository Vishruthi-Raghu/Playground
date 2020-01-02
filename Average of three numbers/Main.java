import java.util.*;
class Main 
{
	public static void main (String[] args) 
    {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int number1=in.nextInt();
      int number2=in.nextInt();
      int number3=in.nextInt();
      int average=(number1+number2+number3)/3;
      System.out.println(average);
	}
}