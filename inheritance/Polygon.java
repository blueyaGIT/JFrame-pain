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

public class Polygon extends Element 
{
  
  // Anfang Attribute
  protected int radius;
  protected int anzahl;
  // Ende Attribute
  
  // Anfang Methoden

  // =================================================================================
  // Konstruktor  
  public Polygon(int xm, int ym, int umkreis, int ecken, Color color)
  {
    x = xm;
    y = ym;
    radius = umkreis;
    anzahl = ecken;
    farbe = color;
  }
  
  // =================================================================================
  protected void zeichne(Graphics g)
  {
    int[] xecken = new int[anzahl];
    int[] yecken = new int[anzahl];
    for (int i=0; i<anzahl; i++) 
    {
       double winkel = i*2*Math.PI/anzahl; 
       xecken[i] = x+(int)(radius*Math.sin(winkel));
       yecken[i] = y+(int)(-radius*Math.cos(winkel));
    } // end of for  
    g.setColor(farbe);
    g.fillPolygon(xecken,yecken,anzahl);
  }
  
  // =================================================================================
  protected String beschreibung()
  {
    return "Polygon: "+anzahl+ "-Eck M("+x+"|"+y+") r="+radius;
  }
  // Ende Methoden
} // end of Polygon
