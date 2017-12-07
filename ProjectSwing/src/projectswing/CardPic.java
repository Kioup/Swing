
package projectswing;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class CardPic extends JFrame{
        
        Cards carte;
    
        public CardPic(Cards carte){
            this.carte = carte;
        }
        
        public void afficheCard(Graphics g){
        try {
        Image img = ImageIO.read(new File(this.carte.image));
        g.drawImage(img, 0, 0, this);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
