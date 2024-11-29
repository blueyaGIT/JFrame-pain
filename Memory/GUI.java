import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 19.05.2022
 * @author 
 */

public class GUI extends JFrame {
  // Anfang Attribute
  private JButton bMischen = new JButton();
  private JButton bWeiter = new JButton();
  private Karte[] kaertchen = new Karte[36];
  private ImageIcon[] bilder = new ImageIcon[18];
  private Rectangle[] positionen = new Rectangle[36];
  // Ende Attribute
  
  public GUI() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 552; 
    int frameHeight = 615;
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
    
    bMischen.setBounds(10, 10, 80, 25);
    bMischen.setText("Mischen");
    bMischen.setMargin(new Insets(2, 2, 2, 2));
    bMischen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bMischen_ActionPerformed(evt);
      }
    });
    cp.add(bMischen);
    bWeiter.setBounds(95, 10, 80, 25);
    bWeiter.setText("Weiter");
    bWeiter.setMargin(new Insets(2, 2, 2, 2));
    bWeiter.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bWeiter_ActionPerformed(evt);
      }
    });
    cp.add(bWeiter);
    // Ende Komponenten
    
    // lade Bilder
    for(int bildnr=0; bildnr<=17; bildnr++)
    {
      bilder[bildnr] = new ImageIcon("Bilder/"+bildnr+".jpg");
    }
    // Definiere Positionen 
    for(int posnr = 0; posnr <36; posnr++)
    {
      int xpos, ypos, spalte, zeile;
      spalte = posnr % 6;
      zeile = posnr / 6;
      xpos = 10 + spalte * 85;
      ypos = 45 + zeile * 85;
      positionen[posnr] = new Rectangle(xpos,ypos,80,80);
    }  
    //positionen[0] = new Rectangle(10,45,80,80); 
    //positionen[1] = new Rectangle(95,45,80,80);
    
    // Erzeuge und positioniere Kärtchen 
    for(int kartnr=0; kartnr<36; kartnr++)
    {
      kaertchen[kartnr] = new Karte(bilder[kartnr/2]);
      kaertchen[kartnr].setBounds(positionen[kartnr]);
      cp.add(kaertchen[kartnr]);
      //bKaertchen[kartnr].addActionListener(new ActionListener();
      
    }
    //kaertchen[0] = new Karte(bilder[0]); 
    //kaertchen[1] = new Karte(bilder[1]); 
    //kaertchen[0].setBounds(positionen[0]); 
    //kaertchen[1].setBounds(positionen[1]); 
    //cp.add(kaertchen[0]); 
    //cp.add(kaertchen[1]); 
    setVisible(true);
  } // end of public GUI
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new GUI();
  } // end of main
  
  public void bMischen_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    for(int kartnr = 0; kartnr <36; kartnr++)
    {
      kaertchen[kartnr].aufdecken();
    }
    //kaertchen[0].aufdecken(); 
    //kaertchen[1].aufdecken(); 
  } // end of bMischen_ActionPerformed

  public void bWeiter_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    for(int kartnr = 0; kartnr <36; kartnr++)
    {
      kaertchen[kartnr].zudecken();
    }
    //kaertchen[0].zudecken(); 
    //kaertchen[1].zudecken(); 
  } // end of bWeiter_ActionPerformed

  // Ende Methoden
} // end of class GUI

