package hayvanlar;

import sescikarmadavranislari.SesCikarmaDavranisi;
import ucmadavranislari.UcmaDavranisi;

public abstract class Hayvan {
	UcmaDavranisi ucma;
	SesCikarmaDavranisi sesCikarma;
 
	public Hayvan() {
	}
 
	public void ucusAyarla (UcmaDavranisi ucma) {
		this.ucma = ucma;
	}
 
	public void sesAyarla(SesCikarmaDavranisi sesCikarma) {
		this.sesCikarma = sesCikarma;
	}
 
	abstract void goster();
 
	public void uc() {
		ucma.uc();
	}
 
	public void sesCikar() {
		sesCikarma.sesCikar();
	}
 
	public void hareketEt() {
		System.out.println("Tüm hayvanlar hareket eder.");
	}
}
