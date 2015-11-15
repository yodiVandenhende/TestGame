import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by Gebruiker on 13/11/2015.
 */
public class Bubble {
    private Image image;
    private int x;
    private int y;
    private double xSpeed = 0;
    private double ySpeed = 0;
    private int color;

    public Bubble(int x, int y ,int color)
    {
        this.x = x;
        this.y = y;
        this.color = color;
        loadImage();
    }

    private void loadImage()
    {
        String path =  "sprite/bubble_" + color + ".png";
        ImageIcon ii = new ImageIcon(path);
        image = ii.getImage();
    }

    public void Draw(Graphics g)
    {
        Move();
        g.drawImage(image,x,y, null);
    }

    public void shoot(double arc,int speed)
    {
        ySpeed = Math.sin(arc) * speed;
        xSpeed = Math.cos(arc) * speed;
    }

    private void Move()
    {
        x =  x  + (int) xSpeed;
        y = y + (int) ySpeed;
    }

    public int GetX()
    {
        return x;
    }
    public int GetY()
    {
        return y;
    }


}
