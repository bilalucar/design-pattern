package pideler;

import pidefactory.TokatPideFactory;
import pidefactory.IspartaPideFactory;
import pidefactory.AbstractPideFactory;

public class PideciTest {

    public static void main(String[] args) {
        AbstractPideFactory ispartaPide = new IspartaPideFactory();
        AbstractPideFactory tokatPide = new TokatPideFactory();

        Pide pide = ispartaPide.siparisVer("kasarli");
        System.out.println(pide + "\n");

        pide = ispartaPide.siparisVer("kiymali");
        System.out.println(pide + "\n");

        pide = tokatPide.siparisVer("sucuklu");
        System.out.println(pide + "\n");

        pide = tokatPide.siparisVer("cokelekli");
        System.out.println(pide + "\n");



    }
}
