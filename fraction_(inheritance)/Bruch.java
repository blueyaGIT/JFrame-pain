/**
  *
  * Überladen von Methoden
  *
  * @version 1.0 vom 17.03.2022
  * @Markus Paul 
  */

public class Bruch {
  
  // Anfang Attribute
  private int zähler;
  private int nenner;
  // Ende Attribute
  
  // Anfang Methoden
  public int getZähler() 
  {
    return zähler;
  }
  
  public int getNenner() 
  {
    return nenner;
  }
  
  // ---------------------------------
  // Konstruktor ohne Parameter
  public Bruch()
  {
    zähler = 0;
    nenner = 1;
  }

  // ---------------------------------
  // Konstruktor mit ganzzahligem Parameter
  public Bruch(int z)
  {
    zähler = z;
    nenner = 1;
  }
  
  // ---------------------------------
  // Konstruktor mit Zähler und Nenner
  public Bruch(int z, int n)
  {
    if (n == 0)
    {
      zähler = z;
      nenner = 1;    
    }
    else if (n < 0)
    {
      zähler = -z;
      nenner = -n;
    } 
    else
    {
      zähler = z;
      nenner = n;        
    } // end of if-else
  }
  
  // ---------------------------------
  // Größter gemeinsamer Teiler zweier Zahlen
  // (ggT) nach Euklid-Algorithmus
  public int ggt(int zahl1, int zahl2)
  {
    if (zahl1 == 0)
    {
      if (zahl2 == 0)
      {
        return 1; 
      }
      else
      {
        return zahl2;
      }
    }
    else
    {
      if (zahl2 == 0)
      {
        return zahl1;
      }   
      else
      {
        int dividend = zahl1;
        int divisor = zahl2;
        int rest = 0;
        do
        {
          rest = dividend % divisor;
          if (rest != 0)
          {
            dividend = divisor;
            divisor = rest;
          }
        } while (rest != 0);
        return divisor;
      }      
    }
  }
  
  // ---------------------------------
  // Bruch erweitern mit angegebener Zahl
  public void erweitern(int zahl)
  {
    if (zahl != 0)
    {
      zähler = zähler*zahl;
      nenner = nenner*zahl;
    }
  }
  
  // ---------------------------------
  // Bruch kürzen
  public void kürzen()
  {
    int teiler = ggt(zähler,nenner);
    zähler = zähler/teiler;
    nenner = nenner/teiler;
  } 
  
  // ---------------------------------
  // Bruch kürzen  
  public int kgv(int zahl1, int zahl2)
  {
    return zahl1*zahl2/ggt(zahl1,zahl2);
  } 

  // ---------------------------------
  // Addition einer ganzen Zahl    
  public Bruch plus(int zahl)
  {
    return new Bruch(zähler+zahl*nenner,nenner);
  }

  // ---------------------------------
  // Addition eines Bruch    
  public Bruch plus(Bruch br)
  {
    int hn = kgv(nenner,br.getNenner());
    int faktor1 = hn/nenner;
    int faktor2 = hn/br.getNenner();
    return new Bruch(zähler*faktor1+br.getZähler()*faktor2,hn);
  }
  
  // ---------------------------------
  // Subtraktion einer ganzen Zahl    
  public Bruch minus(int zahl)
  {
    return new Bruch(zähler-zahl*nenner,nenner);
  }

  // ---------------------------------
  // Subtraktion eines Bruchs
  public Bruch minus(Bruch br)
  {
    int hn = kgv(nenner,br.getNenner());
    int faktor1 = hn/nenner;
    int faktor2 = hn/br.getNenner();
    return new Bruch(zähler*faktor1-br.getZähler()*faktor2,hn);
  }

  // ---------------------------------
  // Multiplikation mit einer ganzen Zahl 
  public Bruch mal(int zahl)
  {
    return new Bruch(zähler*zahl,nenner);
  }

  // ---------------------------------
  // Multiplikation mit einem Bruch
  public Bruch mal(Bruch br)
  {
    return new Bruch(zähler*br.getZähler(),nenner*br.getNenner());
  }
  
  // ---------------------------------
  // Division durch eine ganze Zahl 
  public Bruch dividiert(int zahl)
  {
    return new Bruch(zähler,nenner*zahl);
  }

  // ---------------------------------
  // Division durch einen Bruch
  public Bruch dividiert(Bruch br)
  {
    return new Bruch(zähler*br.getNenner(),nenner*br.getZähler());
  }  
  // Ende Methoden
} // end of Bruch

