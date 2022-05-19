import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogInForm extends JFrame {
    private JPasswordField LoginJelszoBox;
    private JTextField LoginNeptunBox;
    private JButton LoginButton;
    private JPanel loginPanel;
    private JButton LoginRegGomb;

    public LogInForm() {
        setTitle("Bejelentkezés");
        setSize(450,300);
        setContentPane(loginPanel);
        setVisible(true);
        LoginButton.addActionListener(e ->
                {
                    main.Login(LoginNeptunBox.getText(), String.valueOf(LoginJelszoBox.getPassword()));
                    switch (main.CurrentUser.state) {
                        case "1":
                            TeacherForm t = new TeacherForm();
                    }
                });
        LoginRegGomb.addActionListener(e -> {RegForm r = new RegForm();});
    }
}
