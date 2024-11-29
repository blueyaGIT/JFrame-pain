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

public abstract class Element
{
  
  // Anfang Attribute
  protected int x;
  protected int y;
  protected Color farbe;
  // Ende Attribute
  
  // Anfang Methoden
  protected abstract void zeichne(Graphics g);
  protected abstract String beschreibung();

  // ===================================================
  // Nachträgliche Positionsänderung
  protected void verschiebe(int xneu, int yneu)
  {
    x = xneu;
    y = yneu;
  }

  // ===================================================
  // Nachträgliche Änderung der Farbe  
  protected void neueFarbe(Color frb)
  {
    farbe = frb;
  }
  // Ende Methoden
} // end of Element
