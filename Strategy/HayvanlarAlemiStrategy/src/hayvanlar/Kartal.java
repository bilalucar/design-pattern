package hayvanlar;

import sescikarmadavranislari.KartalSesi;
import ucmadavranislari.KartalGibiUcma;

public class Kartal extends Hayvan {
	public Kartal() {
		ucma = new KartalGibiUcma();
		sesCikarma = new KartalSesi();
	}

        @Override
	public void goster() {
		System.out.println("Kartalım ben");
	}
}
