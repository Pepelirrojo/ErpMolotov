package Vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import General.Controlador;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Finanzas extends JFrame {
	private Controlador miControlador;
	private JTable table;

	public Finanzas(Controlador miControlador) {
		this.miControlador = miControlador;
		setTitle("MolotovERP - Finanzas");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JButton btnSalir = new JButton("Volver");
		btnSalir.setBounds(341, 10, 85, 21);
		getContentPane().add(btnSalir);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Id", "Fecha", "Cliente", "Precio Base", "Tipo IVA", "IVA", "Total Pago", "Tipo Pago", "Total Pagar", "Descripcion", "Factura"},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Id", "Fecha", "Cliente", "Precio Base", "Tipo IVA", "IVA", "Total Pago", "Tipo Pago", "Total Pagar", "Descripcion", "Factura"
			}
		));
		table.setBounds(10, 41, 416, 222);
		getContentPane().add(table);
		btnSalir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				miControlador.changeWindow("finanzas", "usuario");
			}
		});

	}
}
