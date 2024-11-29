import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 13.01.2022
 * @author 
 */

public class GUI extends JFrame {
  // Anfang Attribute
  private Rechner einRechner;
  private JButton bRechne = new JButton();
  private JNumberField nfVon = new JNumberField();
  private JTextField tfVon = new JTextField();
  private JNumberField nfZu = new JNumberField();
  private JTextField tfZu = new JTextField();
  private JRadioButton rbCminch = new JRadioButton();
  private JRadioButton rbLgal = new JRadioButton();
  private JRadioButton rbInchcm = new JRadioButton();
  private JRadioButton rbGall = new JRadioButton();
  private ButtonGroup buttonGroup1 = new ButtonGroup();
  private JLabel lEingabewert = new JLabel();
  private JLabel lEinheit = new JLabel();
  private JLabel lErgebnis = new JLabel();
  private JLabel lEinheit1 = new JLabel();
  private double wert;
  
  // Ende Attribute
  
  public GUI() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 784; 
    int frameHeight = 371;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("GUI");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    einRechner = new Rechner(this);
    // Anfang Komponenten
    
    bRechne.setBounds(264, 32, 161, 33);
    bRechne.setText("Rechne");
    bRechne.setMargin(new Insets(2, 2, 2, 2));
    bRechne.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bRechne_ActionPerformed(evt);
      }
    });
    cp.add(bRechne);
    nfVon.setBounds(8, 32, 105, 33);
    nfVon.setText("");
    cp.add(nfVon);
    tfVon.setBounds(144, 32, 81, 33);
    cp.add(tfVon);
    nfZu.setBounds(464, 32, 129, 33);
    nfZu.setText("");
    cp.add(nfZu);
    tfZu.setBounds(640, 32, 97, 33);
    cp.add(tfZu);
    rbCminch.setBounds(296, 96, 100, 20);
    rbCminch.setOpaque(false);
    rbCminch.setText("cm-inch");
    buttonGroup1.add(rbCminch);
    rbCminch.setSelected(true);
    cp.add(rbCminch);
    rbLgal.setBounds(296, 144, 100, 20);
    rbLgal.setOpaque(false);
    rbLgal.setText("l-gal");
    buttonGroup1.add(rbLgal);
    cp.add(rbLgal);
    rbInchcm.setBounds(296, 120, 100, 20);
    rbInchcm.setOpaque(false);
    rbInchcm.setText("inch-cm");
    buttonGroup1.add(rbInchcm);
    cp.add(rbInchcm);
    rbGall.setBounds(296, 168, 100, 20);
    rbGall.setOpaque(false);
    rbGall.setText("gal-l");
    buttonGroup1.add(rbGall);
    cp.add(rbGall);
    lEingabewert.setBounds(8, 8, 110, 20);
    lEingabewert.setText("Eingabewert");
    cp.add(lEingabewert);
    lEinheit.setBounds(144, 8, 110, 20);
    lEinheit.setText("Einheit");
    cp.add(lEinheit);
    lErgebnis.setBounds(472, 8, 110, 20);
    lErgebnis.setText("Ergebnis");
    cp.add(lErgebnis);
    lEinheit1.setBounds(640, 8, 110, 20);
    lEinheit1.setText("Einheit");
    cp.add(lEinheit1);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public GUI
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new GUI();
  } // end of main
  
  
  
  public void bRechne_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
    if (rbCminch.isSelected()) 
    {
      tfVon.setText("cm");
      tfZu.setText("inch");
      einRechner.setFaktor(2.54);
    } // end of if
    
    if (rbInchcm.isSelected()) 
    {
      tfVon.setText("inch");
      tfZu.setText("cm");
      einRechner.setFaktor(1/(1*2.54));
    } // end of if
    
    if (rbLgal.isSelected()) 
    {
      tfVon.setText("l");
      tfZu.setText("gal");
      einRechner.setFaktor(3.7854);
    } // end of if
    
    if (rbGall.isSelected()) 
    {
      tfVon.setText("gal");
      tfZu.setText("l");
      einRechner.setFaktor(1/(1*3.7854));
    } // end of if
    
    wert=nfVon.getDouble();
    einRechner.rechne(wert);
    
  } // end of bRechne_ActionPerformed

    public String buttonGroup1_getSelectedRadioButtonLabel() {
      for (java.util.Enumeration<AbstractButton> e = buttonGroup1.getElements(); e.hasMoreElements();) {
      AbstractButton b = e.nextElement();
      if (b.isSelected()) return b.getText();
    }
    return "";
  }
  
  public void ergebnisAusgeben(double ergebnis)
  {
    nfZu.setDouble(ergebnis, 4);
  }
  
  // Ende Methoden
} // end of class GUI
