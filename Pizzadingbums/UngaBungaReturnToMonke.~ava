import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 23.09.2021
 * @author 
 */

public class UngaBungaReturnToMonke extends JFrame {
  // Anfang Attribute
  private JCheckBox cbTomaten1 = new JCheckBox();
  private JCheckBox cbMozzarella = new JCheckBox();
  private JCheckBox cbOregano = new JCheckBox();
  private JCheckBox cbSalami = new JCheckBox();
  private JCheckBox cbOliven = new JCheckBox();
  private JCheckBox cbPilze = new JCheckBox();
  private JRadioButton rbKlein1 = new JRadioButton();
  private JRadioButton rbMittel1 = new JRadioButton();
  private JRadioButton rbGross1 = new JRadioButton();
  private JRadioButton rbAbholung = new JRadioButton();
  private JRadioButton rbLiefern = new JRadioButton();
  private JComboBox<String> jComboBoxLieferung = new JComboBox<String>();
    private DefaultComboBoxModel<String> jComboBoxLieferungModel = new DefaultComboBoxModel<String>();
  private ButtonGroup abholen = new ButtonGroup();
  private ButtonGroup groesse = new ButtonGroup();
  private JButton bPreisberechnen = new JButton();
  private JTextField jTextFieldPreis = new JTextField();
  private JLabel lGesamt1 = new JLabel();
  private JList jListZutaten = new JList();
    private DefaultListModel jListZutatenModel = new DefaultListModel();
    private JScrollPane jListZutatenScrollPane = new JScrollPane(jListZutaten);
  private JCheckBox cbSardinen = new JCheckBox();
  private JCheckBox cbAnanas = new JCheckBox();
  private JCheckBox cbThunfisch = new JCheckBox();
  // Ende Attribute
  
public UngaBungaReturnToMonke() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 508; 
    int frameHeight = 839;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("UngaBungaReturnToMonke");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    cbTomaten1.setBounds(39, 36, 100, 20);
    cbTomaten1.setOpaque(false);
    cbTomaten1.setText("  Tomaten");
    cbTomaten1.setSelected(true);
    cp.add(cbTomaten1);
    cbMozzarella.setBounds(175, 36, 100, 20);
    cbMozzarella.setOpaque(false);
    cbMozzarella.setText("  Mozzarella");
    cbMozzarella.setSelected(true);
    cp.add(cbMozzarella);
    cbOregano.setBounds(319, 36, 100, 20);
    cbOregano.setOpaque(false);
    cbOregano.setText("  Oregano");
    cbOregano.setSelected(true);
    cp.add(cbOregano);
    cbSalami.setBounds(39, 92, 100, 20);
    cbSalami.setOpaque(false);
    cbSalami.setText("  Salami");
    cp.add(cbSalami);
    cbOliven.setBounds(175, 92, 100, 20);
    cbOliven.setOpaque(false);
    cbOliven.setText("  Oliven");
    cp.add(cbOliven);
    cbPilze.setBounds(319, 92, 164, 20);
    cbPilze.setOpaque(false);
    cbPilze.setText("  Pilze");
    cp.add(cbPilze);
    rbKlein1.setBounds(40, 169, 100, 20);
    rbKlein1.setOpaque(false);
    rbKlein1.setText("Klein");
    groesse.add(rbKlein1);
    cp.add(rbKlein1);
    rbMittel1.setBounds(176, 169, 100, 20);
    rbMittel1.setOpaque(false);
    rbMittel1.setText("Mittel");
    groesse.add(rbMittel1);
    cp.add(rbMittel1);
    rbGross1.setBounds(320, 169, 100, 20);
    rbGross1.setOpaque(false);
    rbGross1.setText("Groß");
    groesse.add(rbGross1);
    cp.add(rbGross1);
    rbAbholung.setBounds(115, 233, 100, 20);
    rbAbholung.setOpaque(false);
    rbAbholung.setText("  Abholung");
    abholen.add(rbAbholung);
    cp.add(rbAbholung);
    rbLiefern.setBounds(267, 234, 100, 20);
    rbLiefern.setOpaque(false);
    rbLiefern.setText("  Liefern");
    abholen.add(rbLiefern);
    cp.add(rbLiefern);
    jComboBoxLieferung.setModel(jComboBoxLieferungModel);
    jComboBoxLieferung.setBounds(267, 263, 150, 20);
    jComboBoxLieferungModel.addElement("Schwäbisch Gmünd");
    jComboBoxLieferungModel.addElement("Eschach");
    jComboBoxLieferungModel.addElement("Durlangen");
    jComboBoxLieferungModel.addElement("Lorch");
    jComboBoxLieferungModel.addElement("Waldstetten");
    jComboBoxLieferungModel.addElement("Straßdorf");
    jComboBoxLieferungModel.addElement("Nordkorea");
    jComboBoxLieferungModel.addElement("Leinzell");
    jComboBoxLieferungModel.addElement("Brainkofen");
    jComboBoxLieferungModel.addElement("Iggingen");
    jComboBoxLieferungModel.addElement("Göggingen");
    cp.add(jComboBoxLieferung);
    bPreisberechnen.setBounds(56, 318, 123, 25);
    bPreisberechnen.setText("Preis berechnen");
    bPreisberechnen.setMargin(new Insets(2, 2, 2, 2));
    bPreisberechnen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bPreisberechnen_ActionPerformed(evt);
      }
    });
    cp.add(bPreisberechnen);
    jTextFieldPreis.setBounds(272, 320, 145, 25);
    jTextFieldPreis.setText("");
    cp.add(jTextFieldPreis);
    lGesamt1.setBounds(208, 320, 57, 25);
    lGesamt1.setText("  Gesamt");
    lGesamt1.setHorizontalAlignment(SwingConstants.RIGHT);
    cp.add(lGesamt1);
    jListZutaten.setModel(jListZutatenModel);
    jListZutatenScrollPane.setBounds(56, 368, 361, 257);
    cp.add(jListZutatenScrollPane);
    cbSardinen.setBounds(39, 132, 100, 20);
    cbSardinen.setOpaque(false);
    cbSardinen.setText("  Sardinen");
    cp.add(cbSardinen);
    cbAnanas.setBounds(175, 132, 100, 20);
    cbAnanas.setOpaque(false);
    cbAnanas.setText("  Ananas");
    cp.add(cbAnanas);
    cbThunfisch.setBounds(319, 132, 100, 20);
    cbThunfisch.setOpaque(false);
    cbThunfisch.setText("  Thunfisch");
    cp.add(cbThunfisch);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public UngaBungaReturnToMonke
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new UngaBungaReturnToMonke();
  } // end of main
  
  public String abholen_getSelectedRadioButtonLabel() {
    for (java.util.Enumeration<AbstractButton> e = abholen.getElements(); e.hasMoreElements();) {
      AbstractButton b = e.nextElement();
      if (b.isSelected()) return b.getText();
    }
    return "";
  }

  public String groesse_getSelectedRadioButtonLabel() {
    for (java.util.Enumeration<AbstractButton> e = groesse.getElements(); e.hasMoreElements();) {
      AbstractButton b = e.nextElement();
      if (b.isSelected()) return b.getText();
    }
    return "";
  }
  public String bildePreis(int preis) 
  {
    double euro = preis/100.0;  
    return String.format("%5.2f €",euro);
  } 
  public void bPreisberechnen_ActionPerformed(ActionEvent evt) 
  {
    
    jListZutatenModel.clear();
    int preis = 0;
    String pizza= "";
    
    switch(groesse_getSelectedRadioButtonLabel())
    {
      case "Klein":
           pizza="kleine Pizza (Grundpreis 4€)";
           preis = preis + 400;
           break;
      case "Mittel":
           pizza="mittlere Pizza (Grundpreis 6€)";
           preis = preis + 600;
           break;
      case "Groß":
           pizza="große Pizza (Grundpreis 7€)";
           preis = preis + 700;
           break;
      //default:
      //        jListZutatenModel.addElement("htoeud "+groesse_getSelectedRadioButtonLabel());
      //        break;
    }
    jListZutatenModel.addElement("Ihre "+pizza+" enthält: ");
    
    if(cbTomaten1.isSelected())
    {
      jListZutatenModel.addElement("*Tomaten");
    }
    if(cbMozzarella.isSelected())
    {
      jListZutatenModel.addElement("*Mozzarella");
    }
    if(cbOregano.isSelected())
    {
      jListZutatenModel.addElement("*Oregano");
    }
    if(cbSalami.isSelected())
    {
      jListZutatenModel.addElement("*Salami (+70ct)");
      preis=preis + 70;
    }
    if(cbOliven.isSelected())
    {
      jListZutatenModel.addElement("*Oliven (+50ct)");
      preis=preis + 50;
    }
    if(cbPilze.isSelected())
    {
      jListZutatenModel.addElement("*Pilze (+50ct)");
      preis=preis + 50;
    }
    String ort = (String)jComboBoxLieferung.getSelectedItem();
    if(rbAbholung.isSelected())
    {
      jListZutatenModel.addElement("Abholung durch Kunden");
    }
    else
    {
      jListZutatenModel.addElement("Lieferung an "+ort+"");
      switch(ort)
      {
        case "Schwäbisch Gmünd":
          preis = preis + 100;
          break;
        case "Eschach":
          preis = preis + 500;
          break;
        case "Durlangen":
          preis = preis + 1000;
          break;
        case "Lorch":
          preis = preis + 10000;
          break;
        case "Waldstetten":
          preis = preis + 200;
          break;
        case "Straßdorf":
          preis = preis + 50;
          break;
        case "Nordkorea":
          preis = preis + 1908234597;
          break;
        case "Leinzell":
          preis = preis + 300;
          break;
        case "Brainkofen":
          preis = preis + 400;
          break;
        case "Göggingen":
          preis = preis + 450;
          break;
      }
    }
    
    jTextFieldPreis.setText(bildePreis(preis));
    
    if(cbAnanas.isSelected())
      {
      jListZutatenModel.clear();
      jListZutatenModel.addElement("You have been banned frome thise Website");
      }
    
    if(cbSardinen.isSelected())
      {
      jListZutatenModel.clear();
      jListZutatenModel.addElement("You have been banned frome thise Website");
      }
    
    if(cbThunfisch.isSelected())
      {
      jListZutatenModel.clear();
      jListZutatenModel.addElement("You have been banned frome thise Website");
      }
  } // end of bPreisberechnen_ActionPerformed
  
  // Ende Methoden
} // end of class UngaBungaReturnToMonke

