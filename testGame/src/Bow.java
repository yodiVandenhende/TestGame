import sun.plugin.javascript.navig.ImageArray;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Gebruiker on 13/11/2015.
 */
public class Bow {
    private int x;
    private int y;
    private int arc;
    private int turnSpeed;
    private Image image;
    private Bubble toShoot;
    private AffineTransform trans;

    public Bow()
    {
        this.x = 100;
        this.y = 830;
        this.arc = 0;
        this.turnSpeed = 1;
        toShoot = new Bubble(x+125,y+80,1);
        loadImage();
        trans = new AffineTransform();
        setTrans();
    }

    private void loadImage() {
        ImageIcon ii =  new ImageIcon("sprite/bow.png");
        image = ii.getImage();
    }

    private void setTrans()
    {
        trans.translate(x,y);
        trans.rotate(Math.toRadians(arc),150,85);
    }

    public void TurnLeft()
    {
        arc -= turnSpeed;
        setTrans();
    }
    public void TurnRight()
    {
        arc += turnSpeed;
        setTrans();
    }

    public void Draw(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image,trans, null);
        toShoot.Draw(g);
    }


}
