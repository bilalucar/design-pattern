package hayvanlar;


import sescikarmadavranislari.Miyavlama;
import ucmadavranislari.AslaUcamaz;

public class Kedi extends Hayvan {
 
	public Kedi() {
 
		sesCikarma = new Miyavlama();
                ucma = new AslaUcamaz();
 

	}
 
        @Override
	public void goster() {
		System.out.println("Ben bir kediyim");
	}
}
