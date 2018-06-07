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
import javax.swing.JOptionPane;
import malzemefactory.AbstractOyunParcaFactory;
import malzemeler.VarsayilanOyunCubugu;
import malzemeler.VarsayilanTop;
import malzemelerabstract.OyunCubugu;
import malzemelerabstract.Top;

public class VarsayilanOyun extends Oyun implements KeyListener{

	private static final long serialVersionUID = 1L;
AbstractOyunParcaFactory oyunParca;;

public VarsayilanOyun(AbstractOyunParcaFactory oyunParca) {
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
zamanlayici.schedule(gorev,0,5);



}
Top top=new VarsayilanTop();
OyunCubugu oyunCubugu=new VarsayilanOyunCubugu();
 int hareketYonuYukariSolCapraz=0;
 int hareketYonuYukariSagCapraz=0;
 int hareketYonuSolCapraz=0;
 int hareketYonuSagCapraz=1;
Rectangle kare=new Rectangle();
int cubukX=280;
int cubukY=480;
int topX=0;
 int topY=0;
 private void hareketEt(int topX2,int topY2){
	if(hareketYonuSagCapraz==1)
	{
	topX=topX2+=1;
	topY=topY2+=1;
	
	}else if(hareketYonuSolCapraz==1)
{   topX= topX2-=1;
    topY=topY2+=1;}
	else if(hareketYonuYukariSagCapraz==1)
	{  topX= topX2+=1;
	   topY=topY2-=1;}
	else if(hareketYonuYukariSolCapraz==1)
	{  topX= topX2-=1;
	   topY=topY2-=1;
	}
	
	if(topX2==0 || topX2==660){
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
			}	if(topY2==0){
				if(hareketYonuYukariSolCapraz==1)
						{hareketYonuYukariSolCapraz=0;
						hareketYonuSolCapraz=1;
						}else if(hareketYonuYukariSagCapraz==1)
						{hareketYonuYukariSagCapraz=0;
						hareketYonuSagCapraz=1;
							
						}
					}
	
	
}
 private void topCubugaCarptiMi(int topX2,int topY2){
	if(kare.intersects(new Rectangle(topX2,topY2,25,25))){
		if (hareketYonuSagCapraz==1){
			hareketYonuYukariSagCapraz=1;
			hareketYonuSagCapraz=0;
		}else if(hareketYonuSolCapraz==1)
		{hareketYonuSolCapraz=0;
		hareketYonuYukariSolCapraz=1;
	
		   }
		}
	
}
 
@Override
public void paint(Graphics g) {
	// TODO Auto-generated method stub
	super.paint(g);
	hareketEt(topX, topY);
	Graphics2D grafik=(Graphics2D)g;
	oyunParca.topCiz(grafik, topX, topY,null,null,top,null);
	oyunParca.oyunCubuguCiz(grafik, kare,null,cubukX, cubukY,null,null,oyunCubugu,oyunCubugu);
    topCubugaCarptiMi(topX, topY);
		
		if(topY==500)
		{		JOptionPane.showMessageDialog(null, "Oyun bitti");
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
		}
		else
			System.exit(0);
		}
//grafik.dispose();
Toolkit.getDefaultToolkit().sync();
}



private void initGUI() {
	
	try {
		//this.setPreferredSize(new java.awt.Dimension(700, 530));
		this.setBounds(0,0,700,530);
		
		this.setLayout(null);
		this.setFocusable(true);
		this.setEnabled(true);
		setBackground(Color.white);
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

	if(e.getKeyCode()==KeyEvent.VK_LEFT){
		if(cubukX==0)
			cubukX=0;
			else
		cubukX-=10;
	
		}
		
	else if (e.getKeyCode()==KeyEvent.VK_RIGHT) 
		{
		if(cubukX==580)
			cubukX=580;
		else
		cubukX+=10;
		
		}
	else if (e.getKeyCode()==KeyEvent.VK_UP) 
	{
	if(cubukY==0)
		cubukY=0;
	else
	cubukY-=10;
	
	}
	else if (e.getKeyCode()==KeyEvent.VK_DOWN) 
	{
	if(cubukY==480)
		cubukY=480;
	else
	cubukY+=10;
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
