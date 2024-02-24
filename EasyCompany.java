import javax.swing.*;
import java.awt.*;

public class EasyCompany {

    private JFrame mainFrame;

    public EasyCompany() {
        mainFrame = createMainFrame();
        mainFrame.setVisible(true);
    }

    private JFrame createMainFrame() {
        JFrame frame = new JFrame("EasyCompany");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello, EasyCompany Widescreen");
        frame.getContentPane().add(label);

        frame.setLayout(new FlowLayout(FlowLayout.CENTER));

        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
        int targetWidth = (screenHeight * 16) / 9;

        frame.setSize(targetWidth, screenHeight);
        frame.setLocation((screenWidth - targetWidth) / 2, 0);

        return frame;
    }

    public void showMainFrame() {
        mainFrame.setVisible(true);
    }
}
