import sun.plugin.javascript.navig.ImageArray;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * Created by Gebruiker on 13/11/2015.
 */
public class Bow {
    private int x;
    private int y;
    private int arc;
    private int turnSpeed;
    private int shootSpeed;
    private Image image;
    private Bubble toShoot;
    private AffineTransform trans;
    private Random rand =  new Random();

    public Bow()
    {
        this.x = 168;
        this.y = 700;
        this.arc = -90;
        this.turnSpeed = 2;
        this.shootSpeed = 20;
        toShoot = new Bubble(x+60,y+125,1);
        loadImage();
        trans = new AffineTransform();
        setTrans();
    }

    private void loadImage() {
        ImageIcon ii =  new ImageIcon("sprite/bow2.png");
        image = ii.getImage();
    }

    private void setTrans()
    {
        trans.translate(x,y);
        rotate(arc);
    }

    private void rotate(int toTurn)
    {
        trans.rotate(Math.toRadians(toTurn),85,150);
    }

    public Bubble Shoot()
    {
        Bubble res =  toShoot;
        res.shoot(arc,shootSpeed);
        reload();
        return res;
    }
    private void reload()
    {
        toShoot =  new Bubble(x+60,y+125,rand.nextInt(6)+1);
    }

    public void TurnLeft()
    {
        arc -= turnSpeed;
        rotate(turnSpeed*-1);
    }
    public void TurnRight()
    {
        arc += turnSpeed;
        rotate(turnSpeed);
    }

    public void Draw(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image,trans, null);
        toShoot.Draw(g);

    }


}
