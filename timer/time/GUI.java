import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * CGE1 Aufgabe 4
  *
  * @version 1.0 vom 21.02.2019
  * @Markus Paul
  */ 

public class GUI extends JFrame {
  // Anfang Attribute
  private JNumberField nfStd = new JNumberField();
  private JNumberField nfMin = new JNumberField();
  private JNumberField nfSek = new JNumberField();
  private JButton btnStellen = new JButton();
  
  private Timer myTimer = new Timer(1000, null);
  private Uhr eineUhr = null;
  private JLabel display = new JLabel();
  // Ende Attribute
  
  public GUI() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 422; 
    int frameHeight = 178;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Uhr");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
  
    nfStd.setBounds(16, 16, 27, 20);
    nfStd.setText("00");
    nfStd.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(nfStd);
    nfMin.setBounds(48, 16, 27, 20);
    nfMin.setText("00");
    nfMin.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(nfMin);
    nfSek.setBounds(80, 16, 27, 20);
    nfSek.setText("00");
    nfSek.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(nfSek);
    btnStellen.setBounds(16, 48, 89, 25);
    btnStellen.setText("Uhr stellen");
    btnStellen.setMargin(new Insets(2, 2, 2, 2));
    btnStellen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        btnStellen_ActionPerformed(evt);
      }
    });
    cp.add(btnStellen);
    myTimer.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        myTimer_ActionPerformed(evt);
      }
    });
    display.setBounds(128, 40, 246, 39);
    display.setText("text");
    display.setFont(new Font("Dialog", Font.BOLD, 30));
    display.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(display);
    display.setHorizontalTextPosition(SwingConstants.LEFT);
    display.setBackground(Color.WHITE);
    display.setOpaque(true);
    eineUhr = new Uhr(this);
    
    //myTimer.setRepeats(true);
    myTimer.start();
    
    setVisible(true);
  } // end of public GUI
  
  // Anfang Methoden
  
  public static void main(String[] args) 
  {
    new GUI();
  } // end of main
  
  public void btnStellen_ActionPerformed(ActionEvent evt) 
  {
    if (eineUhr != null) 
    {
      int h = nfStd.getInt();
      int m = nfMin.getInt();
      int s = nfSek.getInt();
      eineUhr.stelleUhr(h,m,s);
    } // end of if

    
  } // end of btnStellen_ActionPerformed

  public void myTimer_ActionPerformed(ActionEvent evt) 
  {
     eineUhr.timerTick();
  } // end of myTimer_ActionPerformed

  public void zeitAusgeben(String zeit)
  {
    display.setText(zeit);
  }
  // Ende Methoden
} // end of class GUI
