import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * CGE1 Aufgabe 2
  *
  * @version 1.0 vom 21.02.2019
  * @Markus Paul
  */ 

public class Ampel extends JFrame {
  // Anfang Attribute
  private JButton btnStart = new JButton();
  private JButton btnStop = new JButton();
  private Timer derTimer = new Timer(1000, null);
  private Steuerung dieSteuerung;
  private int zaehler;
  private Grafik ampel = new Grafik();
  // Ende Attribute
  
  public Ampel() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 247; 
    int frameHeight = 201;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Ampel");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    btnStart.setBounds(16, 24, 105, 41);
    btnStart.setText("Start");
    btnStart.setMargin(new Insets(2, 2, 2, 2));
    btnStart.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        btnStart_ActionPerformed(evt);
      }
    });
    cp.add(btnStart);
    btnStop.setBounds(16, 96, 105, 41);
    btnStop.setText("Stop");
    btnStop.setMargin(new Insets(2, 2, 2, 2));
    btnStop.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        btnStop_ActionPerformed(evt);
      }
    });
    cp.add(btnStop);
    derTimer.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        derTimer_ActionPerformed(evt);
      }
    });
    derTimer.setRepeats(true);
    derTimer.setInitialDelay(0);
    
    btnStop.setEnabled(false);
    derTimer.setDelay(1000);
    
    dieSteuerung = new Steuerung(this);
    ampel.setBounds(168, 24, 49, 113);
    ampel.setBackground(new Color(0xC0C0C0));
    cp.add(ampel);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Ampel
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Ampel();
  } // end of main
  
  public void btnStart_ActionPerformed(ActionEvent evt) {
    btnStart.setEnabled(false);
    btnStop.setEnabled(true);
    derTimer.start();   
  } // end of btnStart_ActionPerformed

  public void btnStop_ActionPerformed(ActionEvent evt) {
    btnStart.setEnabled(true);
    btnStop.setEnabled(false);
    derTimer.stop();
    dieSteuerung.aus();
  } // end of btnStop_ActionPerformed

  public void derTimer_ActionPerformed(ActionEvent evt) {
    dieSteuerung.takt();
  } // end of derTimer_ActionPerformed

  public void zustand(boolean r, boolean o, boolean g)
  {
    ampel.zustand(r,o,g);
  }
  // Ende Methoden
} // end of class Ampel
