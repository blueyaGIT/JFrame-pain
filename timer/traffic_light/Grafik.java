import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * CGE1 Aufgabe 3
  *
  * @version 1.0 vom 21.02.2019
  * @Markus Paul
  */ 

public class Grafik extends Canvas 
{
  
  // Anfang Attribute
  private boolean rot;
  private boolean orange;
  private boolean gruen;
  // Ende Attribute
  
  public Grafik() 
  {
    this.rot = false;
    this.orange = false;
    this.gruen = false;
  }

  // Anfang Methoden
  public void zustand(boolean r, boolean o, boolean g)
  {
    rot = r;
    orange = o;
    gruen = g; 
    repaint();
  }
  
  public void paint(Graphics g)
  {
    if (rot)
    {
      g.setColor(Color.RED);
    } 
    else
    {
      g.setColor(Color.GRAY);
    }
    g.fillOval(8,5,33,33);
    
    if (orange)
    {
      g.setColor(Color.ORANGE);
    } 
    else
    {
      g.setColor(Color.GRAY);
    }
    g.fillOval(8,40,33,33);
    
    if (gruen)
    {
      g.setColor(Color.GREEN);
    } 
    else
    {
      g.setColor(Color.GRAY);
    }
    g.fillOval(8,75,33,33);          
  }
  // Ende Methoden
} // end of Grafik
