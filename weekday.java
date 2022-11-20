class power
{
  public static void main(String args[])
  {
    int a = 45 ;
    String weekday=" ";
      if(a>=1 && a<=7)
      {
        System.out.println("Enters IF");
      }
      else if(a==1)
      {
        weekday = "Sunday";
      }
      else if(a==2)
      {
        weekday = "Monday";
      }
      else if(a==3)
      {
        weekday = "Tuesday";
      }
      else if(a==4)
      { 
        weekday = "wednesday";
      }
      else if(a==5)
      {
        weekday = "Thursday";
      }
      else if(a==6)
      {
        weekday = "friday";
      }
      else if(a==7)
      { 
        weekday = "saturday";
      }
      else
      {
        weekday = "not valid";
      }
    System.out.println(weekday);   
  }
}