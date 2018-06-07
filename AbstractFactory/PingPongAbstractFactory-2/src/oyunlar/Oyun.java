package oyunlar;

import parcainterface.*;

public abstract class Oyun {
	String isim;
	OyunCubugu cubuk[];
	OyunTopu top[];

	public abstract void olustur();
        
	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}
}
