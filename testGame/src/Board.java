import javax.swing.*;
import java.awt.*;

/**
 * Created by yodi on 12-11-2015.
 */
public class Board extends JPanel {
    private Image bubble;

    public Board(){
        initBoard();
    }
    private void initBoard(){
        loadImage();

        int w= bubble.getWidth(this);
        int h = bubble.getHeight(this);
        setPreferredSize(new Dimension(w,h));
    }
    private void loadImage(){
        ImageIcon ii = new ImageIcon("bubble_green.png");
        bubble  =  ii.getImage();
    }
    @Override
    public void paintComponent(Graphics g) {

        g.drawImage(bubble, 0, 0, null);
    }
}
