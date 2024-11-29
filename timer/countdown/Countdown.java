import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * CGE1 Aufgabe 1
  *
  * @version 1.0 vom 21.02.2019
  * @Markus Paul
  */ 

public class Countdown extends JFrame {
  // Anfang Attribute
  private JButton btnStart = new JButton();
  private Timer derTimer = new Timer(1000, null);
  private JNumberField nfZahl = new JNumberField();
  // Ende Attribute
  
  public Countdown() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300; 
    int frameHeight = 192;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Countdown");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    btnStart.setBounds(64, 80, 153, 41);
    btnStart.setText("Countdown Start");
    btnStart.setMargin(new Insets(2, 2, 2, 2));
    btnStart.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        btnStart_ActionPerformed(evt);
      }
    });
    cp.add(btnStart);
    derTimer.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        derTimer_ActionPerformed(evt);
      }
    });
    derTimer.setRepeats(true);
    derTimer.setInitialDelay(1000);
    nfZahl.setBounds(112, 24, 73, 41);
    nfZahl.setText("");
    nfZahl.setFont(new Font("Dialog", Font.PLAIN, 30));
    nfZahl.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(nfZahl);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Countdown
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Countdown();
  } // end of main
  
  public void btnStart_ActionPerformed(ActionEvent evt) {
    nfZahl.setInt(5);
    btnStart.setEnabled(false);
    derTimer.start();
  } // end of btnStart_ActionPerformed

  public void derTimer_ActionPerformed(ActionEvent evt) {
    nfZahl.setInt(nfZahl.getInt()-1);
    if (nfZahl.getInt() <= 0) 
    {
      derTimer.stop();
      // eventuell zusätzliche Maßnahmen ...
      btnStart.setEnabled(true);
    } // end of if
  } // end of derTimer_ActionPerformed

  // Ende Methoden
} // end of class Countdown
