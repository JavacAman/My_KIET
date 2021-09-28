import java.applet.Applet;
import java.awt.Graphics;

public class appletdemo extends Applet 
{
 public void init()
 {
   System.out.println("Applet will Initialized");
 }
public void start()
 {
   System.out.println("Applet will Start");
 }
public void paint(Graphics g)
 {
   g.drawString("Hello India",100,200);
   g.drawRect(
 }
 public void stop()
 {
   System.out.println("Applet will stop");
 }
 public void destroy()
 {
   System.out.println("Applet will destroy");
 }

public static void main(String args[])
{ 
appletdemo A = new appletdemo();
A.init();
A.start();

A.stop();
A.destroy();
}
}

