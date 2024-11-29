import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * Überladen von Methoden
  *
  * @version 1.0 vom 17.03.2022
  * @Markus Paul 
  */

public class Bruchrechnen extends JFrame {
  // Anfang Attribute
  private JNumberField nfaz = new JNumberField();
  private JNumberField nfint = new JNumberField();
  private JNumberField nfbz = new JNumberField();
  private JNumberField nfbn = new JNumberField();
  private JLabel jLabel1 = new JLabel();
  private JNumberField ergz = new JNumberField();
  private JNumberField ergn = new JNumberField();
  private JNumberField nfan = new JNumberField();
  private JRadioButton jRadioButton1 = new JRadioButton();
  private JRadioButton jRadioButton2 = new JRadioButton();
  private JRadioButton jRadioButton3 = new JRadioButton();
  private JRadioButton jRadioButton4 = new JRadioButton();
  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel3 = new JLabel();
  private JLabel jLabel4 = new JLabel();
  private JButton btnCalcBr = new JButton();
  private JButton btnCalcInt = new JButton();
  private JButton btnErweitere = new JButton();
  private JLabel jLabel5 = new JLabel();
  private JNumberField erggekn = new JNumberField();
  private JNumberField erggekz = new JNumberField();
  private JLabel jLabel6 = new JLabel();
  private JLabel jLabel7 = new JLabel();
  private ButtonGroup btnGrp = new ButtonGroup();
  // Ende Attribute
  
  public Bruchrechnen() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 444; 
    int frameHeight = 273;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Bruchrechnen");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    nfaz.setBounds(8, 24, 75, 20);
    nfaz.setText("7");
    nfaz.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(nfaz);
    nfint.setBounds(144, 144, 75, 20);
    nfint.setText("4");
    nfint.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(nfint);
    nfbz.setBounds(144, 24, 75, 20);
    nfbz.setText("1");
    nfbz.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(nfbz);
    nfbn.setBounds(144, 48, 75, 20);
    nfbn.setText("12");
    nfbn.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(nfbn);
    jLabel1.setBounds(224, 32, 14, 20);
    jLabel1.setText("=");
    cp.add(jLabel1);
    ergz.setBounds(248, 24, 75, 20);
    ergz.setText("9");
    ergz.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(ergz);
    ergn.setBounds(248, 48, 75, 20);
    ergn.setText("12");
    ergn.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(ergn);
    nfan.setBounds(8, 48, 75, 20);
    nfan.setText("6");
    nfan.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(nfan);
    jRadioButton1.setBounds(96, 24, 40, 20);
    jRadioButton1.setOpaque(false);
    jRadioButton1.setText("+");
    jRadioButton1.setSelected(true);
    btnGrp.add(jRadioButton1);
    cp.add(jRadioButton1);
    jRadioButton2.setBounds(96, 56, 40, 20);
    jRadioButton2.setOpaque(false);
    jRadioButton2.setText("-");
    btnGrp.add(jRadioButton2);
    cp.add(jRadioButton2);
    jRadioButton3.setBounds(96, 88, 40, 20);
    jRadioButton3.setOpaque(false);
    jRadioButton3.setText("*");
    btnGrp.add(jRadioButton3);
    cp.add(jRadioButton3);
    jRadioButton4.setBounds(96, 120, 40, 20);
    jRadioButton4.setOpaque(false);
    jRadioButton4.setText("/");
    btnGrp.add(jRadioButton4);
    cp.add(jRadioButton4);
    jLabel2.setBounds(8, 0, 70, 20);
    jLabel2.setText("a");
    jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(jLabel2);
    jLabel3.setBounds(144, 0, 70, 20);
    jLabel3.setText("b");
    jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(jLabel3);
    jLabel4.setBounds(144, 120, 70, 20);
    jLabel4.setText("c");
    jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(jLabel4);
    btnCalcBr.setBounds(144, 72, 75, 25);
    btnCalcBr.setText("Berechne");
    btnCalcBr.setMargin(new Insets(2, 2, 2, 2));
    btnCalcBr.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        btnCalcBr_ActionPerformed(evt);
      }
    });
    cp.add(btnCalcBr);
    btnCalcInt.setBounds(144, 200, 75, 25);
    btnCalcInt.setText("Berechne");
    btnCalcInt.setMargin(new Insets(2, 2, 2, 2));
    btnCalcInt.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        btnCalcInt_ActionPerformed(evt);
      }
    });
    cp.add(btnCalcInt);
    btnErweitere.setBounds(144, 168, 75, 25);
    btnErweitere.setText("Erweitere");
    btnErweitere.setMargin(new Insets(2, 2, 2, 2));
    btnErweitere.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        btnErweitere_ActionPerformed(evt);
      }
    });
    cp.add(btnErweitere);
    jLabel5.setBounds(248, 0, 70, 20);
    jLabel5.setText("Ergebnis");
    jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(jLabel5);
    erggekn.setBounds(344, 48, 75, 20);
    erggekz.setBounds(344, 24, 75, 20);
    jLabel6.setBounds(349, 0, 70, 20);
    erggekn.setText("4");
    erggekn.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(erggekn);
    erggekz.setText("3");
    erggekz.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(erggekz);
    jLabel6.setText("Gekürzt");
    jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(jLabel6);
    jLabel7.setBounds(328, 32, 14, 20);
    jLabel7.setText("=");
    cp.add(jLabel7);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Bruchrechnen
  
  // Anfang Methoden
  
  // -------------------------------------------
  // Das Hauptrogramm
  public static void main(String[] args) {
    new Bruchrechnen();
  } // end of main

  // -------------------------------------------
  // Berechnung Bruch und Bruch
  public void btnCalcBr_ActionPerformed(ActionEvent evt) {
    Bruch br = new Bruch(nfaz.getInt(),nfan.getInt());
    Bruch br2 = new Bruch(nfbz.getInt(),nfbn.getInt());
    Bruch erg = new Bruch();
    switch (buttonGroup1_getSelectedRadioButtonLabel()) 
    {
      case "+" : 
        erg = br.plus(br2);
        break;
      case "-" : 
        erg = br.minus(br2);
        break;
      case "*" : 
        erg = br.mal(br2);
        break;
      case "/" : 
        erg = br.dividiert(br2);
        break;                  
      default: 
        
    } // end of switch
    ausgeben(erg);
  } // end of btnCalcBr_ActionPerformed

  // -------------------------------------------
  // Berechnung Bruch und Ganzzahl
  public void btnCalcInt_ActionPerformed(ActionEvent evt) {
    Bruch br = new Bruch(nfaz.getInt(),nfan.getInt());
    int ganzzahl = nfint.getInt();
    Bruch erg = new Bruch();
    switch (buttonGroup1_getSelectedRadioButtonLabel()) 
    {
      case "+" : 
        erg = br.plus(ganzzahl);
        break;
      case "-" : 
        erg = br.minus(ganzzahl);
        break;
      case "*" : 
        erg = br.mal(ganzzahl);
        break;
      case "/" : 
        erg = br.dividiert(ganzzahl);
        break;                  
      default: 
        
    } // end of switch
    ausgeben(erg);
  } // end of btnCalcInt_ActionPerformed

  // -------------------------------------------
  //Bruch erweitern
  public void btnErweitere_ActionPerformed(ActionEvent evt) {
    Bruch br = new Bruch(nfaz.getInt(),nfan.getInt());
    br.erweitern(nfint.getInt());
    ausgeben(br); 
  } // end of btnErweitere_ActionPerformed

  // -------------------------------------------
  // Selektierten Radiobutton ermitteln
  public String buttonGroup1_getSelectedRadioButtonLabel() {
    for (java.util.Enumeration<AbstractButton> e = btnGrp.getElements(); e.hasMoreElements();) {
      AbstractButton b = e.nextElement();
      if (b.isSelected()) return b.getText();
    }
    return "";
  }

  // -------------------------------------------
  // Bruch ausgeben (ungekürzt und gekürzt)
  public void ausgeben(Bruch br)
  {
    ergz.setInt(br.getZähler());
    ergn.setInt(br.getNenner());
    br.kürzen();
    erggekz.setInt(br.getZähler());
    erggekn.setInt(br.getNenner());      
  }

  // Ende Methoden
} // end of class Bruchrechnen
