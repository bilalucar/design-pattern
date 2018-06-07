/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethodpong;

import java.io.IOException;

/**
 *
 * @author Yunus
 */
public class OyunFrame {


    public static void main(String[] args) throws IOException {
            
       
            OyunSecim frame = OyunSecim.getInstance();
            frame.setVisible(true);
    }

}