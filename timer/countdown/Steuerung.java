/**
  *
  * CGE1 Aufgabe 2
  *
  * @version 1.0 vom 21.02.2019
  * @Markus Paul
  */ 

public class Steuerung {
  
  // Anfang Attribute
  private Ampel dieAmpel;
  private int zaehler;
  // Ende Attribute
  
  public Steuerung(Ampel eineAmpel) 
  {
    dieAmpel = eineAmpel;
    aus();
  }

  // Anfang Methoden 
  public void aus()
  {
    zaehler = 0;
    dieAmpel.zustand(false, false, false);    
  }
  
  public void takt()
  {
    if (zaehler<20)
    {
      zaehler = zaehler+1;
    }
    else
    {
      zaehler = 1;
    } // end of if
    
    if ((zaehler>=1)&&(zaehler<=10)) 
    {
      dieAmpel.zustand(true, false, false);    
    } // end of if
    if ((zaehler>=11)&&(zaehler<=12)) 
    {
      dieAmpel.zustand(true, true, false);    
    } // end of if
    if ((zaehler>=13)&&(zaehler<=18)) 
    {
      dieAmpel.zustand(false, false, true);    
    } // end of if
    if ((zaehler>=19)&&(zaehler<=20)) 
    {
      dieAmpel.zustand(false, true, false);    
    } // end of if             
  }
  // Ende Methoden
} // end of Steuerung
