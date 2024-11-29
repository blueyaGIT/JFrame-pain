import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 07.10.2021
 * @author 
 */

public class Wechselkurs extends JFrame {
  // Anfang Attribute
  private JRadioButton rbUSA = new JRadioButton();
  private JRadioButton rbInselaffen = new JRadioButton();
  private JRadioButton rbNihon = new JRadioButton();
  private JRadioButton rbMotherland = new JRadioButton();
  private JRadioButton rbSchweden = new JRadioButton();
  private JRadioButton rbHoppSchwiz = new JRadioButton();
  private JNumberField jNumberField1 = new JNumberField();
  private JNumberField nf = new JNumberField();
  private JNumberField jNumberField2 = new JNumberField();
  private JNumberField jNumberField4 = new JNumberField();
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  private ImageIcon flaggeEuro =  new ImageIcon("eu.jpg");
  private ImageIcon flaggeUSD =  new ImageIcon("us.jpg");
  private ImageIcon flaggeGBP =  new ImageIcon("gb.jpg");
  private ImageIcon flaggeCHF =  new ImageIcon("ch.jpg");
  private ImageIcon flaggeSEK =  new ImageIcon("se.jpg");
  private ImageIcon flaggeJPY =  new ImageIcon("jp.jpg");
  private ImageIcon flaggeRUB =  new ImageIcon("ru.jpg");
  private ButtonGroup buttonGroup2 = new ButtonGroup();
  // Ende Attribute
  
  public Wechselkurs() {     // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 530; 
    int frameHeight = 322;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Wechselkurs");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    rbUSA.setBounds(77, 54, 100, 20);
    rbUSA.setOpaque(false);
    rbUSA.setText("USA");
    rbUSA.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        rbUSA_ActionPerformed(evt);
      }
    });
    buttonGroup2.add(rbUSA);
    cp.add(rbUSA);
    rbInselaffen.setBounds(77, 86, 100, 20);
    rbInselaffen.setOpaque(false);
    rbInselaffen.setText("Inselaffen");
    rbInselaffen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        rbInselaffen_ActionPerformed(evt);
      }
    });
    buttonGroup2.add(rbInselaffen);
    cp.add(rbInselaffen);
    rbNihon.setBounds(77, 214, 100, 20);
    rbNihon.setOpaque(false);
    rbNihon.setText("Nihon");
    rbNihon.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        rbNihon_ActionPerformed(evt);
      }
    });
    buttonGroup2.add(rbNihon);
    cp.add(rbNihon);
    rbMotherland.setBounds(77, 182, 100, 20);
    rbMotherland.setOpaque(false);
    rbMotherland.setText("Motherland");
    rbMotherland.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        rbMotherland_ActionPerformed(evt);
      }
    });
    buttonGroup2.add(rbMotherland);
    cp.add(rbMotherland);
    rbSchweden.setBounds(77, 150, 100, 20);
    rbSchweden.setOpaque(false);
    rbSchweden.setText("Schweden");
    rbSchweden.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        rbSchweden_ActionPerformed(evt);
      }
    });
    buttonGroup2.add(rbSchweden);
    cp.add(rbSchweden);
    rbHoppSchwiz.setBounds(77, 118, 100, 20);
    rbHoppSchwiz.setOpaque(false);
    rbHoppSchwiz.setText("Hopp Schwiz");
    rbHoppSchwiz.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        rbHoppSchwiz_ActionPerformed(evt);
      }
    });
    buttonGroup2.add(rbHoppSchwiz);
    cp.add(rbHoppSchwiz);
    jNumberField1.setBounds(193, 173, 107, 20);
    jNumberField1.setText("");
    jNumberField1.setBackground(new Color(0xC0C0C0));
    jNumberField1.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(jNumberField1);
    nf.setBounds(345, 173, 107, 20);
    nf.setText("1");
    nf.setBackground(new Color(0xC0C0C0));
    nf.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(nf);
    jNumberField2.setBounds(193, 205, 107, 20);
    jNumberField2.setText("");
    jNumberField2.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(jNumberField2);
    jNumberField4.setBounds(345, 205, 107, 20);
    jNumberField4.setText("");
    jNumberField4.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(jNumberField4);
    jButton1.setBounds(184, 72, 129, 89);
    jButton1.setText("");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
        
      }
    });
    cp.add(jButton1);
    jButton2.setBounds(336, 72, 129, 89);
    jButton2.setIcon(flaggeEuro);
    jButton2.setText("");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Wechselkurs
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Wechselkurs();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext setText(""+wert3+"");
    double eurobetrag = 0.0;
    double fremdbetrag = 0.0;
    double kurs = 0.0;
    eurobetrag = jNumberField4.getDouble();
    kurs = jNumberField1.getDouble();
    eurobetrag = fremdbetrag * kurs;
    jNumberField2.setDouble(eurobetrag);
    
  } // end of jButton1_ActionPerformed

  public void jButton2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of jButton2_ActionPerformed

  public void rbInselaffen_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    jButton1.setIcon(flaggeGBP);
    jNumberField1.setText("1,15796");
  } // end of rbInselaffen_ActionPerformed

  public void rbUSA_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    jButton1.setIcon(flaggeUSD);
    jNumberField1.setText("0,85887");
  } // end of rbUSA_ActionPerformed

  public void rbHoppSchwiz_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    jButton1.setIcon(flaggeCHF);
    jNumberField1.setText("0,92210");
  } // end of rbHoppSchwiz_ActionPerformed

  public void rbSchweden_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    jButton1.setIcon(flaggeSEK);
    jNumberField1.setText("0,09800");
  } // end of rbSchweden_ActionPerformed

  public void rbMotherland_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    jButton1.setIcon(flaggeJPY);
    jNumberField1.setText("0,00769");
  } // end of rbMotherland_ActionPerformed

  public void rbNihon_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    jButton1.setIcon(flaggeRUB);
    jNumberField1.setText("0,01179");
  } // end of rbNihon_ActionPerformed

  public String buttonGroup2_getSelectedRadioButtonLabel() {
    for (java.util.Enumeration<AbstractButton> e = buttonGroup2.getElements(); e.hasMoreElements();) {
      AbstractButton b = e.nextElement();
      if (b.isSelected()) return b.getText();
    }
    return "";
  }

  // Ende Methoden
} // end of class Wechselkurs

