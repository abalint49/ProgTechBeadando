import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegForm extends JFrame{
    private JPanel RegPanel;
    private JPasswordField RegJelszoBox;
    private JTextField RegNeptunBox;
    private JButton RegButton;
    private JComboBox StateCombobox;

    public RegForm(){
        setTitle("Regisztráció");
        setSize(450,300);
        setContentPane(RegPanel);
        setVisible(true);


        // gombkattintásra regisztrálást és feldobandó "sikeres regisztráció!" feliratot ide
        RegButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
