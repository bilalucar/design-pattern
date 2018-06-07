package hayvanlar;

import sescikarmadavranislari.MinikKusSesi;
import ucmadavranislari.MinikKusGibiUcma;

public class Serce extends Hayvan {
 
	public Serce() {
		ucma = new MinikKusGibiUcma();
		sesCikarma = new MinikKusSesi();
	}
 
	public void goster() {
		System.out.println("Ben bir minik serçeyim.");
	}
}
