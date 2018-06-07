/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcafactory;

import parcainterface.OyunCubugu;
import parcainterface.OyunTopu;

/**
 *
 * @author Casper
 */
public interface PongGameParcaFactory {
    public OyunCubugu[] cubukEkle();
    public OyunTopu[] topEkle();
}
