import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * Taschenrechner mit Zifferentasten
  *
  * @version 1.0 vom 10.11.2021
  * @Markus Paul 
  */

public class Taschenrechner extends JFrame {
  // Anfang Attribute
  private JNumberField nfDisplay = new JNumberField();
  private JButton btnAC = new JButton();
  private JButton btnPlus = new JButton();
  private JButton btnMinus = new JButton();
  private JButton btnErg = new JButton();
  private JButton[] btnZiffer = new JButton[10];
  private Rechner rechner;
  // Ende Attribute
  
  public Taschenrechner() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 274; 
    int frameHeight = 347;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Taschenrechner");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    nfDisplay.setBounds(16, 8, 228, 50);
    nfDisplay.setText("0");
    nfDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
    nfDisplay.setFont(new Font("Dialog", Font.PLAIN, 30));
    cp.add(nfDisplay);
    btnAC.setBounds(192, 72, 50, 50);
    btnAC.setText("AC");
    btnAC.setMargin(new Insets(2, 2, 2, 2));
    btnAC.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        btnAC_ActionPerformed(evt);
      }
    });
    btnAC.setFont(new Font("Dialog", Font.BOLD, 20));
    cp.add(btnAC);
    btnPlus.setBounds(192, 128, 50, 50);
    btnPlus.setText("+");
    btnPlus.setMargin(new Insets(2, 2, 2, 2));
    btnPlus.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        btnPlus_ActionPerformed(evt);
      }
    });
    btnPlus.setFont(new Font("Dialog", Font.BOLD, 20));
    cp.add(btnPlus);
    btnMinus.setBounds(192, 184, 50, 50);
    btnMinus.setText("-");
    btnMinus.setMargin(new Insets(2, 2, 2, 2));
    btnMinus.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        btnMinus_ActionPerformed(evt);
      }
    });
    btnMinus.setFont(new Font("Dialog", Font.BOLD, 20));
    cp.add(btnMinus);
    btnErg.setBounds(192, 240, 50, 50);
    btnErg.setText("=");
    btnErg.setMargin(new Insets(2, 2, 2, 2));
    btnErg.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        btnErg_ActionPerformed(evt);
      }
    });
    btnErg.setFont(new Font("Dialog", Font.BOLD, 20));
    cp.add(btnErg);
    // Ende Komponenten
    
    for (int zif=1; zif<=9; zif++)
    {  
      int spalte = (zif-1)%3;
      int zeile = (zif-1)/3;
      int xpos = 16+spalte*56;
      int ypos = 184-zeile*56; 
      btnZiffer[zif] = new JButton();
      btnZiffer[zif].setText(zif+"");
      btnZiffer[zif].setMargin(new Insets(2,2,2,2));
      btnZiffer[zif].setBounds(xpos,ypos,50,50);
      btnZiffer[zif].setFont(new Font("Dialog", Font.BOLD, 20));
      btnZiffer[zif].addActionListener(new ActionListener() { 
           public void actionPerformed(ActionEvent evt) { 
           btnZiffer_ActionPerformed(evt);
           }
      });
      cp.add(btnZiffer[zif]);
    }
    btnZiffer[0] = new JButton();
    btnZiffer[0].setText("0");
    btnZiffer[0].setMargin(new Insets(2,2,2,2));
    btnZiffer[0].setBounds(72,240,50,50);
    btnZiffer[0].setFont(new Font("Dialog", Font.BOLD, 20));
    btnZiffer[0].addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent evt) { 
         btnZiffer_ActionPerformed(evt);
         }
    });
    cp.add(btnZiffer[0]);
    
    rechner = new Rechner(this);
    
    setVisible(true);
  } // end of public Taschenrechner
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Taschenrechner();
  } // end of main
  
  public void btnAC_ActionPerformed(ActionEvent evt) {
    rechner.allesLoeschen();
  } // end of btnAC_ActionPerformed

  public void btnPlus_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of btnPlus_ActionPerformed

  public void btnMinus_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of btnMinus_ActionPerformed

  public void btnErg_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of btnErg_ActionPerformed

  public void btnZiffer_ActionPerformed(ActionEvent evt) {
    JButton btnGeklickt = (JButton)(evt.getSource());
    int ziffer = Integer.parseInt(btnGeklickt.getText());
    rechner.neueZiffer(ziffer);
  } // end of btnAC_ActionPerformed

  public void anzeigen(int zahl)
  {
    nfDisplay.setInt(zahl);
  }   
  // Ende Methoden
} // end of class Taschenrechner
