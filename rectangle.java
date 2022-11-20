class rectangle
{
 public static void main(String args[])
 {
	int length = 5;
	int breadth = 4;
	int perimeter = 2*(length+breadth);
	int area = length*breadth;
	boolean status = false;
	if(area>perimeter)
	{
	  status = true;
	}
	else
	{
	  status = false;
	}
	System.out.println(status+" "+"perimeter= "+perimeter+" "+"area= "+area);
 }
}