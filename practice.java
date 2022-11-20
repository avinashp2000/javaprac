import java.util.Scanner;
class Size
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    int bre = sc.nextInt();
    double perimeter = 2*(len+bre);
    double area = len*bre;
    System.out.println(perimeter);
    System.out.println(area);
  }
}