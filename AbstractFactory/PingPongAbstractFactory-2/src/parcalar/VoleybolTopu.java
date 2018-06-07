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
public class VoleybolTopu implements OyunTopu{

    @Override
    public ImageIcon döndür() {
        ImageIcon voleybolTopu=new javax.swing.ImageIcon(this.getClass().getResource("vtop.png"));
	return voleybolTopu;
    }
    
}
