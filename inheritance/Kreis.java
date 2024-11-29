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

public class Kreis extends Element {
  
  // Anfang Attribute
  protected int radius;
  // Ende Attribute
  
  // Anfang Methoden

  // =================================================================================
  // Konstruktor  
  public Kreis(int xm, int ym, int r, Color color)
  {
    x = xm;
    y = ym;
    radius = r;
    farbe = color;
  }
  
  // =================================================================================
  protected void zeichne(Graphics g)
  {
    g.setColor(farbe);
    g.fillOval(x-radius,y-radius,2*radius,2*radius);
  }
  
  // =================================================================================
  protected String beschreibung()
  {
    return "Kreis: M("+x+"|"+y+") r="+radius;
  }

  // Ende Methoden
} // end of Kreis
