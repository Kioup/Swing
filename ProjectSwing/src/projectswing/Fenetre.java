
package projectswing;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.imageio.ImageIO;

public class Fenetre extends JFrame {
    
    public Fenetre(Cards carte){
        this.setTitle("Fenetre Java");
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(new CardPic(carte));
        this.setVisible(true);
    }  
    
}
