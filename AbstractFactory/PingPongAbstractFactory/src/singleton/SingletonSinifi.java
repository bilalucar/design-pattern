package singleton;

import javax.swing.JFrame;


public class SingletonSinifi
{
 public static SingletonSinifi singletonNesnesi=null;
 
   
    private SingletonSinifi()
    {
       
    } 
 public static void oyna(){
	 OyunBaslaEkrani oyunaBasla=new OyunBaslaEkrani();
oyunaBasla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
oyunaBasla.setVisible(true);
 }
    public static SingletonSinifi getInstance()
    {
        
        if(singletonNesnesi == null)
        {
            singletonNesnesi = new SingletonSinifi();
        }
        return singletonNesnesi;
    } 
 
} 