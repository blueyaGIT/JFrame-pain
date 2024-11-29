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

public class Taschenrechner extends JFrame {
  // Anfang Attribute
  private JNumberField nfDisplay = new JNumberField();
  private JButton btnAC = new JButton();
  private JButton btnplus = new JButton();
  private JButton btngleich = new JButton();
  private JButton btnminus = new JButton();
  private JButton[] btnZiffer = new JButton[10];
  private JButton b0 = new JButton();
  private Rechner einRechner;
  // Ende Attribute
  
  public Taschenrechner() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 335; 
    int frameHeight = 464;
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
    
    nfDisplay.setBounds(16, 16, 228, 50);
    nfDisplay.setText("");
    nfDisplay.setFont(new Font("Dialog", Font.PLAIN, 30));
    nfDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
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
    btnplus.setBounds(192, 128, 50, 50);
    btnplus.setText("+");
    btnplus.setMargin(new Insets(2, 2, 2, 2));
    btnplus.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        btnplus_ActionPerformed(evt);
      }
    });
    btnplus.setFont(new Font("Dialog", Font.BOLD, 20));
    cp.add(btnplus);
    btngleich.setBounds(192, 240, 50, 50);
    btngleich.setText("=");
    btngleich.setMargin(new Insets(2, 2, 2, 2));
    btngleich.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        btngleich_ActionPerformed(evt);
      }
    });
    btngleich.setFont(new Font("Dialog", Font.BOLD, 20));
    cp.add(btngleich);
    btnminus.setBounds(192, 184, 50, 50);
    btnminus.setText("-");
    btnminus.setMargin(new Insets(2, 2, 2, 2));
    btnminus.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        btnminus_ActionPerformed(evt);
      }
    });
    btnminus.setFont(new Font("Dialog", Font.BOLD, 20));
    cp.add(btnminus);
    b0.setBounds(72, 240, 50, 50);
    b0.setText("0");
    b0.setMargin(new Insets(2, 2, 2, 2));
    b0.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b0_ActionPerformed(evt);
      }
    });
    b0.setFont(new Font("Dialog", Font.BOLD, 20));
    cp.add(b0);
    for (int zif=1; zif<=9; zif++)
    {
      int xpos, ypos,spalte,zeile;
      spalte = (zif-1) % 3;
      zeile = (zif-1) / 3; 
      xpos = 16 + spalte * 56;
      ypos = 184 - zeile * 56;
      btnZiffer[zif] = new JButton();
      btnZiffer[zif].setText(zif+"");
      btnZiffer[zif].setMargin(new Insets(2,2,2,2));
      btnZiffer[zif].setBounds(xpos,ypos,50,50);
      btnZiffer[zif].setFont(new Font("Dialog", Font.BOLD, 20));
      cp.add(btnZiffer[zif]);
      btnZiffer[zif].addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) { 
          btnZiffer_ActionPerformed(evt);
        }
      });
    }
    einRechner = new Rechner(this);
    
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Taschenrechner
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Taschenrechner();
  } // end of main
  
  public void btnAC_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    nfDisplay.clear();
    einRechner.allesLoeschen();
  } // end of btnAC_ActionPerformed

  public void btnplus_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of btnplus_ActionPerformed

  public void btngleich_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of btngleich_ActionPerformed

  public void btnminus_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of btnminus_ActionPerformed

  public void b0_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    nfDisplay.setInt(0);
  } // end of b0_ActionPerformed
  
  public void btnZiffer_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    JButton btnGeklickt = (JButton)(evt.getSource());
    int ziffer = Integer.parseInt(btnGeklickt.getText());
    nfDisplay.setInt(ziffer);
  } // end of b0_ActionPerformed
  
  public void anzeigen(int zahl)
  {
    einRechner.
  }
  // Ende Methoden
} // end of class Taschenrechner

