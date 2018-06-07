/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author asimsinanyuksel
 */
//Somut Tekrarlayici
public class TakimIterator implements Iterator {

 private Takim takim;
 private int indis;

 public TakimIterator(Takim takim) {
  this.takim = takim;
  this.indis = 0;
 }

 @Override
 public boolean hasNext() {

  if (indis >= 0 && indis < takim.boyutDondur())
   return true;
  return false;
 }

 @Override
 public Object next() {
  TakimUyesi uye = takim.takimUyesiGetir(indis);
  indis++;
  return uye;
 }

}