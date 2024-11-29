import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import java.util.*;
/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 12.05.2022
 * @author 
 */

public class GUI extends JFrame {
  // Anfang Attribute
  private JButton bEinlesen = new JButton();
  private JList jList1 = new JList();
    private DefaultListModel jList1Model = new DefaultListModel();
    private JScrollPane jList1ScrollPane = new JScrollPane(jList1);
  private File dieDatei = null;
  private Scanner derScanner = null;
  // Ende Attribute
  
  public GUI() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 448; 
    int frameHeight = 435;
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
    
    bEinlesen.setBounds(22, 12, 100, 25);
    bEinlesen.setText("Einlesen");
    bEinlesen.setMargin(new Insets(2, 2, 2, 2));
    bEinlesen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bEinlesen_ActionPerformed(evt);
      }
    });
    cp.add(bEinlesen);
    jList1.setModel(jList1Model);
    jList1ScrollPane.setBounds(22, 47, 390, 332);
    cp.add(jList1ScrollPane);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public GUI
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new GUI();
  } // end of main
  
  public void bEinlesen_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    einlesen("uenuenuen.txt");
  } // end of bEinlesen_ActionPerformed
  
  public void einlesen(String dateiname)
  {
    try
    {
      if(derScanner == null)
      {
        dieDatei = new File(dateiname);
        derScanner = new Scanner(dieDatei);
      }
      if(derScanner.hasNextLine())
      {
        String zeile = derScanner.nextLine();
        jList1Model.addElement(zeile);
      }
    }
    catch(FileNotFoundException exc) 
    { 
      jList1Model.addElement("Datei existiert nicht"); 
    } 
    catch(ArithmeticException exc) 
    { 
      jList1Model.addElement("Arithmetischer Fehler"); 
    } 
    catch(NullPointerException exc) 
    { 
      jList1Model.addElement("Objekt existiert nicht"); 
    } 
    catch(NoSuchElementException exc) 
    { 
      jList1Model.addElement("Dateiende");
    }
    catch(Exception exc)
    {
      jList1Model.addElement("Fehler");
    }
  }
  // Ende Methoden
} // end of class GUI

