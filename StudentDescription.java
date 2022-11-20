class StudentDescription
{
 public static void main(String args[])
 {
   String name;
   String status;
   char section = 'F';
   int m1=21, m2=10, m3=2, m4=8, m5=2;
   double total = m1+m2+m3+m4+m5;
   double percentage = total/125.0 * 100;
   long fee = 100000;
   int scholarship=0;
   int AF=0;
   if(percentage>=50 && percentage<60)
   {
     section = 'C';
     scholarship = 5000;
     status = "second";
   }
   else if(percentage>=60 && percentage < 70)
   {
     section = 'B';
     scholarship = 10000;
     status = "First";
   }
   else if(percentage>=70 && percentage <80)
   {
     section = 'A';
     scholarship = 15000;
     status = "Distinction";
   }
   else if(percentage>=80 && percentage<90)
   {
     section = 'A';
     scholarship = 20000;
     status = "Excellent";
   }
   else if(percentage>=90 && percentage<100)
   {
     section = 'A';
     scholarship = 30000;
     status = "Extraordinary";
   }
   else
   {
     AF = 20000;
     fee = fee+AF;
     section = 'F';
     status = "fail";
   }
  fee = fee-scholarship;
  System.out.println(fee);
  System.out.println("status= "+status+ " " + "scholarship= "+scholarship + " " + "percentage= "+percentage+ " "+ "section= "+section);
 }
}