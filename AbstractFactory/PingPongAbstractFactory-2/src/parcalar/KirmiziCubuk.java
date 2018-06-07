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
public class KirmiziCubuk implements OyunCubugu {

    @Override
    public ImageIcon döndür() {
        ImageIcon kirmiziCubuk=new javax.swing.ImageIcon(this.getClass().getResource("kcubuk.png"));
        return kirmiziCubuk;
    }
    
}
