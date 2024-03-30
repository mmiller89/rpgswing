import java.awt.*;

// Driver Class
public class Main {


    public static class primaryWindow{
        public primaryWindow()
        {
            // Frame Created
            Frame f = new Frame();

            Label l1 = new Label("Adventure RPG");

            l1.setBounds(250, 150, 120, 80);
            f.add(l1);

            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

            f.setSize(screenSize.width / 2, screenSize.height / 2);
            f.setLayout(null);
            f.setVisible(true);
        }
    }


    public static void main(String ar[]) {
        new primaryWindow();

    }
}