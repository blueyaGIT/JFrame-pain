import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * CGE1 Aufgabe 4
  *
  * @version 1.0 vom 21.02.2019
  * @Markus Paul
  */ 

public class Uhr extends JPanel 
{
  
  // Anfang Attribute
  private Uhrzeit zeit;
  private GUI dasGUI;
  // Ende Attribute
  
  public Uhr(GUI einGUI)
  {
    dasGUI = einGUI;
    zeit = new Uhrzeit();
  }
  
  // Anfang Methoden
  public void stelleUhr(int std, int min, int sek)
  {
    zeit.setZeit(std,min,sek);
    dasGUI.zeitAusgeben(zeit.UhrzeitString());
  }
  
  public void timerTick()
  {
    zeit.timerTick();
    dasGUI.zeitAusgeben(zeit.UhrzeitString());
  }  
  // Ende Methoden
} // end of Uhr
