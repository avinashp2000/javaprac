class jv4
{
  public static void main(String args[])
  {
 	int n=1234,rem=0,a=0,b=0,c=0,d=0,count=0;
	for(;n>0;n=n/10)
	{
	  count++;
	  rem=n%10;
	  switch(count)
	     {
	        case 1 : a=rem;
		 	 break;
		case 2 : b=rem;
			 break;
		case 3 : c=rem;
			 break;
		case 4 : d=rem;
			 break; 
	     }
	   
	}
      System.out.println(a*1000+b*10+c*100+d); 
  }
}