class D
{
  public static void main(String args[])
  {
	int num=19,i=0;
	while(i<51)
	{
	  if(i>=9 && i<=11||i>=17 && i<=25||i>=33 && i<=45)
	  {
	     System.out.println(num+"X"+i+"="+num*i);
	  }
	  i++;
	}
  }
}