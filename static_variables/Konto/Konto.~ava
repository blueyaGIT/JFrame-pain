/**
  *
  * CGN1-1: Klasse Konto
  *
  * @version 1.0 vom 07.04.2022
  * @Markus Paul
  */

public class Konto {
  
  // Anfang Attribute
  private double kontostand;
  private static double zinssatz = 0.01;
  // Ende Attribute
  
  // Anfang Methoden
  public double getKontostand() 
  {
    return kontostand;
  }

  public void setKontostand(double kontostand) 
  {
    this.kontostand = kontostand;
  }
  
  static public void setzeZinssatz(double zs)
  {
    zinssatz = zs;
  }
  
  public void gutschreibenZinsen()
  {
    kontostand = kontostand*(1+zinssatz);
  }

  // Ende Methoden
} // end of Konto
