package loginInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loginInterface {

	private JFrame frame;
	private JTextField username_Tb;
	private JTextField password_Tb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginInterface window = new loginInterface();
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
	public loginInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		username_Tb = new JTextField();
		username_Tb.setBounds(164, 114, 114, 19);
		frame.getContentPane().add(username_Tb);
		username_Tb.setColumns(10);
		
		password_Tb = new JTextField();
		password_Tb.setBounds(164, 145, 114, 19);
		frame.getContentPane().add(password_Tb);
		password_Tb.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(51, 116, 105, 15);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(51, 147, 105, 15);
		frame.getContentPane().add(lblPassword);
		
		JButton signIn_Btn = new JButton("Sign In");
		signIn_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String pw = username_Tb.getText();
				if ((pw.equals("Admin")&&((password_Tb.getText()).equals("Password")))) {
					//System.out.println();
					JOptionPane.showMessageDialog(null, "You are now logged in as " + pw);
				}else {
					JOptionPane.showMessageDialog(null, "Username/Password is incorrect.");
				}
				System.out.println(pw);
			}
		});
		signIn_Btn.setBounds(161, 191, 117, 25);
		frame.getContentPane().add(signIn_Btn);
	}
}
