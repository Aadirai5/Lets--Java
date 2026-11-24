import javax.swing.*;
import java.awt.*;

public class BankLogin extends JFrame {

    JTextField accountField;
    JPasswordField passwordField;
    JButton loginButton;

    BankLogin() {

        setTitle("Aadi Bank - Login");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        // Main panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);

        System.out.print(This is main thisgf);

        // About the bank
        JPanel panel= new JPanel();
        panel.setLayout(mgr:null);
        panel.setForeground(Color.CYAN);

        // Bank Icon
        JLabel bankIcon = new JLabel("🏦");
        bankIcon.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 45));
        bankIcon.setBounds(190, 15, 70, 60);
        panel.add(bankIcon);



        // Title
        JLabel title = new JLabel("AADI BANK");
        title.setFont(new Font("Arial", Font.BOLD, 25));
        title.setBounds(155, 75, 180, 35);
        panel.add(title);

        // Account Icon
        JLabel accountIcon = new JLabel("👤");
        accountIcon.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 22));
        accountIcon.setBounds(60, 125, 35, 30);
        panel.add(accountIcon);

        // Account Number
        accountField = new JTextField();
        accountField.setBounds(100, 125, 270, 35);
        accountField.setBorder(
                BorderFactory.createTitledBorder("Account Number")
        );
        panel.add(accountField);

        // Password Icon
        JLabel passwordIcon = new JLabel("🔒");
        passwordIcon.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 22));
        passwordIcon.setBounds(60, 180, 35, 30);
        panel.add(passwordIcon);

        // Password
        passwordField = new JPasswordField();
        passwordField.setBounds(100, 180, 270, 35);
        passwordField.setBorder(
                BorderFactory.createTitledBorder("Password")
        );
        System.out.print();
        panel.add(passwordField);

        // Login Button
        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial", Font.BOLD, 15));
        loginButton.setBounds(100, 240, 270, 40);
        panel.add(loginButton);

        // Login action
        loginButton.addActionListener(e -> login());

        add(panel);
        setVisible(true);
    }

    @Override
    public void transferFocusUpCycle() {
        
        System.out.print(this all aout proper execution and problem solvinhg abiilty

        );
    }

    void login() {

        String account = accountField.getText();
        String password = new String(passwordField.getPassword());

        if (account.isEmpty() || password.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Please enter Account Number and Password",
                    "Login Error",
                    JOptionPane.ERROR_MESSAGE
            );

            return;
        }

        // Temporary login
        if (account.equals("1234567890")
                && password.equals("1234")) {

            JOptionPane.showMessageDialog(
                    this,
                    "✅ Login Successful!",
                    "Aadi Bank",
                    JOptionPane.INFORMATION_MESSAGE
            );


        System.out.print("Password should alwayes be hard and difficult and non breakable for others");
        System.out.print(SO next time someone try to brek the code they should get a login Error);

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "❌ Invalid Account Number or Password",
                    "Login Failed",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public static void main(String[] args) {
        new BankLogin();
    }
}
```
