import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * CGN1-2 GUI
 *
 * @version 1.0 vom 07.04.2022
 * @Markus Paul 
 */

public class GUI extends JFrame {
  // Anfang Attribute
  private JButton bBerechne = new JButton();
  private JNumberField nfZahl2 = new JNumberField();
  private JNumberField nfZahl1 = new JNumberField();
  private JNumberField nfggt = new JNumberField();
  private JNumberField nfkgv = new JNumberField();
  private JLabel lZahl = new JLabel();
  private JLabel lZahl2 = new JLabel();
  private JLabel lGgT = new JLabel();
  private JLabel lKgV = new JLabel();
  // Ende Attribute
  
  public GUI() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 339; 
    int frameHeight = 215;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Statische Methoden");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    bBerechne.setBounds(144, 72, 75, 25);
    bBerechne.setText("Berechne");
    bBerechne.setMargin(new Insets(2, 2, 2, 2));
    bBerechne.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bBerechne_ActionPerformed(evt);
      }
    });
    cp.add(bBerechne);
    nfZahl2.setBounds(144, 40, 75, 28);
    nfZahl2.setText("1");
    cp.add(nfZahl2);
    nfZahl1.setBounds(144, 8, 75, 28);
    nfZahl1.setText("1");
    cp.add(nfZahl1);
    nfggt.setBounds(144, 104, 75, 28);
    nfggt.setText("");
    cp.add(nfggt);
    nfkgv.setBounds(144, 136, 75, 28);
    nfkgv.setText("");
    cp.add(nfkgv);
    lZahl.setBounds(64, 8, 62, 28);
    lZahl.setText("Zahl 1: ");
    lZahl.setHorizontalAlignment(SwingConstants.RIGHT);
    cp.add(lZahl);
    lZahl2.setBounds(64, 40, 62, 28);
    lZahl2.setText("Zahl 2: ");
    lZahl2.setHorizontalAlignment(SwingConstants.RIGHT);
    cp.add(lZahl2);
    lGgT.setBounds(64, 104, 62, 28);
    lGgT.setText("ggT: ");
    lGgT.setHorizontalAlignment(SwingConstants.RIGHT);
    cp.add(lGgT);
    lKgV.setBounds(64, 136, 62, 28);
    lKgV.setText("kgV: ");
    lKgV.setHorizontalAlignment(SwingConstants.RIGHT);
    cp.add(lKgV);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public GUI
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new GUI();
  } // end of main
  
  public void bBerechne_ActionPerformed(ActionEvent evt) 
  {
    nfggt.setInt(MyMath.ggt(nfZahl1.getInt(),nfZahl2.getInt()));
    nfkgv.setInt(MyMath.kgv(nfZahl1.getInt(),nfZahl2.getInt()));
  } // end of bBerechne_ActionPerformed

  // Ende Methoden
} // end of class GUI

