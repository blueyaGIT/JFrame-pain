import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 18.11.2021
 * @author 
 */

public class DynamischeBoxen extends JFrame {
  // Anfang Attribute
  private JNumberField jNumberField1 = new JNumberField();
  private JButton bAC = new JButton();
  private JButton bPlus = new JButton();
  private JButton nMinus = new JButton();
  private JButton bGleich = new JButton();
  private JButton[] bZiffer = new JButton[10]; 
  private JButton b0 = new JButton();
  private Rechner einRechner;
  // Ende Attribute
  
  public DynamischeBoxen() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 304; 
    int frameHeight = 390;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("DynamischeBoxen");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jNumberField1.setBounds(16, 18, 228, 50);
    jNumberField1.setText("");
    jNumberField1.setFont(new Font("Dialog", Font.PLAIN, 30));
    jNumberField1.setHorizontalAlignment(SwingConstants.RIGHT);
    cp.add(jNumberField1);
    bAC.setBounds(193, 72, 50, 50);
    bAC.setText("AC");
    bAC.setMargin(new Insets(2, 2, 2, 2));
    bAC.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bAC_ActionPerformed(evt);
      }
    });
    bAC.setHorizontalAlignment(SwingConstants.CENTER);
    bAC.setFont(new Font("Dialog", Font.BOLD, 20));
    cp.add(bAC);
    bPlus.setBounds(193, 128, 50, 50);
    bPlus.setText("+");
    bPlus.setMargin(new Insets(2, 2, 2, 2));
    bPlus.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bPlus_ActionPerformed(evt);
      }
    });
    cp.add(bPlus);
    nMinus.setBounds(193, 184, 50, 50);
    nMinus.setText("-");
    nMinus.setMargin(new Insets(2, 2, 2, 2));
    nMinus.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        nMinus_ActionPerformed(evt);
      }
    });
    cp.add(nMinus);
    bGleich.setBounds(193, 240, 50, 50);
    bGleich.setText("=");
    bGleich.setMargin(new Insets(2, 2, 2, 2));
    bGleich.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bGleich_ActionPerformed(evt);
      }
    });
    cp.add(bGleich);
    b0.setBounds(73, 240, 50, 50);
    b0.setText("0");
    b0.setMargin(new Insets(2, 2, 2, 2));
    b0.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b0_ActionPerformed(evt);
      }
    });
    b0.setFont(new Font("Dialog", Font.BOLD, 20));
    cp.add(b0);
    for(int zif=1;zif<=9 ;zif++ ) 
    {
      bZiffer[zif] = new JButton();
      bZiffer[zif].setText(zif+"");
      bZiffer[zif].setMargin(new Insets(2,2,2,2));
      int xpos, ypos, spalte, zeile;
      spalte = (zif-1) % 3;
      zeile = (zif-1) / 3;
      xpos = 16 + spalte * 56;
      ypos = 184 - zeile * 56;
      bZiffer[zif].setBounds(xpos,ypos,50,50);
      bZiffer[zif].setFont(new Font("Dialog",Font.BOLD,20));
      cp.add(bZiffer[zif]);
      bZiffer[zif].addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
          bZiffer_ActionPerformed(evt);
      }
    });
    } // end of for
    einRechner = new Rechner(this);
    setVisible(true);  
    } // end of for
    
    // Ende Komponenten
    
    

  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new DynamischeBoxen();
  } // end of main
  
  public void bAC_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    jNumberField1.clear();
    einRechner.allesLoeschen();
  } // end of bAC_ActionPerformed

  public void bPlus_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of bPlus_ActionPerformed

  public void nMinus_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of nMinus_ActionPerformed

  public void bGleich_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of bGleich_ActionPerformed

  public void b0_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    jNumberField1.setInt(0);
  } // end of b0_ActionPerformed
  
  public void bZiffer_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    JButton bGeklickt = (JButton)(evt.getSource()); 
    int ziffer = Integer.parseInt(bGeklickt.getText());
    jNumberField1.setInt(ziffer); 
  } // end of b0_ActionPerformed
  
  public void anzeigen(int zahl)
  {
    
  }
  // Ende Methoden
} // end of class DynamischeBoxen

