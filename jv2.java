class jv2
{
  public static void main(String args[])
  {
    int x=1234,num1,num2,rem1=0,rem2=0,rev1=0,rev2=0;
	num1=x%100;
	num2=x/100;
	for(;num1>0;num1=num1/10)
	{
 	   rem1=num1%10;
	   rev1=rev1*10+rem1;
	}
	System.out.println(rev1);
	for(;num2>0;num2=num2/10)
	{
	   rem2=num2%10;
	   rev2=rev2*10+rem2;
	}
	System.out.println(rev2);
	System.out.println(rev1*100+rev2);
  }
}