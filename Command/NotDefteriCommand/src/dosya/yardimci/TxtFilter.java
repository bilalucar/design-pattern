package dosya.yardimci;

import java.io.File;
import javax.swing.filechooser.FileFilter;

public class TxtFilter extends FileFilter {
    
    // Kaynak: http://stackoverflow.com/questions/8713968/add-txt-extension-in-jfilechooser
    
    @Override
    public boolean accept(File f){
        return f.getName().toLowerCase().endsWith(".txt") || f.isDirectory();
    }
    
    @Override
    public String getDescription(){
        return "Text files (*.txt)";
    }

}