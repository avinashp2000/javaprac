class jv3
{
  public static void main(String args[])
  {
	int n=1234,rem=0,count=0,a=0,b=0,c=0,d=0;
	for(;n>0;n=n/10)
       {
	count++;
	rem=n%10;
	if(count==1)
	{
	  a=rem;
	}
	if(count==2)
	{
	  b=rem;
	}
	if(count==3)
	{
	  c=rem;
	}
	if(count==4)
	{
	  d=rem;
	}
  }
  System.out.println(a*10+b+c*1000+d*100);//(4000+20+300+1)
 }
}