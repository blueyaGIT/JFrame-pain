/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 19.05.2022
 * @author 
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class Karte extends JButton {
  
  // Anfang Attribute
  private ImageIcon dasBild;
  
  // Ende Attribute
  
  public Karte(ImageIcon Bild) {
    dasBild = Bild;
    zudecken();
  }
  
  public void aufdecken()
  {
    this.setIcon(dasBild);
  }
  
  public void zudecken()
  {
    this.setIcon(null);
  }
  
  // Anfang Methoden
  // Ende Methoden
} // end of Karte

