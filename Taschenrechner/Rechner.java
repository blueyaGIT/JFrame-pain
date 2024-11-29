import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 25.11.2021
 * @author 
 */

public class Rechner {
  
  // Anfang Attribute
  private int angezeigterWert;
  private DynamischeBoxen einGUI;
  // Ende Attribute
  
  public Rechner(DynamischeBoxen dieGUI) 
  {
    einGUI = dieGUI;
  }

  // Anfang Methoden
  
  public void neueZiffer(int ziffer) {
    // TODO hier Quelltext einfügen
    
  }

  public void allesLoeschen() 
  {
    // TODO hier Quelltext einfügen\
    angezeigterWert = 0;
  }

  // Ende Methoden
} // end of Rechner

