import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;

public class AdminIndex {

    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdminIndex window = new AdminIndex();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public AdminIndex() {
        initialize();
        frame.setVisible(true);
        frame.setVisible(true);
        frame.setVisible(true);
        frame.setVisible(true);
        frame.setVisible(true);
        frame.setVisible(true);
        
        
        }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(128, 128, 128));
        frame.setBounds(100, 100, 505, 471);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ABHIJIT\\Downloads\\download (1).png"));
        lblNewLabel.setBounds(144, 0, 207, 228);
        frame.getContentPane().add(lblNewLabel);
        
        usernameField = new JTextField();
        usernameField.setBounds(240, 250, 86, 20);
        frame.getContentPane().add(usernameField);
        usernameField.setColumns(10);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(240, 296, 86, 20);
        frame.getContentPane().add(passwordField);
        
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(105, 361, 89, 23);
        frame.getContentPane().add(loginButton);
        loginButton.addActionListener(new ActionListener() {
          
			public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                @SuppressWarnings("deprecation")
				String password = passwordField.getText();
                
                // Check login credentials (replace this with your own code)
                try {
                    if (username.equals("admin") && password.equals("pass")) {
                        
                    } else {
                        JOptionPane.showMessageDialog(frame, "Invalid username or password");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "An error occurred: " + ex.getMessage());
                }
            }
        });
    
        
        JLabel userid = new JLabel("UserId");
        userid.setBounds(119, 253, 46, 14);
        frame.getContentPane().add(userid);
        
        JLabel passwordLabel_2 = new JLabel("Password");
        passwordLabel_2.setBounds(119, 299, 46, 14);
        frame.getContentPane().add(passwordLabel_2);
        
        JButton backbtn = new JButton("BACK");
        backbtn.setBounds(301, 361, 89, 23);
        frame.getContentPane().add(backbtn);
        
    }
}