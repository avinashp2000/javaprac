class jv1
{
  public static void main(String args[])
  {
  	int n=23890,rem=0,rem1=0,count=0,sum=0;
	for(;n>0;n=n/10)
 	{
	  rem=n%10;
	  sum=sum*10+rem;
	  count++;
        }

	for(int x=count;x>0;sum=sum/10,x--)
	{
	 
	  rem1=sum%10;
	  
	    switch(rem1)
            {
	        case 1 : System.out.print("one");
	                 break;
	        case 2 : System.out.print("two");
	                 break;	 
	        case 3 : System.out.print("three");
	 	         break;
		case 4 : System.out.print("four");
			 break;
		case 5 : System.out.print("five");
		 	 break;
		case 6 : System.out.print("six");
			 break;
		case 7 : System.out.print("seven");
			 break;
		case 8 : System.out.print("eight");
			 break;
		case 9 : System.out.print("nine");
			 break;
		case 0 : System.out.print("zero");
			 break;       
	  }
	 
     }
  }
}