package malzemefactory;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import malzemelerabstract.OyunCubugu;
import malzemelerabstract.Top;
public class VarsayilanOyunParcaFactory implements AbstractOyunParcaFactory {

	



	@Override
	public void topCiz(Graphics2D g, Integer x1, Integer y1, Integer x2,
			Integer y2, Top topTuru, Top topTuru2) {
		// TODO Auto-generated method stub
		g.setColor(topTuru.renk);
		g.fillOval(x1, y1, topTuru.genislik,topTuru.yukseklik);
		
	}

	@Override
	public void oyunCubuguCiz(Graphics2D g, Rectangle sekil, Rectangle sekil2,
			Integer x1, Integer y1, Integer x2, Integer y2,
			OyunCubugu oyunCubuguTuru, OyunCubugu orunCubuguTuru2) {
		// TODO Auto-generated method stub
		g.setColor(oyunCubuguTuru.renk);
		sekil.setBounds(x1, y1, oyunCubuguTuru.genislik, oyunCubuguTuru.yukseklik);
		g.fill(sekil);
		g.draw(sekil);
	}


	
}
