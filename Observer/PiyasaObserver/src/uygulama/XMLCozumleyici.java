package uygulama;

import java.io.InputStreamReader;
import java.net.URL;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
 
public class XMLCozumleyici extends DefaultHandler{

    private String[] aciklamalar = new String[10];
    private double[] sonDurumlar = new double[10];
    private double[] degisimler = new double[10];
    private int i, j, k;
    private boolean desc = false;
    private boolean last = false;
    private boolean pernc = false;
    private StringBuilder okunan;
    
    public XMLCozumleyici(){
        try {        
            URL url = new URL("http://realtime.paragaranti.com/asp/xml/icpiyasaX.xml");
            XMLReader xr = SAXParserFactory.newInstance().newSAXParser().getXMLReader();  
            xr.setContentHandler(this);
            xr.parse(new InputSource(new InputStreamReader(url.openStream(), "UTF-8")));
        } catch (Exception e) { }
    }

    public void startElement(String uri, String localName,String qName, Attributes attributes) throws SAXException {
        okunan = new StringBuilder();
        if (qName.equalsIgnoreCase("DESC")) {
            desc = true;
        }

        if (qName.equalsIgnoreCase("LAST")) {
            last = true;
        }

        if (qName.equalsIgnoreCase("PERNC_NUMBER")) {
            pernc = true;
        }
    }

    public void characters(char ch[], int start, int length) throws SAXException {
        okunan.append(ch,start,length);
    }
    
    public void endElement(String uri, String localName, String qName) throws SAXException {
        String veri = okunan.toString();
        
        if (desc) {
            aciklamalar[i++] = veri;
            desc = false;
        }

        if (last) {
            String noktaliİfade = veri.replace(',', '.'); // Virgülle yazıldıysa
            sonDurumlar[j++] = Double.parseDouble(noktaliİfade);
            last = false;
        }

        if (pernc) {
            degisimler[k++] = Double.parseDouble(veri);
            pernc = false;
        }
        
    }

    public String[] getAciklamalar() {
        return aciklamalar;
    }

    public double[] getSonDurumlar() {
        return sonDurumlar;
    }

    public double[] getDegisimler() {
        return degisimler;
    }
    
}