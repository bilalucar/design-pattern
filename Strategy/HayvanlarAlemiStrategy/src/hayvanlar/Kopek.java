package hayvanlar;


import sescikarmadavranislari.Havlama;
import ucmadavranislari.AslaUcamaz;

public class Kopek extends Hayvan {
	public Kopek() {
		ucusAyarla(new AslaUcamaz());
		sesAyarla(new Havlama());
	}
        @Override
	public void goster() {
		System.out.println("Ben bir köpeğim");
	}
}
