import java.util.Scanner;
class subject
{
  public static void main(String args[])
  {
	Scanner sc = new Scanner(System.in);
	double A = sc.nextDouble();
	double B = sc.nextDouble();
	if(A>=55 && B>=45)
	{
	  System.out.println("Eligible");
	}
	else if((A>=45 && A<55) && B>=55)
	{
	  System.out.println("Good");
	}
	else if(A>=65 && B<45)
	{
	 System.out.println("Allowed to reappear for B examination to qualify");
	}
	else
	{
	 System.out.println("Failed in Exams");
	}
  }
}