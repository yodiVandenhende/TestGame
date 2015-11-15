import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by yodi on 12-11-2015.
 */
public class game extends JFrame implements ActionListener {
    private Board board;
    private Timer timer;

    private final int DELAY = 25;

    public game(){
        iniUi();
    }


    private void iniUi(){
        board = new Board();
        add(board);

        pack();

        setTitle("PuzzelBubble");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,1000);
        setLocationRelativeTo(null);
        setResizable(false);

        timer = new Timer(DELAY, this);
        timer.start();
    }
    public static void main(String[] args) {


  EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
          game ex = new game();
          ex.setVisible(true);

      }
  });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        board.Repaint();
    }
}