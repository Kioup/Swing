
package projectswing;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ProjectSwing {

    public static void main(String[] args) {
        
        Cards Blue = new Cards(20, "Eau", "fondConnectMobile.png");
        Fenetre fen = new Fenetre();
        Icon img = new ImageIcon(Blue.image);
        JLabel Lab = new JLabel();
        fen.add(Lab);
        fen.setVisible(true);
        

    }
    
}
