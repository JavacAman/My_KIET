import java.awt.*;
public class awt_program extends Frame
{
  TextField uid,up;
  Label uidl,upl;
  Button bl;
 awt_program()
{
  uid=new TextField("");
  up=new TextField("");
  uidl=new Label("Enter user ID");
  upl=new Label("Enter Pass");
  bl=new Button("Login");
add(uidl);
add(uid);
add(upl);
add(up);
setSize(400,400);
show();
}

public static void main(String arg[])
 {
  awt_program g=new awt_program();
 }
}