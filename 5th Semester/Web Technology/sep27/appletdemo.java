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
   g.drawOval(100,80,150,200);
   g.drawOval(125,155,20,10);
   g.drawOval(195,155,20,10);
   g.drawLine(170,155,170,180);
   g.drawArc(130,180,80,40,180,180);
   
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
