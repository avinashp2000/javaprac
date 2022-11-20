class ProductApplication
{
 public static void main(String args[])
{
  String name = "chicken";
  char code = 'A';
  int quantity = 10;
  int price = 300;
  double total = price*quantity;
  double discount = 0;
  if(total >= 1000)
   {
   discount = 10/100.0*total;
   System.out.println(discount);
   }
  total = total-discount;
  System.out.println(total);
  System.out.println("name ="+name+ " "+ "code= "+code+ " " + "quantity= "+quantity+ " " +"price= "+price+ " "+ "total= "+total+" "+ " discount= "+discount);  
}
}