import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 17.03.2022
 * @author 
 */

public class GUI extends JFrame {
  // Anfang Attribute
  private JNumberField zahl = new JNumberField();
  private JButton bStop = new JButton();
  private JButton bStart = new JButton();
  private Timer meinTimer = new Timer(1000, null);
  private JButton bContinue = new JButton();
  private JPanel jPanel1 = new JPanel(null, true);
  private JPanel jPanel2 = new JPanel(null, true);
  private JPanel jPanel3 = new JPanel(null, true);
  // Ende Attribute
  
  public GUI() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 302; 
    int frameHeight = 357;
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
    
    zahl.setBounds(54, 13, 83, 76);
    zahl.setText("");
    zahl.setFont(new Font("Dialog", Font.PLAIN, 30));
    zahl.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(zahl);
    bStop.setBounds(54, 132, 75, 25);
    bStop.setText("Stop");
    bStop.setMargin(new Insets(2, 2, 2, 2));
    bStop.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bStop_ActionPerformed(evt);
      }
    });
    cp.add(bStop);
    bStart.setBounds(54, 100, 75, 25);
    bStart.setText("Start");
    bStart.setMargin(new Insets(2, 2, 2, 2));
    bStart.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bStart_ActionPerformed(evt);
      }
    });
    cp.add(bStart);
    meinTimer.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        meinTimer_ActionPerformed(evt);
      }
    });
    meinTimer.setRepeats(true);
    meinTimer.setInitialDelay(1000);
    bContinue.setBounds(54, 163, 75, 25);
    bContinue.setText("Continue");
    bContinue.setMargin(new Insets(2, 2, 2, 2));
    bContinue.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bContinue_ActionPerformed(evt);
      }
    });
    cp.add(bContinue);
    jPanel1.setBounds(156, 13, 84, 76);
    jPanel1.setOpaque(true);
    jPanel1.setBackground(new Color(0xC0C0C0));
    cp.add(jPanel1);
    jPanel2.setBounds(156, 109, 84, 76);
    jPanel2.setOpaque(true);
    jPanel2.setBackground(new Color(0xC0C0C0));
    cp.add(jPanel2);
    jPanel3.setBounds(156, 197, 84, 76);
    jPanel3.setOpaque(true);
    jPanel3.setBackground(new Color(0xC0C0C0));
    cp.add(jPanel3);
    meinTimer.setDelay(1000);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public GUI
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new GUI();
  } // end of main
  
  public void bStop_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    meinTimer.stop();
  } // end of bStop_ActionPerformed

  public void bStart_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    zahl.setInt(0);
    jPanel1.setForeground(Color.red);
    jPanel1.setBackground(Color.red);
    meinTimer.start();
  } // end of bStart_ActionPerformed

  public void meinTimer_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    zahl.setInt(zahl.getInt()+1);
    if(zahl.getInt()<20){
      meinTimer.stop();
      zahl.setInt(0);
    }
    switch(zahl.getInt()){
      case 1:
        jPanel1.setForeground(Color.red);
        jPanel1.setBackground(Color.red);
        break;
      case 11:
        jPanel2.setForeground(Color.yellow);
        jPanel2.setBackground(Color.yellow);
        break;
      case 13:
        jPanel1.setForeground(Color.lightGray);
        jPanel1.setBackground(Color.lightGray);
        jPanel2.setForeground(Color.lightGray);
        jPanel2.setBackground(Color.lightGray);
        jPanel3.setForeground(Color.green);
        jPanel3.setBackground(Color.green);
        break;
      case 19:
        jPanel1.setForeground(Color.lightGray);
        jPanel1.setBackground(Color.lightGray);
        jPanel2.setForeground(Color.yellow);
        jPanel2.setBackground(Color.yellow);
        jPanel3.setForeground(Color.lightGray);
        jPanel3.setBackground(Color.lightGray);
        break;
      case 20:
        jPanel1.setBackground(Color.red);
        jPanel2.setForeground(Color.red);
        jPanel2.setBackground(Color.lightGray);
        jPanel3.setForeground(Color.lightGray);
        jPanel3.setBackground(Color.lightGray);
        break;
    }
  } // end of meinTimer_ActionPerformed

  public void bContinue_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    meinTimer.start();
  } // end of bContinue_ActionPerformed

  // Ende Methoden
} // end of class GUI

