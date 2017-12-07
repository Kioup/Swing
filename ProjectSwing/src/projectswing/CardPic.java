
package projectswing;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardPic extends JPanel{
    
    private static final long serialVersionUID = 1L;
        
        Cards carte;
    
        public CardPic(Cards carte){
            this.carte = carte;
        }
        
        public void painComponent(Graphics g){
        try {
        Image img = ImageIO.read(new File(this.carte.image));
        g.drawImage(img, 0, 0, null);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
