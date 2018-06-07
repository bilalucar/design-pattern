/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcalar;

import javax.swing.ImageIcon;
import parcainterface.*;

/**
 *
 * @author Casper
 */
public class GulenTop implements OyunTopu{
    
    @Override
    public ImageIcon döndür() {
        ImageIcon gülenTop=new javax.swing.ImageIcon(this.getClass().getResource("ball.png"));
	return gülenTop;
	}
}
