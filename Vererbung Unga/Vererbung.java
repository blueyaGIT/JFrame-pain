import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 09.12.2021
 * @author 
 */

public class Vererbung extends JFrame {
  // Anfang Attribute
  private JButton bX2 = new JButton();
  private JButton b2 = new JButton();
  private MeinZahlenfeld jNumberField = new MeinZahlenfeld();
  // Ende Attribute
  
  public Vererbung() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300;
    int frameHeight = 300;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Vererbung");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    bX2.setBounds(32, 24, 97, 25);
    bX2.setText("x2");
    bX2.setMargin(new Insets(2, 2, 2, 2));
    bX2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bX2_ActionPerformed(evt);
      }
    });
    cp.add(bX2);
    b2.setBounds(152, 24, 97, 25);
    b2.setText("/ 2");
    b2.setMargin(new Insets(2, 2, 2, 2));
    b2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b2_ActionPerformed(evt);
      }
    });
    cp.add(b2);
    jNumberField.setBounds(96, 64, 89, 33);
    jNumberField.setText("100");
    cp.add(jNumberField);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Vererbung
  
  // Anfang Methoden
  
  public static void main(String[] args) 
  {
    new Vererbung();
  } // end of main
  
  public void bX2_ActionPerformed(ActionEvent evt) 
  {
    // TODO hier Quelltext einfügen
    jNumberField.verdopple();
  } // end of bX2_ActionPerformed

  public void b2_ActionPerformed(ActionEvent evt) 
  {
    // TODO hier Quelltext einfügen
    jNumberField.halbiere();
  } // end of b2_ActionPerformed

  // Ende Methoden
} // end of class Vererbung

