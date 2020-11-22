package Vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import General.Controlador;

public class Finanzas extends JFrame {
	private Controlador miControlador;

	public Finanzas(Controlador miControlador) {
		this.miControlador = miControlador;
		setTitle("MolotovERP - Finanzas");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JButton btnSalir = new JButton("Volver");
		btnSalir.setBounds(341, 10, 85, 21);
		getContentPane().add(btnSalir);
		btnSalir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				miControlador.changeWindow("finanzas", "usuario");
			}
		});

	}
}
