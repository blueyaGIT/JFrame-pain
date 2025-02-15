import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 16.09.2021
 * @author 
 */

public class erst extends JFrame {
  // Anfang Attribute
  private JButton bW = new JButton();
  private JTextField tfRichtung = new JTextField();
  private JButton bN = new JButton();
  private JButton bE = new JButton();
  private JButton bS = new JButton();
  // Ende Attribute
  
  public erst() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 605; 
    int frameHeight = 494;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("erst");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    bW.setBounds(78, 177, 115, 105);
    bW.setText("W");
    bW.setMargin(new Insets(2, 2, 2, 2));
    bW.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bW_ActionPerformed(evt);
      }
    });
    bW.setCursor(new Cursor(Cursor.WAIT_CURSOR));
    cp.add(bW);
    tfRichtung.setBounds(230, 217, 62, 28);
    tfRichtung.setText("");
    tfRichtung.setVisible(false);
    cp.add(tfRichtung);
    bN.setBounds(201, 68, 115, 105);
    bN.setText("N");
    bN.setMargin(new Insets(2, 2, 2, 2));
    bN.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bN_ActionPerformed(evt);
      }
    });
    cp.add(bN);
    bE.setBounds(324, 173, 115, 105);
    bE.setText("E");
    bE.setMargin(new Insets(2, 2, 2, 2));
    bE.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bE_ActionPerformed(evt);
      }
    });
    cp.add(bE);
    bS.setBounds(201, 286, 115, 105);
    bS.setText("S");
    bS.setMargin(new Insets(2, 2, 2, 2));
    bS.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bS_ActionPerformed(evt);
      }
    });
    cp.add(bS);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public erst
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new erst();
  } // end of main
  
  public void bW_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    tfRichtung.setText("West");
    tfRichtung.setVisible(true);
  } // end of bW_ActionPerformed

  public void bN_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    tfRichtung.setText("North");
  } // end of bN_ActionPerformed

  public void bE_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen 
    tfRichtung.setText("East");
  } // end of bE_ActionPerformed

  public void bS_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    tfRichtung.setText("South");
  } // end of bS_ActionPerformed

  // Ende Methoden
} // end of class erst

