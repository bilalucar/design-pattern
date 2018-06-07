package malzemefactory;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import malzemelerabstract.OyunCubugu;
import malzemelerabstract.Top;

public interface AbstractOyunParcaFactory {
	public void topCiz(Graphics2D g, Integer x1,Integer y1,Integer x2,Integer y2,Top top,Top topTuru2);
	public void oyunCubuguCiz(Graphics2D g,Rectangle sekil,Rectangle sekil2,Integer x1,Integer y1,Integer x2,Integer y2,OyunCubugu oyunCubugu,OyunCubugu orunCubugu2);

	
	
}
