import javax.swing.*;
import java.awt.*;

public class MainContent extends JPanel {
    private JLabel title;
    private JLabel description;
    private JTextField input;


    public static final int TITLE_X = 0;
    public static final int TITLE_Y = 40;
    public static final int TITLE_WIDTH = 400;
    public static final int TITLE_HEIGHT = 200;
    public static final int TITLE_FONT_SIZE = 100;

    public static final int DESCRIPTION_X = 0;
    public static final int DESCRIPTION_Y = 200;
    public static final int DESCRIPTION_WIDTH = 400;
    public static final int DESCRIPTION_HEIGHT = 100;
    public static final int DESCRIPTION_FONT_SIZE = 50;

    public static final int INPUT_X = 350;
    public static final int INPUT_Y = 500;
    public static final int INPUT_WIDTH = 150;
    public static final int INPUT_HEIGHT = 100;



    public MainContent(int width, int height) {
        this.setBounds(0,0, width, height);
        this.setDoubleBuffered(true);
        this.setBackground(Color.GRAY);


        this.title = new JLabel("IP Locator");
        this.title.setBounds(TITLE_X, TITLE_Y, TITLE_WIDTH, TITLE_HEIGHT);
        Font titleFont = new Font("font", Font.ITALIC, TITLE_FONT_SIZE);
        this.title.setFont(titleFont);
        this.add(title);

        this.description = new JLabel("Enter the IP you want to Locate:");
        this.description.setBounds(DESCRIPTION_X, DESCRIPTION_Y, DESCRIPTION_WIDTH, DESCRIPTION_HEIGHT);
        Font descriptionFont = new Font("desFont", Font.ITALIC, DESCRIPTION_FONT_SIZE);
        this.description.setFont(descriptionFont);
        this.add(description);

        this.input = new JTextField();
        input.setBounds(INPUT_X, INPUT_Y, INPUT_WIDTH, INPUT_HEIGHT);
        this.add(input);
        this.setVisible(true);




    }
}
