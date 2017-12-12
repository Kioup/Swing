
package projectswing;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ProjectSwing {

    public static void main(String[] args) {
        
        Cards Blue = new Cards(20, "Eau", "C:/Users/licence/Documents/Java2017/SwingTestHome/Swing/fondConnectMobile.png");
        Fenetre fen = new Fenetre();
        Icon img = new ImageIcon(Blue.image);
        JLabel Lab = new JLabel(img);
        CardPic cp = new CardPic(Blue);
        fen.add(cp);
        fen.setVisible(true);
        fen.repaint();

    }
    
}
