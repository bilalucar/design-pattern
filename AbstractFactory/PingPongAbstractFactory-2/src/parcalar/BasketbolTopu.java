/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcalar;

import javax.swing.ImageIcon;
import parcainterface.OyunTopu;

/**
 *
 * @author Casper
 */
public class BasketbolTopu implements OyunTopu {

    @Override
    public ImageIcon döndür() {
        ImageIcon basketbolTopu=new javax.swing.ImageIcon(this.getClass().getResource("btop.png"));
	return basketbolTopu;
    }
    
}
