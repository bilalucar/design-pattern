package notdefteri;

import java.awt.EventQueue;

public class NotDefteri {

    public static void main(String[] args) {
        
        /* Ersin Çine, Sena Çelik */
        
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pencere().setVisible(true);
            }
        });
        
    }
}