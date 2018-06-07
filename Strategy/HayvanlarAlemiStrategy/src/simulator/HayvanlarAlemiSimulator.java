package simulator;

import hayvanlar.Hayvan;
import hayvanlar.Kopek;
import hayvanlar.Kartal;
import hayvanlar.Kedi;
import hayvanlar.Serce;
import ucmadavranislari.MinikKusGibiUcma;

public class HayvanlarAlemiSimulator {

    public static void main(String[] args) {

        Hayvan hayvan = new Kedi();
        hayvan.sesCikar();
        
        hayvan = new Serce();
        hayvan.sesCikar();
        
        hayvan= new Kopek();
        hayvan.sesCikar();
        
        hayvan= new Kartal();
        hayvan.sesCikar();
       
        hayvan.uc();
        hayvan.ucusAyarla(new MinikKusGibiUcma());
        hayvan.uc();
        
        hayvan= new Kopek();
        hayvan.uc();
        
       
  

        
    }
}
