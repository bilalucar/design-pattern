/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcalar;

import javax.swing.ImageIcon;
import parcainterface.OyunCubugu;

/**
 *
 * @author Casper
 */
public class StandartSiyahCubuk implements OyunCubugu{

    @Override
    public ImageIcon döndür() {
        ImageIcon standartSiyahCubuk=new javax.swing.ImageIcon(this.getClass().getResource("cubuk.png"));
        return standartSiyahCubuk;
    }
    
}
