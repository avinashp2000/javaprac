import java.util.Scanner;

class calculator
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int x= sc.nextInt();
    int y= sc.nextInt();
    System.out.println("Operation according to character +-*/ =");
    char ch = sc.next().charAt(0);
    switch(ch)
    {
      case '+': System.out.println(x+y);
                break;
      case '-': System.out.println(x-y);
                break;
      case '*': System.out.println(x*y);
                break;
      case '/': System.out.println(x/y);
                break;
      default : System.out.println("default");
                
    }
  }
}