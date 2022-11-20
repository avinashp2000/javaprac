import java.util.Scanner;
class D
{
  public static void main(String args[])
  {
	Scanner sc = new Scanner(System.in);
	int fact = 1 ,i=1;
	while(i<=5)
	{
          fact = fact*i;
	  
	  i++;
	}
	System.out.println("fact= "+fact);
  }
}