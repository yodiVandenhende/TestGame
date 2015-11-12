import javax.swing.*;
import java.awt.*;

/**
 * Created by yodi on 12-11-2015.
 */
public class Application extends JFrame  {
    public Application(){
        iniUi();
    }
    private void iniUi(){
        add(new Board());
        pack();
        setTitle("bubble");
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
