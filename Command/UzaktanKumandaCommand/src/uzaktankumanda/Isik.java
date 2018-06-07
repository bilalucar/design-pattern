package uzaktankumanda;

public class Isik {

	int isikSeviyesi;

	public Isik() {
	}

	public void ac() {
		isikSeviyesi = 100;
		System.out.println("Işık Açık");
	}

	public void kapat() {
		isikSeviyesi = 0;
		System.out.println("Işık Kapalı");
	}

	public void karart(int seviye) {
		this.isikSeviyesi = seviye;
		if (seviye == 0) {
			kapat();
		}
		else {
			System.out.println("Işık " + seviye +"seviyesine indirildi ");
		}
	}

	public int getIsikSeviyesi() {
		return isikSeviyesi;
	}
}
