package oyunlar;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import oyunfactory.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Casper
 */
public class PongGame_1_1 extends javax.swing.JFrame {

    AnaMenu menu = null;
    static ImageIcon gt, sc;
    Timer zaman = new Timer(8, new TimerListener());//topun hareketi
    Timer zaman2 = new Timer(1000, new TimerListener2());//zaman
    Timer zaman3 = new Timer(30, new TimerListener3());//oyun cubugunu konumlandırmak icin
    int sol, solilk, ust, ustilk, alt, ustKenar, x, y, cubukGen, solKenar, sagKenar, saniye = 0;
    boolean ss, ya, kontrol = false;
    static File dosya = new File("c:\\abc.txt");
    //sol(X) ve ust(Y) topun konumu
    //alt(Y), y(Y), x(X) oyun cubugunun konumu

    /**
     * Creates new form PongGame
     */
    private PongGame_1_1() {
        initComponents();
        jTextField1.addKeyListener(new MyKeyListener());
        this.setResizable(false);
        jLabel1.setIcon(gt);
        jLabel3.setIcon(sc);
    }

    public void rastgele() {
        int a = (int) (Math.random() * 2);
        int b = (int) (Math.random() * 2);
        if (a == 0) {
            ss = false;
        } else if (a == 1) {
            ss = true;
        }
        if (b == 0) {
            ya = false;
        } else if (b == 1) {
            ya = true;
        }
    }

    public static void getInstance(Oyun oyun) throws IOException {

        if (dosya.exists() == false) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new PongGame_1_1().setVisible(true);
                }
            });
        }
        try (PrintWriter dosyaYaz = new PrintWriter(dosya)) {
            dosyaYaz.print("JAVA");
            dosyaYaz.close();
        }
        gt = (oyun.top[0].döndür());
        sc = (oyun.cubuk[0].döndür());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(153, 153, 153))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(223, 223, 223))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addComponent(jLabel2))
                .addGap(112, 112, 112)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(47, 47, 47)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        rastgele();
        ImageIcon dikeyCubuk = new javax.swing.ImageIcon(this.getClass().getResource("dikey.jpg"));
        ImageIcon yatayCubuk = new javax.swing.ImageIcon(this.getClass().getResource("yatay.png"));
        jLabel2.setIcon(yatayCubuk);
        jLabel4.setIcon(dikeyCubuk);
        jLabel5.setIcon(dikeyCubuk);
        ustKenar = jLabel2.getY() + 8;
        solKenar = jLabel4.getX();
        sagKenar = jLabel5.getX() + 12;
        x = jLabel3.getX();
        y = jLabel3.getY();
        cubukGen = 88;
        Point pt = jLabel1.getLocation();
        sol = (int) pt.getX();
        ust = (int) pt.getY();
        solilk = sol;
        ustilk = ust;
        Point pt2 = jLabel3.getLocation();
        alt = (int) pt2.getY() - 20;
        zaman.start();
        zaman2.start();
        zaman3.start();

    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        PrintWriter dosyaYaz1;
        try {
            dosyaYaz1 = new PrintWriter(dosya);
            dosyaYaz1.print("JAVA");
            dosyaYaz1.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PongGame_1_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        dosya.delete();
        ust = ustilk;
        sol = solilk;
        zaman.stop();
        zaman2.stop();

        menu = null;
        try {
            AnaMenu.getInstance(false);
        } catch (IOException ex) {
            Logger.getLogger(PongGame_1_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    public class MyKeyListener extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent ke) {
            int keyCode = ke.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_LEFT:
                    if (x > solKenar + 5) {
                        for (int i = 0; i < 7; i++) {
                            x--;
                        }
                    }
                    jLabel3.setLocation(x, y);
                    break;
                case KeyEvent.VK_RIGHT:
                    if (((x + jLabel3.getWidth()) < sagKenar - 15)) {
                        for (int i = 0; i < 7; i++) {
                            x++;
                        }
                    }
                    jLabel3.setLocation(x, y);
                    break;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/ustKenarorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PongGame_1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        AbstractOyunFactory oyun1 = new Oyun1Factory();
        Oyun oyun11 = oyun1.oyunTüret("oyun1");
        getInstance(oyun11);

    }

    class TimerListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (sol > solKenar && ss == false) {
                sol--;
                jLabel1.setLocation(sol, ust);
                if (ya == true) {
                    ust++;
                    if (ust == alt && sol > x - 15 && sol < x + cubukGen) {
                        ya = false;
                    }
                }
                if (ya == false) {
                    ust--;
                    if (ust == ustKenar) {
                        ya = true;
                    }
                }
                if (sol == solKenar) {
                    ss = true;
                }
            }
            if (ss == true && ((sol + jLabel1.getWidth()) < sagKenar - 15)) {
                sol++;
                jLabel1.setLocation(sol, ust);
                if (ya == true) {
                    ust++;
                    if (ust == alt && sol > x - 15 && sol < x + cubukGen) {
                        ya = false;
                    }
                }
                if (ya == false) {
                    ust--;
                    if (ust == ustKenar) {
                        ya = true;
                    }
                }
                if ((sol + jLabel1.getWidth()) >= sagKenar - 15) {
                    ss = false;
                }
            }
            if (ust > alt + 10) {
                kontrol = true;
            }
            if (kontrol) {
                zaman.stop();
                zaman2.stop();
                JOptionPane.showMessageDialog(null, "Kaybettin :(\nSkor : " + saniye);
            }
        }
    }

    class TimerListener2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //jLabel6.setText(Integer.toString(saniye));
            saniye++;
        }
    }

    class TimerListener3 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //jLabel6.setText(Integer.toString(saniye));
            x++;
            jLabel3.setLocation(x, y);
            zaman3.stop();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel jLabel1;
    private static javax.swing.JLabel jLabel2;
    private static javax.swing.JLabel jLabel3;
    private static javax.swing.JLabel jLabel4;
    private static javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
