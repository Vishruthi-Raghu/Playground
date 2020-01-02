import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int last_digit = num%10;
    int middle_digit = (num%100)/10;
    int final_digit = num/100;
    int product1 = last_digit*100;
    int product2 = middle_digit*10;
    int sum = product1+product2;
    int number = sum+final_digit;
    System.out.println(number);
  }
}