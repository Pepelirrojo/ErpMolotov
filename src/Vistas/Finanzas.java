package Vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import General.Controlador;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Font;

public class Finanzas extends JFrame {
	private Controlador miControlador;
	private JTable table;
	private JLabel lblColumnaIzq;
	private JLabel lblFondoBlanco;
	private JLabel lblTituloGeneral;
	private JLabel lblTituloClientes;
	private JLabel lblSubTitulo;
	private JLabel lblTituloERP;
	private JButton btnCerrarSesion;
	private JLabel lblID;
	private JLabel lblFecha;
	private JLabel lblNewLabel;
	private JLabel lblDetallesFinancieros;
	private JLabel lblTituloDescrip;
	private JLabel lblFacturaDescrip;

	public Finanzas(Controlador miControlador) {
		this.miControlador = miControlador;

		setTitle("MolotovERP - Finanzas");
		setBounds(600, 200, 1344, 819);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
												
												lblFacturaDescrip = new JLabel("");
												lblFacturaDescrip.setIcon(new ImageIcon(Finanzas.class.getResource("/design/tablaFacturaDescrip.PNG")));
												lblFacturaDescrip.setBounds(1026, 270, 180, 14);
												getContentPane().add(lblFacturaDescrip);
												
												JButton btnRefresh = new JButton("");
												btnRefresh.setIcon(new ImageIcon(Finanzas.class.getResource("/design/btnActualizar.PNG")));
												btnRefresh.setBounds(667, 180, 233, 39);
												getContentPane().add(btnRefresh);
												btnRefresh.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														showTable();
													}
												});
												
												lblTituloDescrip = new JLabel("");
												lblTituloDescrip.setIcon(new ImageIcon(Finanzas.class.getResource("/design/tablaTituloDescrp.PNG")));
												lblTituloDescrip.setBounds(903, 270, 120, 14);
												getContentPane().add(lblTituloDescrip);
												
												lblDetallesFinancieros = new JLabel("");
												lblDetallesFinancieros.setIcon(new ImageIcon(Finanzas.class.getResource("/design/tablaDetallesFinan.PNG")));
												lblDetallesFinancieros.setBounds(600, 270, 304, 14);
												getContentPane().add(lblDetallesFinancieros);
												
												lblNewLabel = new JLabel("");
												lblNewLabel.setIcon(new ImageIcon(Finanzas.class.getResource("/design/tablaCliente.PNG")));
												lblNewLabel.setBounds(535, 270, 60, 14);
												getContentPane().add(lblNewLabel);
												
												lblFecha = new JLabel("New label");
												lblFecha.setIcon(new ImageIcon(Finanzas.class.getResource("/design/tablaFecha.PNG")));
												lblFecha.setBounds(410, 270, 120, 14);
												getContentPane().add(lblFecha);
										
												table = new JTable();
												table.setBounds(382, 306, 824, 279);
												getContentPane().add(table);
										
										lblID = new JLabel("");
										lblID.setIcon(new ImageIcon(Finanzas.class.getResource("/design/tablaId.PNG")));
										lblID.setBounds(382, 270, 26, 14);
										getContentPane().add(lblID);
								
								// FONDOS DEL BODY
								
										lblFondoBlanco = new JLabel("");
										lblFondoBlanco.setAutoscrolls(true);
										lblFondoBlanco.setBackground(new Color(255, 255, 255));
										lblFondoBlanco.setBounds(233, 114, 1095, 667);
										getContentPane().add(lblFondoBlanco);
										lblFondoBlanco.setIcon(new ImageIcon(Finanzas.class.getResource("/design/fondoBlanco.PNG")));
								
								btnCerrarSesion = new JButton("");
								btnCerrarSesion.setIcon(new ImageIcon(Finanzas.class.getResource("/design/btnCerrarSesion.PNG")));
								btnCerrarSesion.setBounds(1193, 65, 93, 35);
								getContentPane().add(btnCerrarSesion);
								btnCerrarSesion.addActionListener(new ActionListener() {
									@Override
									public void actionPerformed(ActionEvent e) {
										miControlador.changeWindow("finanzas", "login");
									}
								});
								
								JButton btnAñadirModulo = new JButton("");
								btnAñadirModulo.setIcon(new ImageIcon(Finanzas.class.getResource("/design/btnA\u00F1adirModulo.PNG")));
								btnAñadirModulo.setBounds(530, 11, 93, 93);
								getContentPane().add(btnAñadirModulo);
								btnAñadirModulo.addActionListener(new ActionListener() {
									@Override
									public void actionPerformed(ActionEvent e) {
										miControlador.changeWindow("finanzas", "usuario");
									}
								});
								
								JLabel lblUsuario = new JLabel("");
								lblUsuario.setIcon(new ImageIcon(Finanzas.class.getResource("/design/lblusuario.PNG")));
								lblUsuario.setBounds(963, 11, 337, 93);
								getContentPane().add(lblUsuario);
								
								JButton btnVerFacturas = new JButton("");
								btnVerFacturas.setIcon(new ImageIcon(Finanzas.class.getResource("/design/btnVerFactura.PNG")));
								btnVerFacturas.setFont(new Font("Tahoma", Font.PLAIN, 9));
								btnVerFacturas.setBounds(10, 544, 211, 56);
								getContentPane().add(btnVerFacturas);
								btnVerFacturas.addActionListener(new ActionListener() {
									@Override
									public void actionPerformed(ActionEvent e) {
										miControlador.changeWindow("finanzas", "finanzas");
									}
								});
						
								JButton btnSalir = new JButton("");
								btnSalir.setIcon(new ImageIcon(Finanzas.class.getResource("/design/btnMenuFinanzas.PNG")));
								btnSalir.setBounds(410, 11, 93, 93);
								getContentPane().add(btnSalir);
								btnSalir.addActionListener(new ActionListener() {
									@Override
									public void actionPerformed(ActionEvent e) {
										miControlador.changeWindow("finanzas", "finanzas");
									}
								});
								
				
						JButton btnAddFinanza = new JButton("");
						btnAddFinanza.setIcon(new ImageIcon(Finanzas.class.getResource("/design/btnNuevaFactura.PNG")));
						btnAddFinanza.setBounds(10, 228, 211, 56);
						btnAddFinanza.setFont(new Font("Tahoma", Font.PLAIN, 9));
						getContentPane().add(btnAddFinanza);
						btnAddFinanza.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								miControlador.changeWindow("finanzas", "addFinanzas");
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
		
		
		lblTituloERP = new JLabel("");
		lblTituloERP.setBounds(10, 11, 211, 56);
		getContentPane().add(lblTituloERP);
		lblTituloERP.setIcon(new ImageIcon(Finanzas.class.getResource("/design/tituloERP.PNG")));
		getContentPane().add(lblTituloERP);

		lblSubTitulo = new JLabel("");
		lblSubTitulo.setBounds(10, 55, 211, 56);
		getContentPane().add(lblSubTitulo);
		lblSubTitulo.setIcon(new ImageIcon(Finanzas.class.getResource("/design/subtituloERP.PNG")));
		getContentPane().add(lblSubTitulo);

		lblTituloGeneral = new JLabel("");
		lblTituloGeneral.setBounds(12, 161, 211, 56);
		getContentPane().add(lblTituloGeneral);
		lblTituloGeneral.setIcon(new ImageIcon(Finanzas.class.getResource("/design/tituloGeneral.PNG")));
		getContentPane().add(lblTituloGeneral);

		lblTituloClientes = new JLabel("");
		lblTituloClientes.setBounds(10, 474, 211, 56);
		getContentPane().add(lblTituloClientes);
		lblTituloClientes.setIcon(new ImageIcon(Finanzas.class.getResource("/design/tituloClientes.PNG")));
		getContentPane().add(lblTituloClientes);


				lblColumnaIzq = new JLabel("");
				lblColumnaIzq.setBounds(0, 0, 233, 781);
				getContentPane().add(lblColumnaIzq);
				lblColumnaIzq.setIcon(new ImageIcon(Finanzas.class.getResource("/design/fondoGris.PNG")));
				getContentPane().add(lblColumnaIzq);

				JLabel lblFondoPrincipal = new JLabel("");
				lblFondoPrincipal.setBounds(0, -13, 1399, 834);
				getContentPane().add(lblFondoPrincipal);
				lblFondoPrincipal.setIcon(new ImageIcon(Finanzas.class.getResource("/design/main.png")));
				getContentPane().add(lblFondoPrincipal);

		
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
