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
public class PongGame1ParcaFactory implements PongGameParcaFactory {

    @Override
    public OyunCubugu[] cubukEkle() {
        OyunCubugu cubuk[] = {new StandartSiyahCubuk()};
        return cubuk;
    }

    @Override
    public OyunTopu[] topEkle() {
        OyunTopu top[] = {new GulenTop()};
        return top;
    }
}
