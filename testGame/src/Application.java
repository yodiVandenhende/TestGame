import javax.swing.*;
import java.awt.*;

/**
 * Created by yodi on 12-11-2015.
 */
public class Application extends JFrame{
    public Application(){
     initUI();
    }
    private void initUI(){
        add(new Board());
        pack();
        setTitle("Bardejov");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Application ex = new Application();
                ex.setVisible(true);
            }
        });
    }

}
