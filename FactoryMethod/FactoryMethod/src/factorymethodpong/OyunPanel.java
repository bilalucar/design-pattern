 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethodpong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashSet;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Yunus
 */
public class OyunPanel extends JPanel implements KeyListener, ActionListener {

    Oyun oyun1 = new Oyun() {
    };
    /*-----TOP ÖZELLİKLERİ------*/
    private double topX, topY, dX = 1, dY = 1, boyut = 12;
    private double yX, yY, yDx = 1, yDy = 1, yBoyut = 12;
    private double uX, uY, uDx = 1, uDy = 1, uBoyut = 12;
    /*-----ÇUBUK ÖZELLİKLERİ-----*/
    private final int HIZ = 2;
    private int cubukH = 10, cubukW = 80;
    private int altCubukX, ustCubukX;
    private int ek = 10;
    Image cubuk;
    /*-----FRAME ÖZELLİKLERİ------*/
    private int boy, en;
    private Timer t = new Timer(5, this);
    private boolean ilkVurus;
    private int skorAlt, skorUst;
    private HashSet<String> tus = new HashSet<>();
    Image background;

    public OyunPanel() {
        URL url=getClass().getResource("/images/arka3.jpg");
        background = Toolkit.getDefaultToolkit().getImage(url);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        ilkVurus = true;
        t.setInitialDelay(100);
        t.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(background, 0, 0, null);
        boy = getHeight();
        en = getWidth();
        g2d.drawImage(cubuk, 0, 0, this);
        if (ilkVurus) {
            altCubukX = en / 2 - cubukW / 2;
            ustCubukX = altCubukX;
            topX = en / 2 - boyut / 2;
            topY = boy / 2 - boyut / 2;
            yX = 400;
            yY = 10;
            uX = 20;
            uY = 10;
            ilkVurus = false;
        }
        /* SKOR TABLOSU
         String skorA = "P1:" + String.valueOf(skorAlt);
         g2d.setColor(Color.WHITE);
         g2d.drawString(skorA, 10, boy / 2);
        
         String skorU = "P2:" + String.valueOf(skorUst);
         g2d.setColor(Color.WHITE);
         g2d.drawString(skorU, en - 30, boy / 2);
         */
        //Çubuk        
        oyun1.cubukEkle(g, altCubukX, boy - cubukH - ek, cubukW, cubukH);
        if (oyun1.getOyunTip() == 1 || oyun1.getOyunTip() == 2) {
            oyun1.cubukEkle(g, ustCubukX, ek, cubukW, cubukH);
        }

        //Top
        oyun1.topEkle(g, topX, topY, boyut, boyut, Color.red);
        if (oyun1.getOyunTip() == 1) {
            oyun1.topEkle(g, yX, yY, yBoyut, yBoyut, Color.MAGENTA);
        } else if (oyun1.getOyunTip() == 2) {
            oyun1.topEkle(g, yX, yY, yBoyut, yBoyut, Color.MAGENTA);
            oyun1.topEkle(g, uX, uY, uBoyut, uBoyut, Color.GREEN);
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        switch (code) {
            case KeyEvent.VK_LEFT:
                tus.add("LEFT");
                break;
            case KeyEvent.VK_RIGHT:
                tus.add("RIGHT");
                break;
            case KeyEvent.VK_A:
                tus.add("A");
                break;
            case KeyEvent.VK_D:
                tus.add("D");
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        switch (code) {
            case KeyEvent.VK_LEFT:
                tus.remove("LEFT");
                break;
            case KeyEvent.VK_RIGHT:
                tus.remove("RIGHT");
                break;
            case KeyEvent.VK_A:
                tus.remove("A");
                break;
            case KeyEvent.VK_D:
                tus.remove("D");
                break;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // yan duvarlar
        if (topX < 0 || topX > en - boyut) {
            dX = -dX;
        }
        if (yX < 0 || yX > en - boyut) {
            yDx = -yDx;
        }
        if (uX < 0 || uX > en - boyut) {
            uDx = -uDx;
        }
        // asağı yukarı duvarlar
        if (topY < 0) {
            dY = -dY;
            skorAlt++;

        }
        if (yY < 0) {
            yDy = -yDy;
            skorAlt++;
        }
        if (uY < 0) {
            uDy = -uDy;
            skorAlt++;
        }
//--------------------------------------------
        if (topY + boyut > boy) {
            dY = -dY;
            skorUst++;
        }

        if (yY + yBoyut > boy) {
            yDy = -yDy;
            skorUst++;
        }
        if (uY + uBoyut > boy) {
            uDy = -uDy;
            skorUst++;
        }
//----------------------------------------------
        if (topY + boyut >= boy - cubukH - ek && dY > 0) {
            if (topX + boyut >= altCubukX && topX <= altCubukX + cubukW) {
                dY = -dY;

            }
        }
        if (yY + yBoyut >= boy - cubukH - ek && yDy > 0) {
            if (yX + yBoyut >= altCubukX && yX <= altCubukX + cubukW) {
                yDy = -yDy;

            }
        }
        if (uY + uBoyut >= boy - cubukH - ek && uDy > 0) {
            if (uX + uBoyut >= altCubukX && uX <= altCubukX + cubukW) {
                uDy = -uDy;

            }
        }
//---------------------------------------------------------------
        if (topY <= cubukH + ek && dY < 0) {
            if (topX + boyut >= ustCubukX && topX <= ustCubukX + cubukW) {
                dY = -dY;
            }
        }
        topX += dX;
        topY += dY;

        if (yY <= cubukH + ek && yDy < 0) {
            if (yX + yBoyut >= ustCubukX && yX <= ustCubukX + cubukW) {
                yDy = -yDy;
            }
        }
        yX += yDx;
        yY += yDy;

        if (uY <= cubukH + ek && uDy < 0) {
            if (uX + uBoyut >= ustCubukX && uX <= ustCubukX + cubukW) {
                uDy = -uDy;
            }
        }
        uX += uDx;
        uY += uDy;

        //Tuş kontrolü

        if (tus.contains("LEFT")) {
            altCubukX -= (altCubukX > 0) ? HIZ : 0;
        } else if (tus.contains("RIGHT")) {
            altCubukX += (altCubukX < en - cubukW) ? HIZ : 0;
        }

        if (Oyun.ai) {
            double delta = topX - ustCubukX;
            if (delta > 0) {
                ustCubukX += (ustCubukX < en - cubukW) ? HIZ : 0;
            } else if (delta < 0) {
                ustCubukX -= (ustCubukX > 0) ? HIZ : 0;
            }
        }


        if (tus.contains("D")) {
            ustCubukX += (ustCubukX < en - cubukW) ? HIZ : 0;
        } else if (tus.contains("A")) {
            ustCubukX -= (ustCubukX > 0) ? HIZ : 0;
        }


        repaint();
    }
}
