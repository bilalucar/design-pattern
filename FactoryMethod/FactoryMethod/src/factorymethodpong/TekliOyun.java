/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethodpong;

/**
 *
 * @author Yunus
 */
public class TekliOyun extends OyunKurucu {

    @Override
    Oyun oyunKur(String oyunTur) {
        if (oyunTur.equals("tek")) {
            return new TekliOyunTekTop();
        } else {
            return null;
        }
    }
}
