class std
{
 int x,y,z;
 std()
 {
  try
     {
      x=6;
      y=0;
      z=x/y;
     }catch(ArithmeticException e)
       {
         System.out.println("Arithmetic Error");
       }
  }

public static void main(String arg[])
  {
   std obj=new std();
  }
 }
