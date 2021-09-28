package xyz;
public class calc
{
 int x,y,add,mult,sub,div;
 public calc(int x,int y)
  {
    add=x+y;
    sub=x-y;
    mult=x*y;
    div=x/y;
  }

  public void display()
  {
    System.out.println("Sum is "+add);
    System.out.println("Substraction is "+sub);
    System.out.println("Multiplication is "+mult);
    System.out.println("Division is "+div);
  }
}
