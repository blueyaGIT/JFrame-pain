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

public class aufgabe2 extends JFrame {
  // Anfang Attribute
  private JButton bPlus = new JButton();
  private JButton bMinus = new JButton();
  private JButton bMal = new JButton();
  private JButton bDurch = new JButton();
  private JButton bAC = new JButton();
  private JTextField tfLoesung = new JTextField();
  private JTextField tfZ1 = new JTextField();
  private JTextField tfZ2 = new JTextField();
  // Ende Attribute
  
  public aufgabe2() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 543; 
    int frameHeight = 300;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("aufgabe2");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    bPlus.setBounds(50, 100, 43, 43);
    bPlus.setText("+");
    bPlus.setMargin(new Insets(2, 2, 2, 2));
    bPlus.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bPlus_ActionPerformed(evt);
      }
    });
    cp.add(bPlus);
    bMinus.setBounds(130, 100, 43, 43);
    bMinus.setText("-");
    bMinus.setMargin(new Insets(2, 2, 2, 2));
    bMinus.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bMinus_ActionPerformed(evt);
      }
    });
    cp.add(bMinus);
    bMal.setBounds(210, 100, 43, 43);
    bMal.setText("x");
    bMal.setMargin(new Insets(2, 2, 2, 2));
    bMal.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bMal_ActionPerformed(evt);
      }
    });
    cp.add(bMal);
    bDurch.setBounds(290, 100, 43, 43);
    bDurch.setText("/");
    bDurch.setMargin(new Insets(2, 2, 2, 2));
    bDurch.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bDurch_ActionPerformed(evt);
      }
    });
    cp.add(bDurch);
    bAC.setBounds(370, 100, 43, 43);
    bAC.setText("AC");
    bAC.setMargin(new Insets(2, 2, 2, 2));
    bAC.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bAC_ActionPerformed(evt);
      }
    });
    cp.add(bAC);
    tfLoesung.setBounds(110, 160, 250, 52);
    cp.add(tfLoesung);
    tfZ1.setBounds(64, 50, 125, 36);
    cp.add(tfZ1);
    tfZ2.setBounds(266, 50, 125, 36);
    cp.add(tfZ2);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public aufgabe2
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new aufgabe2();
  } // end of main
  
  public void bPlus_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    tfZ1.getInt();
    tfZ2.getInt();
    
  } // end of bPlus_ActionPerformed

  public void bMinus_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of bMinus_ActionPerformed

  public void bMal_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of bMal_ActionPerformed

  public void bDurch_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of bDurch_ActionPerformed

  public void bAC_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    tfZ1.setText("0");
    tfZ2.setText("0");
    tfLoesung.setText("0");
  } // end of bAC_ActionPerformed

  // Ende Methoden
} // end of class aufgabe2

