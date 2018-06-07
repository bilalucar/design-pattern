package uygulama;

import icecekmakinesi.IcecekMakinesi;

public class IcecekMakinesiTest {

	public static void main(String[] args) {
		IcecekMakinesi icecekMakinesi = new IcecekMakinesi(5);

		System.out.println(icecekMakinesi);

		icecekMakinesi.paraAt();
		icecekMakinesi.calis();

		System.out.println(icecekMakinesi);

		icecekMakinesi.paraAt();
		icecekMakinesi.calis();
                
		icecekMakinesi.paraAt();
		icecekMakinesi.calis();

		System.out.println(icecekMakinesi);
	}
}
