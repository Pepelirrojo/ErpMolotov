package Vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import General.Controlador;

public class Usuario extends JFrame {
	private Controlador miControlador;

	public Usuario(Controlador miControlador) {
		this.miControlador = miControlador;
		setTitle("MolotovERP - Usuario");
		setBounds(600, 200, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(341, 10, 85, 21);
		getContentPane().add(btnSalir);
		btnSalir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				miControlador.changeWindow("usuario", "login");
			}
		});

		JButton btnFinanzas = new JButton("Finanzas");
		btnFinanzas.setBounds(137, 101, 85, 21);
		getContentPane().add(btnFinanzas);
		btnFinanzas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				miControlador.changeWindow("usuario", "finanzas");
			}
		});
	}
}
