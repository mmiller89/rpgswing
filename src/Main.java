import javax.swing.*;
import java.awt.*;



public class Main {


    public static class primaryWindow{
        public primaryWindow()
        {
            //Initialization of screen
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int halfScreenWidth = screenSize.width / 2;
            int halfScreenHeight = screenSize.height / 2;
            Frame f = new Frame("My Adventure");


            //The start screen with text/buttons. Will be moved to a separate file and called when needed.
            JButton start = new JButton();
            start.setText("Start Game");
            start.setBounds(halfScreenWidth, halfScreenHeight - 150, 120, 50);

            JButton load = new JButton();
            load.setText("Load Game");
            load.setBounds(halfScreenWidth, halfScreenHeight - 75, 120, 50);

            JButton exit = new JButton();
            exit.setText("Exit Game");
            exit.setBounds(halfScreenWidth, halfScreenHeight, 120, 50);

            JLabel l1 = new JLabel();
            l1.setText("<html><h1>Adventure Game</h1></html>");

            l1.setBounds(halfScreenWidth - 40, 50, 250, 80);



            f.add(l1);
            f.add(start);
            f.add(load);
            f.add(exit);

            //The start screen with text/buttons. Will be moved to a separate file and called when needed.

            f.setSize(screenSize.width, screenSize.height);
            f.setLayout(null);
            f.setVisible(true);

        }
    }


    public static void main(String ar[]) {
        new primaryWindow();

    }
}