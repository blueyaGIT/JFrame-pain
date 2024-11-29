import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import java.util.*;
/**
  *
  * CFE1: Aufgabe 1
  *
  * @version 1.0 vom 12.05.2022
  * @author 
  */

public class Dateizugriff extends JFrame {
  // Anfang Attribute
  private JList jlAusgabe = new JList();
    private DefaultListModel jlAusgabeModel = new DefaultListModel();
    private JScrollPane jlAusgabeScrollPane = new JScrollPane(jlAusgabe);
  // Ende Attribute
  
  public Dateizugriff() throws Exception { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 473; 
    int frameHeight = 481;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Dateizugriff");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jlAusgabe.setModel(jlAusgabeModel);
    jlAusgabeScrollPane.setBounds(8, 8, 441, 425);
    cp.add(jlAusgabeScrollPane);
    // Ende Komponenten

    einlesen("CFE1.txt");
    
    setVisible(true);
  } // end of public Dateizugriff
  
  // Anfang Methoden
  public void einlesen(String dateiname) throws Exception
  {
      File dieDatei = new File(dateiname);
      Scanner derScanner = new Scanner(dieDatei);
      while (derScanner.hasNextLine()) 
      { 
        String zeile = derScanner.nextLine();
        jlAusgabeModel.addElement(zeile);
      } // end of while
  }
    
  public static void main(String[] args) throws Exception
  {
    new Dateizugriff();
  } // end of main
  
  // Ende Methoden
} // end of class Dateizugriff
