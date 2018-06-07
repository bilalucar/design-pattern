/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcafactory;

import parcainterface.*;
import parcalar.*;

/**
 *
 * @author Casper
 */
public class PongGame2ParcaFactory implements PongGameParcaFactory {

    @Override
    public OyunCubugu[] cubukEkle() {
        OyunCubugu cubuk[] = {new MaviCubuk(),new KirmiziCubuk()};
        return cubuk;
    }

    @Override
    public OyunTopu[] topEkle() {
        OyunTopu top[] = {new BasketbolTopu(),new FutbolTopu(),new VoleybolTopu()};
        return top;
    }
}
