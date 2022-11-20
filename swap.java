import java.util.Scanner;
class swap
{
  public static void main(String args[])
  {
	Scanner sc = new Scanner(System.in);
	char ch = sc.next().charAt(0);
	if(ch>=65 && ch<=90)
	{
	  System.out.println("Capital Letters");
	}
	else if(ch>=97 && ch<=122)
	{
	  System.out.println("Small Letters");
	}
	else if(ch>=48 && ch<=57)
	{
	  System.out.println("Small Letters");
	}
	else
	{
	  System.out.println("Special Symbols");
	}
	
  }
}