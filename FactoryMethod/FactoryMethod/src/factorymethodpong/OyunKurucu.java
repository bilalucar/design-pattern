/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethodpong;

import java.awt.Graphics;

/**
 *
 * @author Yunus
 */
abstract class OyunKurucu {

    abstract Oyun oyunKur(String oyunTur);

    public Oyun baslat(String oyunTur) {

        Oyun game = oyunKur(oyunTur);
        System.out.println("Oyun başlatılıyor...");

        return game;
    }
}
