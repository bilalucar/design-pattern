package notdefteri;

import dosya.DosyaYoneticisi;
import dosya.komutlar.AcKomutu;
import dosya.komutlar.CikisKomutu;
import dosya.komutlar.FarkliKaydetKomutu;
import dosya.komutlar.UzerineKaydetKomutu;
import dosya.komutlar.YeniKomutu;
import egikkalin.egik.EgikYaziYoneticisi;
import egikkalin.egik.EgiklikDegistirKomutu;
import egikkalin.kalin.KalinYaziYoneticisi;
import egikkalin.kalin.KalinlikDegistirKomutu;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.StyledDocument;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.FontSizeAction;
import javax.swing.text.StyledEditorKit.ForegroundAction;
import komutkumanda.kumanda.Kumanda;
import yazi.Karakter;
import yazi.KarakterSilKomutu;
import yazi.KarakterYazKomutu;

public class Pencere extends javax.swing.JFrame {
    
    private Kumanda kumanda;
    Karakter karakter = new Karakter();
    private DosyaYoneticisi dosyaYoneticisi = new DosyaYoneticisi();
    private KalinYaziYoneticisi kalinYazi = new KalinYaziYoneticisi();
    private EgikYaziYoneticisi egikYazi = new EgikYaziYoneticisi();
    private KalinlikDegistirKomutu kalinlikDegistirKomutu;
    private EgiklikDegistirKomutu egiklikDegistirKomutu;
    private StyledDocument dokuman;
    private String sonHali; // Silinen karakteri bulabilmek için.
    
    public Pencere() {
        initComponents();
        pencereAyarlariniYap();
        menuAyarlariniYap();
        kumanda = new Kumanda(jTextPane1);
        jTextPane1.setEditorKit(new StyledEditorKit()); //
        dokuman = jTextPane1.getStyledDocument();   //
        dokuman.addDocumentListener(new TextActions());   //
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Not Defteri");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jButton1.setText("Geri Al");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextPane1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jTextPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextPane1KeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(jTextPane1);

        jButton2.setText("K");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("E");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("Dosya");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Aç");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Yeni");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Üzerine Kaydet");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem3.setText("Farklı Kaydet");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator1);
        jMenu1.add(jSeparator2);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Çıkış");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Yazı Boyutu");
        jMenuBar1.add(jMenu2);

        jMenu4.setText("Yazı Rengi");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Yardım");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void pencereAyarlariniYap() {
        setLocationRelativeTo(this);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                new CikisKomutu(dosyaYoneticisi).calistir(jTextPane1);
            }
        });
    }
    
    private void menuAyarlariniYap() {
        // Yazı boyutu menüsü
        for (int i = 50; i >= 10; i -= 10) {
            JMenuItem menuItem = new JMenuItem("" + i);
            menuItem.addActionListener(new FontSizeAction(null, i));
            jMenu2.add(menuItem);
        }

        // Yazı rengi menüsü
        JMenuItem menuItem3 = new JMenuItem("Siyah");
        menuItem3.addActionListener(new ForegroundAction(null, Color.black));
        jMenu4.add(menuItem3);
        JMenuItem menuItem4 = new JMenuItem("Mavi");
        menuItem4.addActionListener(new ForegroundAction(null, Color.blue));
        jMenu4.add(menuItem4);
        JMenuItem menuItem5 = new JMenuItem("Kırmızı");
        menuItem5.addActionListener(new ForegroundAction(null, Color.red));
        jMenu4.add(menuItem5);
    }
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // Aç seçeneği
        new AcKomutu(dosyaYoneticisi).calistir(jTextPane1);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Geri sar butonu
        kumanda.geriAlDugmesineBas();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // Yeni seçeneği
        new YeniKomutu(dosyaYoneticisi).calistir(jTextPane1);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // Farklı kaydet seçeneği
        new FarkliKaydetKomutu(dosyaYoneticisi).calistir(jTextPane1);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // Üzerine kaydet seçeneği
        new UzerineKaydetKomutu(dosyaYoneticisi).calistir(jTextPane1);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // Çıkış seçeneği
        new CikisKomutu(dosyaYoneticisi).calistir(jTextPane1);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // Yardım seçeneği
        new YardimPenceresi().setVisible(true);
    }//GEN-LAST:event_jMenu5MouseClicked
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//        JMenuItem menuItem1 = new JMenuItem("K");
//        menuItem1.addActionListener(new ActionListener() { // new BoldAction()
//            @Override
//            public void actionPerformed(ActionEvent e) {
                kalinlikDegistirKomutu = new KalinlikDegistirKomutu(kalinYazi, jTextPane1.getStyledDocument());
                kalinlikDegistirKomutu.calistir(jTextPane1);
//            }
//        });
//        jMenu3.add(menuItem1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//        JMenuItem menuItem2 = new JMenuItem("E");
//        menuItem2.addActionListener(new ActionListener() { // new ItalicAction()
//            @Override
//            public void actionPerformed(ActionEvent e) {
                egiklikDegistirKomutu = new EgiklikDegistirKomutu(egikYazi, jTextPane1.getStyledDocument());
                egiklikDegistirKomutu.calistir(jTextPane1);
//            }
//        });
//        jMenu3.add(menuItem2);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextPane1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPane1KeyTyped
        if(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE){
//            String yeniHali = jTextPane1.getText();
//            char silinenKarakter = sonHali.charAt(sonHali.length()-1);
//            int silinenIndis = sonHali.length()-1;
//            for(int i = 0; i < sonHali.length() - 1; i++){
//                if(sonHali.charAt(i) != yeniHali.charAt(i)){
//                    silinenKarakter = sonHali.charAt(i);
//                    silinenIndis = i;
//                    break;
//                }
//            }
//            KarakterSilKomutu karakterSilKomutu = new KarakterSilKomutu(karakter, silinenKarakter, silinenIndis);
//            kumanda.komutuYerineGetir(karakterSilKomutu);
//            Document dok = jTextPane1.getDocument();
//            try {
//                dok.insertString(silinenIndis, silinenKarakter+"", null);
//            } catch (Exception ex) { }
//            jTextPane1.setDocument(dok);
//            dosyaYoneticisi.setKaydedildiMi(false);
//            sonHali = jTextPane1.getText();
        } else {
            int i = jTextPane1.getCaretPosition();
            char c = ' ';
            try {
                c = jTextPane1.getDocument().getText(i, 1).charAt(0);
            } catch (Exception ex) { }
            try {    
                KarakterYazKomutu karakterYazKomutu = new KarakterYazKomutu(karakter, c, i);
                kumanda.komutuYerineGetir(karakterYazKomutu);
            } catch (Exception ex) { }
            Document dok = jTextPane1.getDocument();
            try {
                dok.remove(i, 1);
            } catch (Exception ex) { }
            jTextPane1.setDocument(dok);
            dosyaYoneticisi.setKaydedildiMi(false);
            sonHali = jTextPane1.getText();
        }
    }//GEN-LAST:event_jTextPane1KeyTyped

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pencere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pencere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pencere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pencere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pencere().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables

    private class TextActions implements DocumentListener   
    {  
        @Override  
        public void insertUpdate(DocumentEvent e)   
        {  
            
        }  

        @Override  
        public void removeUpdate(DocumentEvent e)  
        {  

        }  

        @Override  
        public void changedUpdate(DocumentEvent e)  
        {  
            
        }  

    }  
    
}