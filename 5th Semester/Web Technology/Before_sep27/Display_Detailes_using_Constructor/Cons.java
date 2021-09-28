class cons
{
  int age;
  String name, add;
  cons()
  { 
    age=20;
    name="Aman";
    add="KIET";
  }

  void display()
  {
    System.out.println("Age is "+age);
    System.out.println("Name is "+name);
    System.out.println("Address is "+add);
  }


  public static void main(String arg[])
  {
    cons obj=new cons();
    obj.display();
  } 
}
