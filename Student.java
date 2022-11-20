import java.util.Scanner;
class Student
{
  public static void main(String args[])
  {
	Scanner sc = new Scanner(System.in);
	String name = "Ramu";
	int m1=sc.nextInt();
	int m2=sc.nextInt();
	int m3=sc.nextInt();
	int m4=sc.nextInt();
	int m5=sc.nextInt();
	int total = m1+m2+m3+m4+m5;
	double percentage = total/500.0*100;
	System.out.println("total= "+total+" "+"percentage= "+percentage);
  }
}