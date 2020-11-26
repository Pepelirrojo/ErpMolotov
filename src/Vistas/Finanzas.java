package Vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import General.Controlador;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;

public class Finanzas extends JFrame {
	private Controlador miControlador;
	private JTable table;

	public Finanzas(Controlador miControlador) {
		this.miControlador = miControlador;

		setTitle("MolotovERP - Finanzas");
		setBounds(600, 200, 600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JButton btnSalir = new JButton("Volver");
		btnSalir.setBounds(491, 10, 85, 21);
		getContentPane().add(btnSalir);
		btnSalir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				miControlador.changeWindow("finanzas", "usuario");
			}
		});

		JButton btnAddFinanza = new JButton("A\u00F1adir Finanza");
		btnAddFinanza.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnAddFinanza.setBounds(372, 10, 109, 36);
		getContentPane().add(btnAddFinanza);
		btnAddFinanza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.changeWindow("finanzas", "addFinanzas");
			}
		});

		table = new JTable();
		table.setBounds(10, 74, 515, 195);
		getContentPane().add(table);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.setBounds(440, 279, 85, 21);
		getContentPane().add(btnRefresh);
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showTable();
			}
		});
		
		addWindowListener(new WindowListener() {
			public void windowOpened(WindowEvent e) {
				showTable();
			}

			@Override
			public void windowClosing(WindowEvent e) {
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
			}
		});
	}

	public void showTable() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Fecha");
		model.addColumn("Cliente");
		model.addColumn("Precio Base");
		model.addColumn("Tipo IVA");
		model.addColumn("IVA");
		model.addColumn("Total");
		model.addColumn("´Tipo de Pago");
		model.addColumn("Cantidad");
		model.addColumn("Descripcion");
		model.addColumn("Factura");
		ArrayList<Object[]> allData = miControlador.showDbInTable();
		for (int i = 0; i < allData.size(); i++) {
			model.addRow(allData.get(i));
		}
		table.setModel(model);
		table.setAutoResizeMode(0);
		table.getColumnModel().getColumn(0).setPreferredWidth(40);
		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setPreferredWidth(40);
		table.getColumnModel().getColumn(4).setPreferredWidth(40);
		table.getColumnModel().getColumn(5).setPreferredWidth(40);
		table.getColumnModel().getColumn(6).setPreferredWidth(40);
		table.getColumnModel().getColumn(7).setPreferredWidth(250);
		table.getColumnModel().getColumn(8).setPreferredWidth(50);
		table.getColumnModel().getColumn(9).setPreferredWidth(200);
		table.getColumnModel().getColumn(10).setPreferredWidth(300);
	}
}
