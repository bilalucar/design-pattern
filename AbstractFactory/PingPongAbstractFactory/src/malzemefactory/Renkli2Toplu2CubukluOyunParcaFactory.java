package malzemefactory;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import malzemelerabstract.OyunCubugu;
import malzemelerabstract.Top;
public class Renkli2Toplu2CubukluOyunParcaFactory  implements AbstractOyunParcaFactory{


	
	@Override
	public void topCiz(Graphics2D g, Integer x1, Integer y1, Integer x2,
			Integer y2, Top topTuru, Top topTuru2) {
		// TODO Auto-generated method stub
		g.setColor(topTuru.renk);
		g.fillOval(x1, y1, topTuru.genislik,topTuru.yukseklik);
		g.setColor(topTuru2.renk);
		g.fillOval(x2, y2, topTuru.genislik,topTuru.yukseklik);
		
	}

	@Override
	public void oyunCubuguCiz(Graphics2D g, Rectangle sekil, Rectangle sekil2,
			Integer x1, Integer y1, Integer x2, Integer y2,
			OyunCubugu oyunCubuguTuru, OyunCubugu oyunCubuguTuru2) {
		// TODO Auto-generated method stub
		g.setColor(oyunCubuguTuru.renk);
		sekil.setBounds(x1, y1, oyunCubuguTuru.genislik, oyunCubuguTuru.yukseklik);
			g.fill(sekil);
			g.draw(sekil);
			g.setColor(oyunCubuguTuru2.renk);
			sekil2.setBounds(x2, y2,oyunCubuguTuru2.genislik, oyunCubuguTuru2.yukseklik);
				g.fill(sekil2);
				g.draw(sekil2);	
	}

	

	
}