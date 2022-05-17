import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegForm extends JFrame{
    private JPanel RegPanel;
    private JPasswordField RegJelszoBox;
    private JTextField RegNeptunBox;
    private JButton RegButton;
    private JComboBox StateCombobox;
    private JTextField RegNevBox;

    public RegForm(){
        setTitle("Regisztráció");
        setSize(450,300);
        setContentPane(RegPanel);
        setVisible(true);


        // gombkattintásra regisztrálást és feldobandó "sikeres regisztráció!" feliratot ide
        //RegButton.addActionListener(e -> main.Registration(RegNevBox.getText(), RegNeptunBox.getText(), StateCombobox.getSelectedIndex(), String.valueOf(RegJelszoBox.getPassword())));
        RegButton.addActionListener(e -> {
            main.Registration(RegNevBox.getText(), RegNeptunBox.getText(), StateCombobox.getSelectedIndex(), String.valueOf(RegJelszoBox.getPassword()));
            JOptionPane.showMessageDialog(null, "Sikeres regisztráció!", "Siker",JOptionPane.WARNING_MESSAGE);
            setVisible(false);
            dispose();
        });
    }
}
