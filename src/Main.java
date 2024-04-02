import java.awt.*;



public class Main {

    private static int gameState;
    private static boolean gameRunning = true;
    public static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public static int halfScreenWidth = screenSize.width / 2;
    public static int halfScreenHeight = screenSize.height / 2;

    public static void main(String ar[]) {
        gameState = 0;
        gameManager();



    }


    //Master method to change screens based on gameState.
    public static void gameManager(){
        if (gameRunning){
            if(gameState == -1){
                System.exit(0);
            }
            if (gameState == 0){
                new IntroScreen();
            }
        }
    }

    public static int getGameState(){
        return gameState;
    }
    public static void setGameState(int value){
        gameState = value;
    }

    public static boolean getGameRunning(){
        return gameRunning;
    }
    public static void setGameRunning(boolean value){
        gameRunning = value;
    }

}