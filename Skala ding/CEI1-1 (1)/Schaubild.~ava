import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * CEI1 Aufgabe 1
  *
  * @version 1.0 vom 23.01.2019
  * @Markus Paul
  */ 

public class Schaubild extends Canvas 
{
  
  // Anfang Attribute
  // Ende Attribute
   
  public int xBild(double x)
  {
    return (int)(50*x+250);     
  } 
  
  public int yBild(double y)
  {
    return (int)(-50*y+250);  
  }   
  
  public double xMath(int x)
  {
    return 0.02*x-5.0;
  }
  
  public double yMath(int y)
  {
    return -0.02*y+5.0;
  }    
  
  public void paint(Graphics g)
  {
    g.setColor(Color.WHITE);
    g.fillRect(0,0,getWidth(),getHeight());
    g.setColor(Color.BLACK);
      
    //g.drawLine(xBild(-1.0),yBild(2.0),xBild(0.0),yBild(0.0));
    //g.drawLine(xBild(0.0),yBild(0.0),xBild(4.0),yBild(4.0));
    g.drawLine(xBild(-5.0),yBild(0),xBild(5.0),yBild(0));
    g.drawLine(xBild(0),yBild(-5.0),xBild(0),yBild(5.0));
    
    for(double i = -5.0; i<5.0; i++)
    {
      g.drawLine(xBild(i),yBild(0.1), xBild(i), yBild(-0.1));
      g.drawLine(xBild(0.1),yBild(i), xBild(-0.1), yBild(i));
    }
  }
  // Ende Methoden
} // end of Schaubild

