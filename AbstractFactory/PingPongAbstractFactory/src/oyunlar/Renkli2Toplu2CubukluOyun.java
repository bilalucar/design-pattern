package oyunlar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javax.swing.JOptionPane;

import malzemefactory.AbstractOyunParcaFactory;
import malzemefactory.VarsayilanOyunParcaFactory;
import malzemeler.RenkliBuyukTop;
import malzemeler.RenkliOyunCubugu;
import malzemeler.VarsayilanOyunCubugu;
import malzemeler.VarsayilanTop;
import malzemelerabstract.Top;
import malzemelerabstract.OyunCubugu;


public class Renkli2Toplu2CubukluOyun extends Oyun implements KeyListener{
	Timer zamanlayici=new Timer();
	TimerTask gorev;
AbstractOyunParcaFactory oyunParca;
public Renkli2Toplu2CubukluOyun(AbstractOyunParcaFactory oyunParca) {
	// TODO Auto-generated constructor stub
	super();
	this.oyunParca=oyunParca;
initGUI();
Timer zamanlayici=new Timer();
TimerTask gorev=new TimerTask() {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		repaint();
		
	
	}
};
zamanlayici.schedule(gorev,0,7);



}




private JLabel resim;
RenkliBuyukTop top=new RenkliBuyukTop();
RenkliOyunCubugu oyunCubugu=new RenkliOyunCubugu();

int hareketYonuYukariSolCapraz=0;
int hareketYonuYukariSagCapraz=0;
int hareketYonuSolCapraz=0;
int hareketYonuSagCapraz=1;
Rectangle kare=new Rectangle();
int cubukX=280;
int cubukY=480;
int topX=0;
int topY=0;
Top varsayilanTop=new VarsayilanTop();
OyunCubugu varsayilanOyunCubugu=new VarsayilanOyunCubugu();
int hareketYonuYukariSolCapraz2=0;
int hareketYonuYukariSagCapraz2=0;
int hareketYonuSolCapraz2=1;
int hareketYonuSagCapraz2=0;
Rectangle kare2=new Rectangle();
int cubukX2=80;
int cubukY2=480;
int topX2=300;
int topY2=0;
@Override
public void paint(Graphics g) {
	// TODO Auto-generated method stub
	super.paint(g);
	if(hareketYonuSagCapraz==1)
	{
	topX+=1;
	topY+=1;
	
	}else if(hareketYonuSolCapraz==1)
{   topX-=1;
	topY+=1;}
	else if(hareketYonuYukariSagCapraz==1)
	{   topX+=1;
	topY-=1;}
	else if(hareketYonuYukariSolCapraz==1)
	{   topX-=1;
	 topY-=1;}
	if(hareketYonuSagCapraz2==1)
	{
	topX2+=1;
	topY2+=1;
	
	}else if(hareketYonuSolCapraz2==1)
{  
		topX2-=1;
	topY2+=1;}
	else if(hareketYonuYukariSagCapraz2==1)
	{   topX2+=1;
	topY2-=1;}
	else if(hareketYonuYukariSolCapraz2==1)
	{   topX2-=1;
	 topY2-=1;
	 }
	Graphics2D grafik=(Graphics2D)g;
	
    oyunParca.topCiz(grafik, topX, topY,topX2, topY2,top,varsayilanTop);
oyunParca.oyunCubuguCiz(grafik, kare,kare2, cubukX, cubukY,cubukX2, cubukY2,oyunCubugu,varsayilanOyunCubugu);
	if(topX==0 || topX==660){
	if (hareketYonuSagCapraz==1){
		hareketYonuSagCapraz=0;
		hareketYonuSolCapraz=1;
		}else if(hareketYonuYukariSolCapraz==1)
			{hareketYonuYukariSolCapraz=0;
			hareketYonuYukariSagCapraz=1;
				
			}else if(hareketYonuYukariSagCapraz==1)
			{hareketYonuYukariSagCapraz=0;
			hareketYonuYukariSolCapraz=1;
				
			}else if(hareketYonuSolCapraz==1)
			{hareketYonuSolCapraz=0;
		hareketYonuSagCapraz=1;
				
			}else if(hareketYonuSagCapraz==1)
			{hareketYonuSagCapraz=0;
		hareketYonuSolCapraz=1;
				
			}
		}	if(topY==0){
			if(hareketYonuYukariSolCapraz==1)
					{hareketYonuYukariSolCapraz=0;
					hareketYonuSolCapraz=1;
					}else if(hareketYonuYukariSagCapraz==1)
					{hareketYonuYukariSagCapraz=0;
					hareketYonuSagCapraz=1;
						
					}
				}
		if(topX2==0 || topX2==660){
			if (hareketYonuSagCapraz2==1){
				hareketYonuSagCapraz2=0;
				hareketYonuSolCapraz2=1;
				}else if(hareketYonuYukariSolCapraz2==1)
					{hareketYonuYukariSolCapraz2=0;
					hareketYonuYukariSagCapraz2=1;
						
					}else if(hareketYonuYukariSagCapraz2==1)
					{hareketYonuYukariSagCapraz2=0;
					hareketYonuYukariSolCapraz2=1;
						
					}else if(hareketYonuSolCapraz2==1)
					{hareketYonuSolCapraz2=0;
				hareketYonuSagCapraz2=1;
						
					}else if(hareketYonuSagCapraz2==1)
					{hareketYonuSagCapraz2=0;
				hareketYonuSolCapraz2=1;
						
					}
				}	if(topY2==0){
					if(hareketYonuYukariSolCapraz2==1)
							{hareketYonuYukariSolCapraz2=0;
							hareketYonuSolCapraz2=1;
							}else if(hareketYonuYukariSagCapraz2==1)
							{hareketYonuYukariSagCapraz2=0;
							hareketYonuSagCapraz2=1;
								
							}
						}
		if(kare.intersects(new Rectangle(topX,topY,25,25))){
			if (hareketYonuSagCapraz==1){
				hareketYonuYukariSagCapraz=1;
				hareketYonuSagCapraz=0;
			}else if(hareketYonuSolCapraz==1)
			{hareketYonuSolCapraz=0;
			hareketYonuYukariSolCapraz=1;
		
			   }
			}
		if(kare2.intersects(new Rectangle(topX,topY,25,25))){
			if (hareketYonuSagCapraz==1){
				hareketYonuYukariSagCapraz=1;
				hareketYonuSagCapraz=0;
			}else if(hareketYonuSolCapraz==1)
			{hareketYonuSolCapraz=0;
			hareketYonuYukariSolCapraz=1;
		
			   }
			}
		if(kare2.intersects(new Rectangle(topX2,topY2,25,25))){
			if (hareketYonuSagCapraz2==1){
				hareketYonuYukariSagCapraz2=1;
				hareketYonuSagCapraz2=0;
			}else if(hareketYonuSolCapraz2==1)
			{hareketYonuSolCapraz2=0;
			hareketYonuYukariSolCapraz2=1;
		
			   }
			}
		if(kare.intersects(new Rectangle(topX2,topY2,25,25))){
			if (hareketYonuSagCapraz2==1){
				hareketYonuYukariSagCapraz2=1;
				hareketYonuSagCapraz2=0;
			}else if(hareketYonuSolCapraz2==1)
			{hareketYonuSolCapraz2=0;
			hareketYonuYukariSolCapraz2=1;
		
			   }
			}
		/////////
		if(topY==500)
		{		

			
			JOptionPane.showMessageDialog(null, "Kırmızı topu oyunda tutamadığınız için Oyun bitti");
int sonuc=JOptionPane.showConfirmDialog(null, "Oyunu tekrar oynamak istiyormusunuz.", "Oyunu tekrar oyna", JOptionPane.YES_NO_OPTION);
		if(sonuc==0){
		topX=0;
		topY=0;
		 hareketYonuYukariSolCapraz=0;
		 hareketYonuYukariSagCapraz=0;
		hareketYonuSolCapraz=0;
		  hareketYonuSagCapraz=1;
		  cubukX=280;
		  cubukY=480;
		  topX2=300;
			topY2=0;
			 hareketYonuYukariSolCapraz2=0;
			 hareketYonuYukariSagCapraz2=0;
			hareketYonuSolCapraz2=1;
			  hareketYonuSagCapraz2=0;
			  cubukX2=80;
			  cubukY2=480;
			 
		}
		else
			System.exit(0);
		}



	
/////////
grafik.dispose();
Toolkit.getDefaultToolkit().sync();
}
public Renkli2Toplu2CubukluOyun() {
	super();
	initGUI();

	gorev=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			repaint();
			
		
		}
	};
zamanlayici.schedule(gorev,0,7);



}

private void initGUI() {
	
	try {
		this.setPreferredSize(new java.awt.Dimension(700, 530));
		this.setLayout(null);
		setFocusable(true);
		setBackground(Color.white);
	ImageIcon icon=new ImageIcon("d://manzara.jpg");
			resim = new JLabel(icon);
			this.add(resim);
			resim.setBounds(0, 0, 700, 530);
		addKeyListener(this);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}
public static int[] sayiOlustur(int kactanBaslasin,int hangiSayiyaKadar,int kacTaneSayiOlussun){
	Random rnd=new Random();
		String sayilar="";
		int sayi;
		int sayac=1;
		sayilar=sayilar+(rnd.nextInt(hangiSayiyaKadar-kactanBaslasin)+kactanBaslasin);
		while(sayac<kacTaneSayiOlussun){
			sayi=rnd.nextInt(hangiSayiyaKadar-kactanBaslasin)+kactanBaslasin;
			if(sayilar.indexOf(String.valueOf(sayi))==-1){
				sayilar=sayilar+","+sayi;
				sayac++;
				
			}else{
				sayi=rnd.nextInt(hangiSayiyaKadar-kactanBaslasin)+kactanBaslasin;
				while(sayilar.indexOf(String.valueOf(sayi))>=0){
					sayi=rnd.nextInt(hangiSayiyaKadar-kactanBaslasin)+kactanBaslasin;
			}
				sayilar=sayilar+","+sayi;
				sayac++;
			}
			
		}
		String sayilarDizisi[]=sayilar.split(",");
		int dizi[] =new int[sayilarDizisi.length];
		for(int i=0;i<sayilarDizisi.length;i++){
			dizi[i]=Integer.parseInt(sayilarDizisi[i]);
			
		}
		return dizi;
	}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub


	if(e.getKeyChar()==KeyEvent.VK_4){
		if(cubukX==0)
			cubukX=0;
			else
		cubukX-=10;
	
		}
		
	else if (e.getKeyChar()==KeyEvent.VK_6) 
		{
		if(cubukX==580)
			cubukX=580;
		else
		cubukX+=10;
		
		}
	else if (e.getKeyChar()==KeyEvent.VK_8) 
	{
	if(cubukY==0)
		cubukY=0;
	else
	cubukY-=10;
	
	}
	else if (e.getKeyChar()==KeyEvent.VK_2) 
	{
	if(cubukY==480)
		cubukY=480;
	else
	cubukY+=10;
	}
	
	////////////
	if(e.getKeyCode()==KeyEvent.VK_LEFT){
		if(cubukX2==0)
			cubukX2=0;
			else
		cubukX2-=10;
	
		}
		
	else if (e.getKeyCode()==KeyEvent.VK_RIGHT) 
		{
		if(cubukX2==580)
			cubukX2=580;
		else
		cubukX2+=10;
		
		}
	else if (e.getKeyCode()==KeyEvent.VK_UP) 
	{
	if(cubukY2==0)
		cubukY2=0;
	else
	cubukY2-=10;
	
	}
	else if (e.getKeyCode()==KeyEvent.VK_DOWN) 
	{
	if(cubukY2==480)
		cubukY2=480;
	else
	cubukY2+=10;
	}
	
	
}
@Override
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}



}
