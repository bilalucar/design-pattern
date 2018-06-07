package singleton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.net.ServerSocket;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import oyunfactory.AbstractOyunFactory;
import oyunfactory.Renkli2Toplu2CubukluOyunFactor;
import oyunfactory.VarsayilanOyunFactory;
import oyunlar.Oyun;
import oyunlar.Renkli2Toplu2CubukluOyun;
import oyunlar.VarsayilanOyun;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class OyunBaslaEkrani extends javax.swing.JFrame {
	private JPanel panel;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel4;
	private JLabel jLabel3;
	private JLabel jLabel2;
	private JLabel jLabel1;
	private JLabel oyunaHosgeldiniz;
	private JButton girisButonu;
	private JComboBox komboBox;
	private Oyun oyun;
	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
	
		 ServerSocket tekOyun;
	SingletonSinifi singleton;

		try {
				tekOyun=new ServerSocket(1334);
				SingletonSinifi.getInstance().oyna();
				
	    		
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Oyun zaten açıkk");
			}

	
	
	
	}
	
	public OyunBaslaEkrani() {
		super();
		initGUI();
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				panel = new JPanel();
				getContentPane().add(panel);
				panel.setBounds(0, 0, 379, 228);
				panel.setLayout(null);
				{
					ComboBoxModel komboBoxModel = 
							new DefaultComboBoxModel(
									new String[] { "Seviye 1","Seviye 2" });
					komboBox = new JComboBox();
					panel.add(komboBox);
					komboBox.setModel(komboBoxModel);
					komboBox.setBounds(83, 97, 111, 20);
				}
				{
					girisButonu = new JButton();
					panel.add(girisButonu);
					girisButonu.setText("Oyuna Başla");
					girisButonu.setBounds(200, 97, 92, 23);
				girisButonu.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						

							  JFrame pencere = new JFrame();
							//	pencere.getContentPane().add(new VarsayilanOyun());
								pencere.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
								pencere.pack();
						      pencere.setSize(700,540);
							pencere.setResizable(false);
							pencere.setVisible(true);
							pencere.addWindowListener(new WindowListener() {
								
								@Override
								public void windowOpened(WindowEvent e) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void windowIconified(WindowEvent e) {
									// TODO Auto-generated method stub
							
								}
								
								@Override
								public void windowDeiconified(WindowEvent e) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void windowDeactivated(WindowEvent e) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void windowClosing(WindowEvent e) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void windowClosed(WindowEvent e) {
									// TODO Auto-generated method stub
									setVisible(true);
								}
								
								@Override
								public void windowActivated(WindowEvent e) {
									// TODO Auto-generated method stub
								setVisible(false);
								}
							});
						   if(komboBox.getSelectedItem().toString().equalsIgnoreCase("Seviye 1")){
						oyun=new VarsayilanOyunFactory().oyunAc(komboBox.getSelectedItem().toString());
							oyun.setFocusable(true);
				
						}else if(komboBox.getSelectedItem().toString().equalsIgnoreCase("Seviye 2"))
						{
						 oyun=new Renkli2Toplu2CubukluOyunFactor().oyunAc(komboBox.getSelectedItem().toString());
					
							
						}
                                        pencere.setResizable(false);
					pencere.add(oyun);
					pencere.setVisible(true);
					oyun.setFocusable(true);
						
						
						
						
					}
				});
				}
				{
					oyunaHosgeldiniz = new JLabel();
					panel.add(oyunaHosgeldiniz);
					oyunaHosgeldiniz.setText("Oyuna Hoşgeldiniz");
					oyunaHosgeldiniz.setBounds(108, 41, 154, 45);
					oyunaHosgeldiniz.setFont(new java.awt.Font("Tahoma",0,18));
					oyunaHosgeldiniz.setForeground(new java.awt.Color(255,0,0));
				}
				{
					jLabel1 = new JLabel();
					panel.add(jLabel1);
					jLabel1.setText("Oyun Kontrolleri:");
					jLabel1.setBounds(10, 126, 87, 14);
				}
				{
					jLabel2 = new JLabel();
					panel.add(jLabel2);
					jLabel2.setText("Sol yön=4  Sağ yön:6");
					jLabel2.setBounds(200, 126, 133, 14);
				}
				{
					jLabel3 = new JLabel();
					panel.add(jLabel3);
					jLabel3.setText("Yukarı=8   Aşağı=2");
					jLabel3.setBounds(200, 146, 115, 14);
				}
				{
					jLabel4 = new JLabel();
					panel.add(jLabel4);
					jLabel4.setText("Cyan çubuk için:");
					jLabel4.setBounds(97, 126, 93, 14);
				}
				{
					jLabel5 = new JLabel();
					panel.add(jLabel5);
					jLabel5.setText("Siyah çubuk için:");
					jLabel5.setBounds(97, 165, 87, 14);
				}
				{
					jLabel6 = new JLabel();
					panel.add(jLabel6);
					jLabel6.setText("Yön tuşları");
					jLabel6.setBounds(200, 166, 133, 14);
				}
			}
			pack();
			this.setSize(395, 267);
			this.setVisible(false);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

 

}
