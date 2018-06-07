/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author asimsinanyuksel
 */
public class IteratorTest{

 public static void main(String[] args) {
  Takim takim = new Takim(5);
  takim.takimUyesiEkle(new TakimUyesi("Ali", 30));
  takim.takimUyesiEkle(new TakimUyesi("Veli", 29));
  takim.takimUyesiEkle(new TakimUyesi("Selami", 25));
  takim.takimUyesiEkle(new TakimUyesi("Ayşe", 24));
  takim.takimUyesiEkle(new TakimUyesi("Fatma", 40));

  Iterator it = takim.iterator();
  while (it.hasNext()) {
   TakimUyesi uye= (TakimUyesi) it.next();
   System.out.println(uye.getIsim() + "'nin yaşı " + uye.getYas());
  }

 }

}