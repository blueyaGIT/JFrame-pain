/**
  * CFN1
  * MiniCAD mit abstrakten Klassen
  *
  * @version 1.0 vom 16.02.2022
  * @Markus Paul
  */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MiniCAD extends JFrame {
  // Anfang Attribute
  private Zeichenfläche zeichnung = new Zeichenfläche(this);
  private JList liste = new JList();
    private DefaultListModel listeModel = new DefaultListModel();
    private JScrollPane listeScrollPane = new JScrollPane(liste);
  private JColorChooser colChoose = new JColorChooser();
  private JPanel farbfeld = new JPanel(null, true);
  private JRadioButton rbKreis = new JRadioButton();
  private JRadioButton rbStrecke = new JRadioButton();
  private JRadioButton rbPolygon = new JRadioButton();
  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel3 = new JLabel();
  private JLabel jLabel4 = new JLabel();
  private JLabel jLabel5 = new JLabel();
  private JNumberField nfx1 = new JNumberField();
  private JNumberField nfy1 = new JNumberField();
  private JNumberField nfx2 = new JNumberField();
  private JNumberField nfy2 = new JNumberField();
  private JNumberField nfr = new JNumberField();
  private JSpinner anzEcken = new JSpinner();
    private SpinnerNumberModel anzEckenModel = new SpinnerNumberModel(6, 3, 30, 1);
  private JButton btnErzeugen = new JButton();
  private ButtonGroup btnGrp = new ButtonGroup();
  private JButton btnLoeschen = new JButton();
  private JButton btnVerschieben = new JButton();
  private JButton btnFarbwechsel = new JButton();
  private JButton btnFarbe = new JButton();
  private JRadioButton rbRechteck = new JRadioButton();
  // Ende Attribute
  
  public MiniCAD() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 1080; 
    int frameHeight = 665;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("MiniCAD");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    zeichnung.setBounds(260, 8, 800, 604);
    cp.add(zeichnung);
    liste.setModel(listeModel);
    listeScrollPane.setBounds(8, 272, 233, 340);
    cp.add(listeScrollPane);
    farbfeld.setBounds(4, 4, 234, 33);
    farbfeld.setOpaque(true);
    farbfeld.setBackground(Color.RED);
    farbfeld.setBorder(new javax.swing.border.LineBorder(Color.BLACK));
    cp.add(farbfeld);
    rbKreis.setBounds(8, 136, 80, 20);
    rbKreis.setOpaque(false);
    rbKreis.setText("Kreis");
    btnGrp.add(rbKreis);
    rbKreis.setSelected(true);
    cp.add(rbKreis);
    rbStrecke.setBounds(88, 136, 80, 20);
    rbStrecke.setOpaque(false);
    rbStrecke.setText("Strecke");
    btnGrp.add(rbStrecke);
    cp.add(rbStrecke);
    rbPolygon.setBounds(168, 136, 80, 20);
    rbPolygon.setOpaque(false);
    rbPolygon.setText("Polygon");
    btnGrp.add(rbPolygon);
    cp.add(rbPolygon);
    jLabel2.setBounds(8, 104, 46, 20);
    jLabel2.setText("Radius:");
    cp.add(jLabel2);
    jLabel3.setBounds(8, 72, 57, 20);
    jLabel3.setText("2. Punkt:");
    cp.add(jLabel3);
    jLabel4.setBounds(136, 104, 46, 20);
    jLabel4.setText("Ecken");
    cp.add(jLabel4);
    jLabel5.setBounds(8, 40, 53, 20);
    jLabel5.setText("Position:");
    cp.add(jLabel5);
    
    zeichnung.addMouseListener(new MouseAdapter() { 
      public void mouseClicked(MouseEvent evt) { 
        zeichnung_MouseClicked(evt);
      }
    });
    
    nfx1.setBounds(72, 40, 49, 25);
    nfx1.setText("0");
    nfx1.setHorizontalAlignment(SwingConstants.RIGHT);
    cp.add(nfx1);
    nfy1.setBounds(128, 40, 49, 25);
    nfy1.setText("0");
    nfy1.setHorizontalAlignment(SwingConstants.RIGHT);
    cp.add(nfy1);
    nfx2.setBounds(72, 72, 49, 25);
    nfx2.setText("0");
    nfx2.setHorizontalAlignment(SwingConstants.RIGHT);
    cp.add(nfx2);
    nfy2.setBounds(128, 72, 49, 25);
    nfy2.setText("0");
    nfy2.setHorizontalAlignment(SwingConstants.RIGHT);
    cp.add(nfy2);
    nfr.setBounds(72, 104, 49, 25);
    nfr.setText("0");
    nfr.setHorizontalAlignment(SwingConstants.RIGHT);
    cp.add(nfr);
    anzEcken.setBounds(184, 104, 54, 24);
    anzEcken.setValue(6);
    anzEcken.setModel(anzEckenModel);
    cp.add(anzEcken);

    btnErzeugen.setBounds(8, 208, 113, 25);
    btnErzeugen.setText("Hinzufügen");
    btnErzeugen.setMargin(new Insets(2, 2, 2, 2));
    btnErzeugen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        btnErzeugen_ActionPerformed(evt);
      }
    });
    cp.add(btnErzeugen);
    btnLoeschen.setBounds(128, 208, 113, 25);
    btnLoeschen.setText("Löschen");
    btnLoeschen.setMargin(new Insets(2, 2, 2, 2));
    btnLoeschen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        btnLoeschen_ActionPerformed(evt);
      }
    });
    cp.add(btnLoeschen);
    btnVerschieben.setBounds(8, 240, 113, 25);
    btnVerschieben.setText("Verschieben");
    btnVerschieben.setMargin(new Insets(2, 2, 2, 2));
    btnVerschieben.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        btnVerschieben_ActionPerformed(evt);
      }
    });
    cp.add(btnVerschieben);
    btnFarbwechsel.setBounds(128, 240, 113, 25);
    btnFarbwechsel.setText("Umfärben");
    btnFarbwechsel.setMargin(new Insets(2, 2, 2, 2));
    btnFarbwechsel.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        btnFarbwechsel_ActionPerformed(evt);
      }
    });
    cp.add(btnFarbwechsel);
    btnFarbe.setBounds(80, 8, 78, 25);
    btnFarbe.setText("Farbe");
    btnFarbe.setMargin(new Insets(2, 2, 2, 2));
    btnFarbe.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        btnFarbe_ActionPerformed(evt);
      }
    });
    cp.add(btnFarbe);
    rbRechteck.setBounds(8, 168, 80, 20);
    rbRechteck.setOpaque(false);
    btnGrp.add(rbRechteck);
    rbRechteck.setSelected(true);
    rbRechteck.setText("Rechteck");
    cp.add(rbRechteck);
    // Ende Komponenten
       
    // Nur zu Demonstrationszwecken hier hart programmiert:
    Element elem;
    elem = new Strecke(10,20,150,80,Color.blue);
    zeichnung.neuHinzu(elem);
    elem = new Polygon(200,200,100,6,Color.green);
    zeichnung.neuHinzu(elem); 
    elem = new Kreis(300,300,80,Color.blue);
    zeichnung.neuHinzu(elem);              
    
    setVisible(true);
  } // end of public MiniCAD
  
  // Anfang Methoden
  
  // =================================================================================
  public static void main(String[] args) {
    new MiniCAD();
  } // end of main
  
  // =================================================================================
  // Löschen der Beschreibungsliste
  public void listeClear()
  {
    listeModel.clear();
  }
  
  // =================================================================================
  // Hinzufügen eines Eintrags zur Beschreibungsliste
  public void zulisteHinzu(String text)
  {
    listeModel.addElement(text);
  }
  
  // =================================================================================
  // Button zum Wählen der Farbe  
  public void btnFarbe_ActionPerformed(ActionEvent evt) 
  {
    Color frb = colChoose.showDialog(this, "", Color.BLACK);
    farbfeld.setBackground(frb);
  } // end of btnFarbe_ActionPerformed


  // =================================================================================
  // Reaktion auf Mausklick
  public void zeichnung_MouseClicked(MouseEvent evt) 
  {
    int x = evt.getX();
    int y = evt.getY();
    if (!evt.isMetaDown()) 
    {
      nfx1.setInt(x);
      nfy1.setInt(y);      
    }
    else 
    {
      int dx = nfx1.getInt()-x;
      int dy = nfy1.getInt()-y;
      nfx2.setInt(x);
      nfy2.setInt(y);   
      nfr.setInt((int)Math.sqrt(dx*dx+dy*dy));   
    } // end of if
    
  } // end of zeichnung_MouseClicked

  // =================================================================================
  // Reaktion auf Button zum Erzeugen eines Elements
  public void btnErzeugen_ActionPerformed(ActionEvent evt) {
    Color farbe = farbfeld.getBackground();
    Element elem;
    switch (btnGrp_getSelectedRadioButtonLabel()) {
      case  "Kreis":
        elem = new Kreis(nfx1.getInt(),nfy1.getInt(),nfr.getInt(),farbe);
        zeichnung.neuHinzu(elem);
        break;
      case  "Strecke": 
        elem = new Strecke(nfx1.getInt(),nfy1.getInt(),nfx2.getInt(),nfy2.getInt(),farbe);
        zeichnung.neuHinzu(elem);
        break;
      case  "Polygon": 
        elem = new Polygon(nfx1.getInt(),nfy1.getInt(),nfr.getInt(),(int)(anzEcken.getValue()),farbe);
        zeichnung.neuHinzu(elem);
        break; 
      case  "Rechteck": 
        elem = new Rechteck(nfx1.getInt(),nfy1.getInt(),nfx2.getInt(),nfy2.getInt(),farbe);
        zeichnung.neuHinzu(elem);
        break;                       
      default: 
        
    } // end of switch
  } // end of btnErzeugen_ActionPerformed

  // =================================================================================
  // Reaktion auf Button zum Löschen des selektierten Elements
  public void btnLoeschen_ActionPerformed(ActionEvent evt) {
    int sel = liste.getSelectedIndex();
    if (sel>=0) 
    {
      zeichnung.loeschen(sel);
    } // end of if
  } // end of btnLoeschen_ActionPerformed

  // =================================================================================
  // Reaktion auf Button zum Verschieben
  public void btnVerschieben_ActionPerformed(ActionEvent evt) {
    int sel = liste.getSelectedIndex();
    if (sel>=0) 
    {
      zeichnung.verschiebe(sel,nfx1.getInt(),nfy1.getInt());
    } // end of if
  } // end of btnVerschieben_ActionPerformed

  // =================================================================================
  // Reaktion auf Button zum Ändern der Farbe
  public void btnFarbwechsel_ActionPerformed(ActionEvent evt) {
    int sel = liste.getSelectedIndex();
    if (sel>=0) 
    {
      zeichnung.neueFarbe(sel,farbfeld.getBackground());
    } // end of if
  } // end of btnFarbwechsel_ActionPerformed

  // =================================================================================
  // Aktuell angewählter Radiobutton
  public String btnGrp_getSelectedRadioButtonLabel() {
    for (java.util.Enumeration<AbstractButton> e = btnGrp.getElements(); e.hasMoreElements();) {
      AbstractButton b = e.nextElement();
      if (b.isSelected()) return b.getText();
    }
    return "";
  }
  // Ende Methoden
} // end of class MiniCAD
