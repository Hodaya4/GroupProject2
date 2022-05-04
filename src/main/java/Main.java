import javax.swing.*;

public class Main extends JFrame {
    private static final int WINDOW_WIDTH = 1000;
    private static final int WINDOW_HEIGHT = 800;


    public Main() {
        this.setVisible(true);
        this.setVisible(true);
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);

        MainContent mainContent = new MainContent(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.add(mainContent);

    }


    public static void main(String[] args) {
        Main main = new Main();
    }
}
