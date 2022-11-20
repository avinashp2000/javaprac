class Product
{
  public static void main(String args[])
  {
	String name1 = "Product";
	String name2 = "Product";
	char code='A';
	int price = 200;
	byte quantity = 10;
	double total = price*quantity;
	double discount= 5/100.0 * total; 
	boolean status = false;
	if(name1.equals(name2))
	{
	 status = true;
	}
	total = total-discount;
	System.out.println("name= "+name1+" "+"code= "+code+" "+"price= "+price+" "+"quantity= "+quantity+" "+"total= "+total+" "+"discount= "+discount+" "+"status= "+status);
	 	
  }
}