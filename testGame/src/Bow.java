import sun.plugin.javascript.navig.ImageArray;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gebruiker on 13/11/2015.
 */
public class Bow {
    private int x;
    private int y;
    private double arc;
    private Image image;
    private Bubble toShoot;

    public Bow()
    {
        this.x = 100;
        this.y = 830;
        toShoot = new Bubble(x+125,y+80,1);
        loadImage();
    }

    private void loadImage() {
        ImageIcon ii =  new ImageIcon("sprite/bow.png");
        image = ii.getImage();
    }


    public int GetX()
    {
        return  x;
    }
    public int GetY()
    {
        return y;
    }
    public void Draw(Graphics g){
        g.drawImage(image,x,y, null);
        toShoot.Draw(g);
    }


}
