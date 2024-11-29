import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * Taschenrechner mit Zifferentasten
  * Klasse Rechner
  *
  * @version 1.0 vom 10.11.2021
  * @Markus Paul 
  */

public class Rechner {
  
  // Anfang Attribute
  private Taschenrechner dieGUI;
  private int angezeigterWert;
  // Ende Attribute
  
  // Anfang Methoden
  public Rechner(Taschenrechner eineGUI)
  {
    dieGUI = eineGUI;  
  }
  
  public void neueZiffer(int ziffer)
  {
    angezeigterWert = angezeigterWert*10+ziffer;
    dieGUI.anzeigen(angezeigterWert);
  }
  
  public void allesLoeschen()
  {
    angezeigterWert = 0;
    dieGUI.anzeigen(angezeigterWert);
  }
  // Ende Methoden
} // end of Rechner
