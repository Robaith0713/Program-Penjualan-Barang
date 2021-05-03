import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
import java.awt.font.*; 

public class Login extends JFrame implements ActionListener
{ 
	JTextField username, password; 
	JLabel loggin, user, pass; 
	JButton btnLogin; 
	String userlogin = "user123"; 
	String passlogin = "user321"; 
	
	public Login()
	{ 
		loggin = new JLabel(); 
		loggin.setText("LOGIN APP"); 
		loggin.setFont(new Font("Times New Roman", Font.BOLD,14));  loggin.setBounds(150,20,100,50); 
		add(loggin); 
		user = new JLabel(); 
		user.setText("Username : "); 
		user.setBounds(50, 73, 100,30); 
		add(user); 
		pass = new JLabel(); 
		pass.setText("Password : "); 
		pass.setBounds(50, 117, 100,30); 
		add(pass); 
		username = new JTextField(); 
		username.setBounds(150,80, 150,25); 
		add(username); 
		password = new JTextField(); 
		password.setBounds(150,120, 150,25); 
		add(password); 
		btnLogin = new JButton("Login"); 
		btnLogin.setBounds(150,160,150,35); 
		btnLogin.addActionListener(this); 
		add(btnLogin); 
		setLayout(null); 
		setSize(375,300); 
		setLocationRelativeTo(null); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true); 
		setResizable(false); 
	} 
	
	public void actionPerformed(ActionEvent e)
	{ 	try {
		if (e.getSource() == btnLogin){ 
			
			
			if (userlogin.equalsIgnoreCase(username.getText()) &&  passlogin.equalsIgnoreCase(password.getText()))
			{
				this.setVisible(false);
				JOptionPane.showMessageDialog(null, "Login Berhasil !");
				new Frame_penyimpanan_barang().setVisible(true);			 
			}
			else
			{ 
				JOptionPane.showMessageDialog(null, "Login Gagal !"); 
			}
		}
		}
		catch (Exception s)
			{ 
				JOptionPane.showMessageDialog(null, "Login Gagal" +  s.getMessage()); 
			}
}
}
