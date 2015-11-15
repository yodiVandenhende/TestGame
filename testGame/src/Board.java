import javax.security.auth.login.CredentialException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.*;
import java.util.List;

/**
 * Created by yodi on 12-11-2015.
 */
public class Board extends JPanel{
    private List<Bubble> bubbleInField;
    private Bow bow;

    private Bubble testBubble = new Bubble(225,500,3);

    public Board(){
        bubbleInField =  new ArrayList<Bubble>();
        //CreatField();
        bow = new Bow();
        testBubble.shoot(90,5);

        setDoubleBuffered(true);

    }
    private void CreatField()
    {
        bubbleInField.add(new Bubble(0,0,1));
        bubbleInField.add(new Bubble(50,0,2));
        bubbleInField.add(new Bubble(100,0,3));
        bubbleInField.add(new Bubble(150,0,4));
        bubbleInField.add(new Bubble(25,50,5));
        bubbleInField.add(new Bubble(75,50,6));
    }

    public void keyPressed(KeyEvent e)
    {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_LEFT)
        {
            bow.TurnLeft();
        }
        if(key == KeyEvent.VK_RIGHT)
        {
            bow.TurnRight();
        }
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Draw(g);
    }

    public void Draw(Graphics g)
    {
        for (Bubble bubble: bubbleInField){
            bubble.Draw(g);
        }
        bow.Draw(g);

        testBubble.Draw(g);
    }
    public void Repaint()
    {
        repaint();
    }
}