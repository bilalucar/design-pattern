/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethodpong;

/**
 *
 * @author Yunus
 */
public class MultiOyun extends OyunKurucu {

    @Override
    Oyun oyunKur(String oyunTur) {
        if (oyunTur.equals("cift")) {
            return new MultiOyunCiftTop();
        } else if (oyunTur.equals("uc")) {
            return new MultiOyunUcTop();
        } else {
            return null;
        }
    }
}
