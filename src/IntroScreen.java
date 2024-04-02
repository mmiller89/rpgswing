import javax.swing.*;
import java.awt.*;

public class IntroScreen {

    public IntroScreen() {
        //Initialization of screen

        JFrame f = new JFrame("My Adventure");


        //The start screen with text/buttons. Will be moved to a separate file and called when needed.
        JButton start = new JButton();
        start.setText("Start Game");
        start.setBounds(Main.halfScreenWidth, Main.halfScreenHeight - 150, 120, 50);
        start.addActionListener(e -> this.startGame());

        JButton load = new JButton();
        load.setText("Load Game");
        load.setBounds(Main.halfScreenWidth, Main.halfScreenHeight - 75, 120, 50);
        load.addActionListener(e -> this.loadGame());

        JButton exit = new JButton();

        exit.setText("Exit Game");
        exit.setBounds(Main.halfScreenWidth, Main.halfScreenHeight, 120, 50);
        exit.addActionListener(e -> this.endGame());

        JLabel l1 = new JLabel();
        l1.setText("<html><h1>Adventure Game</h1></html>");

        l1.setBounds(Main.halfScreenWidth - 40, 50, 250, 80);


        f.add(l1);
        f.add(start);
        f.add(load);
        f.add(exit);

        //The start screen with text/buttons. Will be moved to a separate file and called when needed.

        f.setSize(Main.screenSize.width, Main.screenSize.height);
        f.setLayout(null);
        f.setVisible(true);

    }

    public void startGame(){
        System.out.println("Game started!");
    }
    public void loadGame(){
        System.out.println("Game loaded!");
    }
    public void endGame(){
        System.out.println("Game ended!");
        Main.setGameState(-1);
        Main.gameManager();
    }
}
