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

public class Zeichenfläche extends Canvas 
{
  
  // Anfang Attribute
  private Element[] alleElem;
  private int anzahl;
  private MiniCAD dasGUI;
  // Ende Attribute
  
  // Anfang Methoden

  public Zeichenfläche(MiniCAD einGUI)
  {
    alleElem = new Element[100];
    anzahl = 0;
    dasGUI = einGUI;
  }

  // ===================================================
  // Element aus Liste entfernen
  public void loeschen(int index)
  {
    if ((index>=0)&&(index<anzahl))
    {
      for (int i=index; i<anzahl-1; i++) 
      {
        alleElem[i]=alleElem[i+1];
      } // end of for
      anzahl--;
      
      // Liste in GUI aktualisieren
      dasGUI.listeClear();
      for (int i=0; i<anzahl; i++) 
      {
        dasGUI.zulisteHinzu(alleElem[i].beschreibung());
      } // end of for
      repaint();  // Daten haben sich geändert, also neu ausgeben      
    } // end of if
  }
    
  // ===================================================
  // Neues Element zur Liste aller Elemente hinzufügen
  public void neuHinzu(Element elem)
  {
    if (anzahl<100) 
    {
      alleElem[anzahl] = elem;
      anzahl++;
    } 
    else
    {
      // Hier wäre z.B. eine Meldung angebracht, dass die Zeichnung durch das
      // neue Element zu umfangreich wird.
    }
    // end of if
    dasGUI.zulisteHinzu(elem.beschreibung());
    repaint();  // Daten haben sich geändert, also neu ausgeben
  }
  
  // ===================================================
  // Neues Element zur Liste aller Elemente hinzufügen
  protected void verschiebe(int index, int xneu, int yneu)
  {
    if ((index>=0)&&(index<anzahl))
    {
      alleElem[index].verschiebe(xneu,yneu);
      repaint();
    }
  }

  // ===================================================
  // Neues Element zur Liste aller Elemente hinzufügen  
  protected void neueFarbe(int index, Color frb)
  {
    if ((index>=0)&&(index<anzahl))
    {
      alleElem[index].neueFarbe(frb);
      repaint();
    }
  }
  
  // ===================================================
  // Alle Elemente neu zeichnen
  public void paint(Graphics g) 
  {
    // Alles löschen ...
    g.setColor(Color.WHITE);
    g.fillRect(0,0,this.getWidth(),this.getHeight());
    g.setColor(Color.BLACK);
    g.drawRect(0,0,this.getWidth()-1,this.getHeight()-1);    
    
    // ... und neu ausgeben
    for (int el=0; el<anzahl; el++) 
    {
      alleElem[el].zeichne(g);
    } // end of for
  }

  // Ende Methoden
} // end of Zeichenfläche
