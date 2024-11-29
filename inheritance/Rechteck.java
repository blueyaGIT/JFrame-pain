/**
  * CFN1
  * MiniCAD mit abstrakter Klasse
  *
  * @version 1.0 vom 16.02.2022
  * @Markus Paul
  */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Rechteck extends Element {
  
  // Anfang Attribute
  int w;
  int h;
  // Ende Attribute
  
  // Anfang Methoden
  // =================================================================================
  // Konstruktor  
  public Rechteck(int x1, int y1, int x2, int y2, Color color)
  {
    if (x1<=x2) 
    {
      x = x1;
      w = x2-x1;
    } 
    else
    {
      x = x2;
      w = x1-x2;
    } // end of if
    if (y1<=y2) 
    {
      y = y1;
      h = y2-y1;
    } 
    else
    {
      y = y2;
      h = y1-y2;
    } // end of if
    farbe = color;
  }
   
  // =================================================================================
  protected void zeichne(Graphics g)
  {
    g.setColor(farbe);
    g.fillRect(x,y,w,h);
  }
  
  // =================================================================================
  protected String beschreibung()
  {
    return "Rechteck: ("+x+","+y+","+w+","+h+")";
  }  
  // Ende Methoden
} // end of Rechteck
