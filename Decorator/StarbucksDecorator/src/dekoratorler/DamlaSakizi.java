package dekoratorler;
 
import icecekler.Icecek;

public class DamlaSakizi extends IcindekilerDecorator {
	Icecek icecek;
 
	public DamlaSakizi(Icecek beverage) {
		this.icecek = beverage;
	}
 
        @Override
	public String getIsim() {
		return icecek.getIsim() + ", Damla Sakızlı";
	}
 
        @Override
	public double fiyatHesapla() {
		return 1.10 + icecek.fiyatHesapla();
	}
}
