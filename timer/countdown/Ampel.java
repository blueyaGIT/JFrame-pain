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
  private JPanel rot = new JPanel(null, true);
  private JPanel orange = new JPanel(null, true);
  private JPanel gruen = new JPanel(null, true);
  private Steuerung dieSteuerung;
  private int zaehler;
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
    rot.setBounds(176, 24, 33, 33);
    rot.setOpaque(true);
    rot.setBackground(Color.GRAY);
    cp.add(rot);
    orange.setBounds(176, 64, 33, 33);
    orange.setOpaque(true);
    orange.setBackground(Color.GRAY);
    cp.add(orange);
    gruen.setBounds(176, 104, 33, 33);
    gruen.setOpaque(true);
    gruen.setBackground(Color.GRAY);
    cp.add(gruen);
    
    btnStop.setEnabled(false);
    derTimer.setDelay(1000);
    
    dieSteuerung = new Steuerung(this);
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
    if (r)
    {
      rot.setBackground(Color.RED);
    } 
    else
    {
      rot.setBackground(Color.GRAY);
    }
    if (o)
    {
      orange.setBackground(Color.ORANGE);
    } 
    else
    {
      orange.setBackground(Color.GRAY);
    }
    if (g)
    {
      gruen.setBackground(Color.GREEN);   
    }
    else
    {
      gruen.setBackground(Color.GRAY);    
    }            
  }
  // Ende Methoden
} // end of class Ampel
