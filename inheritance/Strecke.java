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

public class Strecke extends Element 
{
  
  // Anfang Attribute
  protected int xEnd;
  protected int yEnd;
  // Ende Attribute
  
  // Anfang Methoden
  
  // =================================================================================
  // Konstruktor  
  public Strecke(int x1, int y1, int x2, int y2, Color color)
  {
    x = x1;
    y = y1;
    xEnd = x2;
    yEnd = y2;
    farbe = color;
  }
  
  // =================================================================================
  protected void zeichne(Graphics g)
  {
    g.setColor(farbe);
    g.drawLine(x,y,xEnd,yEnd);
  }
  
  // =================================================================================
  protected String beschreibung()
  {
    return "Strecke von ("+x+"|"+y+") bis ("+xEnd+"|"+yEnd+")";
  }
  // Ende Methoden
} // end of Strecke
