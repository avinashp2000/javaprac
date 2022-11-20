class practice
{
  public static void main(String args[])
  {
	int input=1456,rem=0,sum1=0,sum2=0,count=0;
	for(;input>0;input=input/10)
	{
	   count++;
	   rem=input%10;
	   if(count==1||count==4)
	   {
	      sum1=sum1+rem;
	   }
	   else
	   {
	      sum2=sum2+rem;
	   }
	}
	System.out.println(sum1+" "+sum2);
  }
}