/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author asimsinanyuksel
 */
//Somut Kume
public class Takim implements Aggregate {

 private TakimUyesi[] uyeler;
 private int sonuncu;

 public Takim(int maksBoyut) {
  uyeler = new TakimUyesi[maksBoyut];
  this.sonuncu = 0;
 }
 
  public void takimUyesiEkle(TakimUyesi uye){
  this.uyeler[sonuncu]=uye;
  sonuncu++;
 }

 public int boyutDondur() {
  return uyeler.length;
 }

 public TakimUyesi takimUyesiGetir(int index) {
  return uyeler[index];
 }

 @Override
 public Iterator iterator() {
  return new TakimIterator(this);
 }
}
