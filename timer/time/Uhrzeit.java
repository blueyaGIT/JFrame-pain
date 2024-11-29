/**
  *
  * CGE1 Aufgabe 4
  *
  * @version 1.0 vom 21.02.2019
  * @Markus Paul
  */ 

public class Uhrzeit {
  
  // Anfang Attribute
  private int std;
  private int min;
  private int sek;
  // Ende Attribute
  
  public Uhrzeit()
  {
    std = 0;
    min = 0;
    sek = 0;
  }
   
  // Anfang Methoden  
  public void setZeit(int h, int m, int s)
  {
    std = h;
    min = m;
    sek = s;
  }  
  
  // Anfang Methoden 
  public String UhrzeitString()
  {
    return String.format("%02d:%02d:%02d",std, min, sek);
  }
  
  public void timerTick()
  {
    sek++;
    if (sek >= 60)
    {
      sek = 0;
      min++;
      if (min >=60) 
      {
         min = 0;
         std++;
         if (std >= 24) 
         {
            std = 0; 
         } // end of if
      } // end of if
    }
  }
  // Ende Methoden
} // end of Uhrzeit
