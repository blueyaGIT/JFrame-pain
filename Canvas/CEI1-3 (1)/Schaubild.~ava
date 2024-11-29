import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * CEI1 Aufgabe 3
  *
  * @version 1.1 vom 07.03.2021
  * @Markus Paul
  */ 

public class Schaubild extends Canvas {
  
  // Anfang Attribute
  private double m;
  private double b;
  private Funktion f = null;
  // Ende Attribute
  
  // Anfang Methoden
  public void setzeLinFkt(double ein_m, double ein_b)
  {
    m = ein_m;
    b = ein_b;
    repaint();
  }
  public void setzeFkt(Funktion fkt){
    f = fkt;
    repaint();
    }
  public int xBild(double x)
  {
    return (int)(1*x);     
  } 
  
  public int yBild(double y)
  {
    return (int)(-1*y);  
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
        // Achsenkreuz
      g.drawLine((20.0),(0.0),(20.0),(50.0));
      //g.drawLine(0.0,-5.0,0.0,5.0); 
         
     /*
    
      double sk;
      sk =1.0;
      while (sk<5.0) 
      { 
        g.drawLine(xBild(sk),yBild(0),xBild(sk),yBild(0)-5);
        g.drawString(sk+"",xBild(sk)-10,yBild(0)+15);
        sk = sk+1;
      } // end of while
      
      sk =-1.0;
      while (sk>-5.0) 
      { 
        g.drawLine(xBild(sk),yBild(0),xBild(sk),yBild(0)-5);
        g.drawString(sk+"",xBild(sk)-10,yBild(0)+15);
        sk = sk-1;
      } // end of while
      
      sk =1.0;
      while (sk<5.0) 
      { 
        g.drawLine(xBild(0),yBild(sk),xBild(0)+5,yBild(sk));
        g.drawString(sk+"",xBild(0)-25,yBild(sk)+5);
        sk = sk+1; 
      } // end of while
      
      sk =-1.0;
      while (sk>-5.0) 
      { 
        g.drawLine(xBild(0),yBild(sk),xBild(0)+5,yBild(sk));
        g.drawString(sk+"",xBild(0)-28,yBild(sk)+5);
        sk = sk-1;
      } // end of while 
    
      // Achsenpfeile
      int[] xpoints = new int[3];
      int[] ypoints = new int[3];
      xpoints[0]=xBild(5.0);    // Spitze des x-Achsenpfeils
      ypoints[0]=yBild(0);
      xpoints[1]=xpoints[0]-15;
      ypoints[1]=ypoints[0]+5;
      xpoints[2]=xpoints[0]-15;
      ypoints[2]=ypoints[0]-5;
      g.fillPolygon(xpoints,ypoints,3);
      g.drawString("x",xBild(4.8),yBild(0.0)-10);

      xpoints[0]=xBild(0);
      ypoints[0]=yBild(5.0);
      xpoints[1]=xpoints[0]-5;
      ypoints[1]=ypoints[0]+15;
      xpoints[2]=xpoints[0]+5;
      ypoints[2]=ypoints[0]+15;
      g.fillPolygon(xpoints,ypoints,3); 
      g.drawString("y",xBild(0.0)-13,yBild(5.0)+12);  
      
      double x1 = -5.0;
      double y1 = m*x1+b;
      double x2 = 5.0;
      double y2 = m*x2+b;
      
      //g.drawLine(xBild(x1),yBild(y1),xBild(x2),yBild(y2));
    System.out.println("1");
      if(f != null){
      System.out.println("2");
      int xB2 =0, yB2 =0;  
      for(int xB=0; xB<=500; xB++){
        double xM = xMath(xB);
        double yM = f.fktwert(xM);
        int yB = yBild(yM);
        //g.drawLine(xB,yB,xB,yB);
        if(xB==0)
        {
          xB2 = xB;
          yB2 = yB;
        }
        g.drawLine(xB,yB,xB2,yB2);
        xB2 = xB;
        yB2 = yB;
        }
      }    */
  }
  // Ende Methoden
} // end of Schaubild

