
package prueba12;

import javax.swing.*;
import org.jvnet.substance.SubstanceLookAndFeel;
import interfaz.inicio;


public class Prueba12 {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.AutumnSkin");
     
       // UIManager.setLookAndFeel(new 
        //UpperEssentialLookAndFeel("D:\\Users\\Asus\\Desktop\\Lib UpperEssential\\Chocolate.theme")); //Personalizado.theme
        inicio inicio = new inicio(); 
        inicio.setVisible(true); 
        inicio.setLocationRelativeTo(null);
    }
}
