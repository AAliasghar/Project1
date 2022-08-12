import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        WelcomeScreen welcomeScreen = new WelcomeScreen();
        welcomeScreen.welcomeMassage();
        Options options = new Options();
        options.option();


    }
}