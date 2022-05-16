import com.mysql.cj.log.Log;

import javax.swing.*;

public class LogInForm extends JFrame {
    private JPasswordField LoginJelszoBox;
    private JTextField LoginNeptunBox;
    private JButton LoginButton;
    private JPanel loginPanel;

    public LogInForm() {
        setTitle("Bejelentkezés");
        setSize(450,300);
        setContentPane(loginPanel);
        setVisible(true);
        LoginButton.addActionListener(e -> main.Login(LoginNeptunBox.getText(),String.valueOf(LoginJelszoBox.getPassword())));

    }
}
