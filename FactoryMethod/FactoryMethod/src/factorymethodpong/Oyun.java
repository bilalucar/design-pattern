/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethodpong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Yunus
 */
public abstract class Oyun {

    protected String baslik;
    Rectangle2D cubuk;
    Ellipse2D top;
    static int oyunTip;
    static boolean ai;

    public Oyun() {
    }

    void cubukEkle(Graphics g, int x, int y, int width, int height) {
        Graphics2D g2d = (Graphics2D) g;
        cubuk = new Rectangle(x, y, width, height);
        g2d.setColor(Color.DARK_GRAY);
        g2d.fill(cubuk);
    }

    void topEkle(Graphics g, double x, double y, double width, double height, Color c) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(c);
        top = new Ellipse2D.Double(x, y, width, height);
        g2d.fill(top);
    }

    OyunPanel panelEkle() {
        return new OyunPanel();

    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public int getOyunTip() {
        return oyunTip;
    }

    public void setOyunTip(int oyunTip) {
        this.oyunTip = oyunTip;
    }
}
