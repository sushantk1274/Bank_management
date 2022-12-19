package GUI;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	public JFrame frame;
	private JTextField textField , textField_2;
	private JPasswordField textField_1;

	/**
	 * Launch the application.
	 * @throws FileNotFoundException 
//	 */
    /**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(150, 50, 900, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("    Banking System    ");
		ImageIcon icon=new ImageIcon("1.PNG");
		frame.setIconImage(icon.getImage());
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Menu.class.getResource("/img/1.png")));
		lblNewLabel.setBounds(500, 20, 226, 223);
		frame.getContentPane().add(lblNewLabel);


		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.CYAN);
		
	  	JLabel label = new JLabel("Welcome to Paper Bank");
		label.setFont(new Font("Itallic", (Font.BOLD), 27));

		label.setBounds(147, 11, 350, 41);
		frame.getContentPane().add(label);
		
		JLabel lblLoginScreen = new JLabel("Login Screen");
		lblLoginScreen.setFont(new Font("Arial", Font.BOLD, 13));
		lblLoginScreen.setBounds(170, 63, 121, 23);
		frame.getContentPane().add(lblLoginScreen);
		
		JLabel lblAdminname = new JLabel("Admin_Username:");
		lblAdminname.setFont(new Font("Arial", Font.BOLD, 12));
		//lblUsername.setBounds(65, 129, 74, 23);
		lblAdminname.setBounds(65, 129, 120, 23);
		frame.getContentPane().add(lblAdminname);



		JLabel lblUsername = new JLabel("Customer_Username:");
		lblUsername.setFont(new Font("Arial", Font.BOLD, 12));
		lblUsername.setBounds(65, 169, 140, 23);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Arial", Font.BOLD, 12));
		lblPassword.setBounds(65, 210, 84, 23);
		frame.getContentPane().add(lblPassword);



		textField = new JTextField();
		textField.setBounds(210, 131, 206, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);


		textField_2 = new JTextField();
		textField_2.setBounds(210, 171, 206, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		textField_1 = new JPasswordField();
		textField_1.setBounds(210, 210, 206, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		


		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				String user,pass;
				String admin1,admin2,admin3,pass1,pass2,pass3;
				textField_2.setText("user");
				user="user";

				user=textField_2.getText();

				admin1="Anamika";
				admin2="Sneha";
				admin3="Arshiya";

				admin1=textField.getText();
				admin2=textField.getText();
				admin3=textField.getText();


				pass1=textField_1.getText();
				if((admin1.equals("Anamika") && (pass1.equals("Priya"))))
				{
					JOptionPane.showMessageDialog(frame.getComponent(0), "Login Successfully");
					frame.setVisible(false);

					GUIForm.menu.setVisible(true);

				}
				pass2=textField_1.getText();
				if((admin2.equals("Sneha") && (pass2.equals("Choudhary"))))
				{
					JOptionPane.showMessageDialog(frame.getComponent(0), "Login Successfully");
					frame.setVisible(false);

					GUIForm.menu.setVisible(true);

				}
				pass3=textField_1.getText();
				if((admin3.equals("Arshiya") && (pass3.equals("Chutke"))))
				{
					JOptionPane.showMessageDialog(frame.getComponent(0), "Login Successfully");
					frame.setVisible(false);

					GUIForm.menu.setVisible(true);

				}
				pass=textField_1.getText();
				if((user.equals("user") && (pass.equals("112"))))
				{
					JOptionPane.showMessageDialog(frame.getComponent(0), "Login Successfully");
					frame.setVisible(false);

					GUIForm.menu.setVisible(true);

				}
				else
				{
					JOptionPane.showMessageDialog(frame.getComponent(0), "Login Failed");
				}
			}
		});

		//btnLogin.setBounds(150, 220, 109, 33);
		btnLogin.setBounds(150, 270, 109, 33);
		frame.getContentPane().add(btnLogin);
	}
}