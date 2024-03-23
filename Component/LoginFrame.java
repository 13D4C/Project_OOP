import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {

    private EasyCompany easyCompany;

    public LoginFrame() {
        super("Login Page");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        JTextField usernameField = new JTextField(20);
        JPasswordField passwordField = new JPasswordField(20);
        JButton loginButton = new JButton("Login");

        setLayout(new FlowLayout(FlowLayout.CENTER));

        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean loginSuccessful = true; // Replace with your actual login logic

                if (loginSuccessful) {
                    dispose();
                    easyCompany = new EasyCompany();
                    easyCompany.showMainFrame();
                } else {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Login failed. Please try again.");
                }
            }
        });

        setSize(300, 150);
        setLocationRelativeTo(null);
    }
}
