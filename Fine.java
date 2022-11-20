import java.util.Scanner;
class Fine
{
 public static void main(String args[])
 {
	Scanner sc = new Scanner(System.in);
	int days = sc.nextInt();
	double fine=0;
	if(days<=5)
	{
	  fine = 0.5;
	  
	}
	else if(days>=6 && days<=10)
	{
	  fine = 1;
	}
	else if(days>=11 && days<=30)
	{
	  fine = 5;
	}
	else
	{
  	  System.out.println("Memebership is cancelled");
	}
	System.out.println("Amount of fine to be paid= "+fine);
 }
}