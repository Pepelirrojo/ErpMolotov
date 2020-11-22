package Vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import General.Controlador;

public class Login extends JFrame {
	private Controlador miControlador;
	private JTextField txtUser;
	private JTextField txtPwd;

	public Login(Controlador miControlador) {
		this.miControlador = miControlador;
		setTitle("MolotovERP - Login");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		txtUser = new JTextField();
		txtUser.setBounds(166, 140, 96, 19);
		getContentPane().add(txtUser);
		txtUser.setColumns(10);

		txtPwd = new JTextField();
		txtPwd.setToolTipText("");
		txtPwd.setBounds(166, 180, 96, 19);
		getContentPane().add(txtPwd);
		txtPwd.setColumns(10);

		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(166, 232, 85, 21);
		getContentPane().add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if (miControlador.pedirLogin(txtUser.getText(), txtPwd.getText())) {
						miControlador.changeWindow("login", "usuario");
						txtPwd.setText("");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	}
}
