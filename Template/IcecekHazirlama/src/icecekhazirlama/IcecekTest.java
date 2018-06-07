package icecekhazirlama;

public class IcecekTest {
	public static void main(String[] args) {
 
		Cay cay = new Cay();
		Kahve kahve = new Kahve();
 
		System.out.println("\nÇay yapılıyor...");
		cay.icecekHazirla();
 
		System.out.println("\nKahve yapılıyor...");
		kahve.icecekHazirla();

 
		HookKullananCay hookCay = new HookKullananCay();
		HookKullananKahve hookKahve = new HookKullananKahve();
 
		System.out.println("\nÇay yapılıyor...");
		hookCay.icecekHazirla();
 
		System.out.println("\nKahve yapılıyor...");
		hookKahve.icecekHazirla();
	}
}
