import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * CGN1-1
  *
  * @version 1.0 vom 07.04.2022
  * @Markus Paul
  */

public class GUI extends JFrame {
  // Anfang Attribute
  private JList liste = new JList();
    private DefaultListModel listeModel = new DefaultListModel();
    private JScrollPane listeScrollPane = new JScrollPane(liste);
  private JButton btnKonten = new JButton();
  private JButton btnZins = new JButton();
  private JNumberField nfZins = new JNumberField();
  private JLabel jLabel1 = new JLabel();
  private Konto[] konten = new Konto[4];
  private JButton btnGutschrift = new JButton();
  // Ende Attribute
  
  public GUI() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300; 
    int frameHeight = 461;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("GUI");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    liste.setModel(listeModel);
    listeScrollPane.setBounds(8, 88, 265, 417);
    cp.add(listeScrollPane);
    btnKonten.setBounds(8, 48, 123, 25);
    btnKonten.setText("Konten anzeigen");
    btnKonten.setMargin(new Insets(2, 2, 2, 2));
    btnKonten.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        btnKonten_ActionPerformed(evt);
      }
    });
    cp.add(btnKonten);
    btnZins.setBounds(8, 8, 123, 25);
    btnZins.setText("Zinssatz ändern");
    btnZins.setMargin(new Insets(2, 2, 2, 2));
    btnZins.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        btnZins_ActionPerformed(evt);
      }
    });
    cp.add(btnZins);
    nfZins.setBounds(160, 8, 75, 28);
    nfZins.setText("1");
    nfZins.setHorizontalAlignment(SwingConstants.RIGHT);
    cp.add(nfZins);
    jLabel1.setBounds(240, 8, 21, 27);
    jLabel1.setText("%");
    cp.add(jLabel1);
    btnGutschrift.setBounds(136, 48, 131, 25);
    btnGutschrift.setText("Zinsgutschrift");
    btnGutschrift.setMargin(new Insets(2, 2, 2, 2));
    btnGutschrift.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        btnGutschrift_ActionPerformed(evt);
      }
    });
    cp.add(btnGutschrift);
    // Ende Komponenten
    
    for (int i=0; i<4; i++) 
    {
      konten[i] = new Konto();
    } // end of for
    konten[0].setKontostand(100);
    konten[1].setKontostand(500);
    konten[2].setKontostand(1000);
    konten[3].setKontostand(2000);   
    
    setVisible(true);
  } // end of public GUI
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new GUI();
  } // end of main
  
  public void btnKonten_ActionPerformed(ActionEvent evt) 
  {
    for (int i=0; i<4; i++) 
    {
      listeModel.addElement("Konto "+i+": "+String.format("%5.2f €",konten[i].getKontostand()));
    } // end of for
  } // end of btnKonten_ActionPerformed

  public void btnZins_ActionPerformed(ActionEvent evt) 
  {
    Konto.setzeZinssatz(nfZins.getDouble()/100);
    listeModel.addElement("Neuer Zinssatz: "+String.format("%5.2f %%",nfZins.getDouble()));
  } // end of btnZins_ActionPerformed

  public void btnGutschrift_ActionPerformed(ActionEvent evt) {
    for (int i=0; i<4; i++) 
    {
      konten[i].gutschreibenZinsen();
    } // end of for  
    listeModel.addElement("Zinsgutschrift für alle Konten");  
  } // end of btnGutschrift_ActionPerformed

  // Ende Methoden
} // end of class GUI
