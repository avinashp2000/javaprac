class formula
{
 public static void main(String args[])
 {
  double n = 200;
  if(n>0)
  {
    if(n<1)
    {
      System.out.println("Positive small number");
    }
    else if(n>1000000)
    {
      System.out.println("Positive large number");
    }
    else
    {
      System.out.println("Positive number");
    }
  } 
  else if(n<0)
    {
      System.out.println("Negative number");
    }
  else
  {
    System.out.println("Zero");
  }
 }
}