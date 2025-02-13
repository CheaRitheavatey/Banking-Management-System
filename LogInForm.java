import java.awt.*;
import javax.swing.*;

public class LogInForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        
        // Panel for login
        JPanel panelLeft = new JPanel(new GridBagLayout());
        JPanel panelRight = new JPanel(new GridBagLayout());

        panelLeft.setBackground(Color.PINK);
        panelRight.setBackground(Color.GRAY);

        panelLeft.setPreferredSize(new Dimension(350, 400));
        panelRight.setPreferredSize(new Dimension(250, 400));

        frame.add(panelLeft, BorderLayout.WEST);
        frame.add(panelRight, BorderLayout.EAST);

        // Layout constraints
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10);

        // Left panel content
        JLabel title = new JLabel("Login to Your Account");
        title.setFont(new Font("Arial", Font.BOLD, 18));
        panelLeft.add(title, gbc);

        JLabel emailLabel = new JLabel("Email");
        panelLeft.add(emailLabel, gbc);
        
        JTextField email = new JTextField(20);
        panelLeft.add(email, gbc);

        JLabel passwordLabel = new JLabel("Password");
        panelLeft.add(passwordLabel, gbc);
        
        JPasswordField passwordField = new JPasswordField(20);
        panelLeft.add(passwordField, gbc);

        JButton signInButton = new JButton("Sign In");
        panelLeft.add(signInButton, gbc);

        // Right panel content
        JLabel newuser = new JLabel("New Here?");
        newuser.setFont(new Font("Arial", Font.BOLD, 18));
        panelRight.add(newuser, gbc);

        JButton signUpButton = new JButton("Sign Up");
        panelRight.add(signUpButton, gbc);
        
        frame.setVisible(true);

    }
}
