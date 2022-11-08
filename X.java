class X
{
  public static void main(String args[])
  {
  	int a=0,b=1,c=0,count=10,i;
	System.out.println(a+" "+b);
	for(i=1;i<count;++i)
	{
	  c=a+b;
	  System.out.println(c);
	  
	  a=b;
	  b=c;
	}
	
  }
}