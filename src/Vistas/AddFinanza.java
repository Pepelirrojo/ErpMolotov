package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import General.Controlador;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;

public class AddFinanza extends JFrame {
	private Controlador miControlador;
	private JTextField txtId;
	private JTextField txtFecha;
	private JTextField txtCliente;
	private JTextField txtPrecioBase;
	private JTextField txtIVA;
	private JTextField txtTotal;
	private JTextField txtTipoPago;
	private JTextField txtCantidad;
	private JTextField txtDescripcion;
	private JTextField txtFactura;
	private JTextField txtTipoIVA;
	private JButton btnVerFacturas;
	private JLabel lblCantidad;
	private JLabel lblTipoDePago;
	private JLabel lblDescripcion;
	private JLabel lblFactura;
	private JLabel lblFondoBlanco;
	private JLabel lblColumnaIzq;
	private JLabel lblTituloERP;
	private JLabel label_1;
	private JLabel lblSubTitulo;
	private JLabel lblTituloGeneral;
	private JLabel lblTituloClientes;
	private JLabel lblNewLabel;
	private JLabel lblTituloGenerarFactura;

	public AddFinanza(Controlador miControlador) {
		setBounds(100, 100, 1344, 820);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnCerrarSesion;
		

		lblFactura = new JLabel("");
		lblFactura.setIcon(new ImageIcon(AddFinanza.class.getResource("/design/a\u00F1adirProductoOServicio.PNG")));
		lblFactura.setBounds(352, 544, 290, 56);
		getContentPane().add(lblFactura);

		txtId = new JTextField();
		txtId.setBounds(395, 178, 63, 19);
		getContentPane().add(txtId);
		txtId.setColumns(10);

		txtFecha = new JTextField();
		txtFecha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtFecha.setBounds(605, 325, 191, 36);
		txtFecha.setColumns(10);
		getContentPane().add(txtFecha);

		txtCliente = new JTextField();
		txtCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCliente.setBounds(605, 238, 191, 36);
		txtCliente.setColumns(10);
		getContentPane().add(txtCliente);

		txtPrecioBase = new JTextField();
		txtPrecioBase.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtPrecioBase.setBounds(1085, 241, 143, 36);
		txtPrecioBase.setColumns(10);
		getContentPane().add(txtPrecioBase);

		txtTipoIVA = new JTextField();
		txtTipoIVA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTipoIVA.setBounds(1085, 324, 143, 36);
		txtTipoIVA.setColumns(10);
		getContentPane().add(txtTipoIVA);

		txtIVA = new JTextField();
		txtIVA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtIVA.setBounds(1085, 405, 143, 36);
		txtIVA.setColumns(10);
		getContentPane().add(txtIVA);

		txtTotal = new JTextField();
		txtTotal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTotal.setBounds(926, 481, 91, 36);
		txtTotal.setColumns(10);
		getContentPane().add(txtTotal);

		txtTipoPago = new JTextField();
		txtTipoPago.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTipoPago.setBounds(605, 405, 191, 36);
		txtTipoPago.setColumns(10);
		getContentPane().add(txtTipoPago);

		txtCantidad = new JTextField();
		txtCantidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCantidad.setBounds(1137, 481, 91, 36);
		txtCantidad.setColumns(10);
		getContentPane().add(txtCantidad);

		txtDescripcion = new JTextField();
		txtDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDescripcion.setBounds(605, 481, 191, 36);
		txtDescripcion.setColumns(10);
		getContentPane().add(txtDescripcion);

		txtFactura = new JTextField();
		txtFactura.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtFactura.setBounds(352, 611, 437, 119);
		txtFactura.setColumns(10);
		getContentPane().add(txtFactura);

		JButton btnSave = new JButton("");
		btnSave.setIcon(new ImageIcon(AddFinanza.class.getResource("/design/BTNA\u00D1ADIR.PNG")));
		btnSave.setBounds(934, 642, 251, 56);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] dataForm = { txtId.getText(), txtFecha.getText(), txtCliente.getText(),
						txtPrecioBase.getText(), txtTipoIVA.getText(), txtIVA.getText(), txtTotal.getText(),
						txtTipoPago.getText(), txtCantidad.getText(), txtDescripcion.getText(), txtFactura.getText() };
				System.out.println(dataForm.length);
				miControlador.sendData(dataForm);
			}
		});
		getContentPane().add(btnSave);

		btnVerFacturas = new JButton("");
		btnVerFacturas.setIcon(new ImageIcon(AddFinanza.class.getResource("/design/btnVerFactura.PNG")));
		btnVerFacturas.setBounds(10, 228, 211, 56);
		getContentPane().add(btnVerFacturas);
		btnVerFacturas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.changeWindow("addFinanzas", "finanzas");
			}
		});

		JButton btnNuevaFactura = new JButton("");
		btnNuevaFactura.setIcon(new ImageIcon(AddFinanza.class.getResource("/design/btnNuevaFactura.PNG")));
		btnNuevaFactura.setBounds(10, 544, 211, 56);
		getContentPane().add(btnNuevaFactura);

		btnNuevaFactura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.changeWindow("addFinanzas", "addFinanzas");
			}
		});
		
		JLabel lblUsuario = new JLabel("");
		lblUsuario.setIcon(new ImageIcon(AddFinanza.class.getResource("/design/lblusuario.PNG")));
		lblUsuario.setBounds(963, 11, 337, 93);
		getContentPane().add(lblUsuario);
		
		btnCerrarSesion = new JButton("");
		btnCerrarSesion.setIcon(new ImageIcon(AddFinanza.class.getResource("/design/btnCerrarSesion.PNG")));
		btnCerrarSesion.setBounds(1193, 65, 93, 35);
		getContentPane().add(btnCerrarSesion);
		btnCerrarSesion.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				miControlador.changeWindow("addFinanzas", "login");
			}
		});

		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblId.setBounds(360, 180, 63, 13);
		getContentPane().add(lblId);

		JLabel lblCliente = new JLabel("");
		lblCliente.setBounds(352, 238, 211, 56);
		getContentPane().add(lblCliente);

		lblCliente.setIcon(new ImageIcon(AddFinanza.class.getResource("/design/cliente.PNG")));
		getContentPane().add(lblCliente);

		JLabel lblFecha = new JLabel("");
		lblFecha.setIcon(new ImageIcon(AddFinanza.class.getResource("/design/fechaFac.PNG")));
		lblFecha.setBounds(352, 324, 211, 56);
		getContentPane().add(lblFecha);

		JLabel lblPreciobase = new JLabel("");
		lblPreciobase.setIcon(new ImageIcon(AddFinanza.class.getResource("/design/precioBaseUnit.PNG")));
		lblPreciobase.setBounds(835, 238, 211, 56);
		getContentPane().add(lblPreciobase);

		JLabel lblTipoIva = new JLabel("");
		lblTipoIva.setIcon(new ImageIcon(AddFinanza.class.getResource("/design/tipoIVA.PNG")));
		lblTipoIva.setBounds(835, 324, 172, 56);
		getContentPane().add(lblTipoIva);

		JLabel lblIva = new JLabel("");
		lblIva.setIcon(new ImageIcon(AddFinanza.class.getResource("/design/ivaASecas.PNG")));
		lblIva.setBounds(835, 405, 211, 56);
		getContentPane().add(lblIva);

		JLabel lblTotal = new JLabel("");
		lblTotal.setIcon(new ImageIcon(AddFinanza.class.getResource("/design/total.PNG")));
		lblTotal.setBounds(835, 480, 88, 40);
		getContentPane().add(lblTotal);

		lblCantidad = new JLabel("CANTIDAD :");
		lblCantidad.setFont(new Font("Source Sans Pro", Font.BOLD, 17));
		lblCantidad.setBounds(1037, 485, 100, 26);
		getContentPane().add(lblCantidad);

		lblTipoDePago = new JLabel("");
		lblTipoDePago.setIcon(new ImageIcon(AddFinanza.class.getResource("/design/tipoPago.PNG")));
		lblTipoDePago.setBounds(352, 405, 211, 56);
		getContentPane().add(lblTipoDePago);

		lblDescripcion = new JLabel("");
		lblDescripcion.setIcon(new ImageIcon(AddFinanza.class.getResource("/design/descripcion.PNG")));
		lblDescripcion.setBounds(352, 472, 211, 42);
		getContentPane().add(lblDescripcion);

		
		lblTituloERP = new JLabel("");
		lblTituloERP.setBounds(10, 11, 211, 56);
		getContentPane().add(lblTituloERP);
		lblTituloERP.setIcon(new ImageIcon(AddFinanza.class.getResource("/design/tituloERP.PNG")));
		getContentPane().add(lblTituloERP);

		lblSubTitulo = new JLabel("");
		lblSubTitulo.setBounds(10, 55, 211, 56);
		getContentPane().add(lblSubTitulo);
		lblSubTitulo.setIcon(new ImageIcon(AddFinanza.class.getResource("/design/subtituloERP.PNG")));
		getContentPane().add(lblSubTitulo);

		lblTituloGeneral = new JLabel("");
		lblTituloGeneral.setBounds(12, 161, 211, 56);
		getContentPane().add(lblTituloGeneral);
		lblTituloGeneral.setIcon(new ImageIcon(AddFinanza.class.getResource("/design/tituloGeneral.PNG")));
		getContentPane().add(lblTituloGeneral);

		lblTituloClientes = new JLabel("");
		lblTituloClientes.setBounds(10, 474, 211, 56);
		getContentPane().add(lblTituloClientes);
		lblTituloClientes.setIcon(new ImageIcon(AddFinanza.class.getResource("/design/tituloClientes.PNG")));
		getContentPane().add(lblTituloClientes);
		
		lblTituloGenerarFactura = new JLabel("");
		lblTituloGenerarFactura.setBounds(352, 131, 879, 36);
		getContentPane().add(lblTituloGenerarFactura);
		lblTituloGenerarFactura.setIcon(new ImageIcon(AddFinanza.class.getResource("/design/tituloGenerarFactura.PNG")));
		getContentPane().add(lblTituloGenerarFactura);
		
		
		
		// FONDOS DEL BODY
		
		lblFondoBlanco = new JLabel("");
		lblFondoBlanco.setAutoscrolls(true);
		lblFondoBlanco.setBackground(new Color(255, 255, 255));
		lblFondoBlanco.setBounds(233, 114, 1095, 667);
		getContentPane().add(lblFondoBlanco);
		lblFondoBlanco.setIcon(new ImageIcon(AddFinanza.class.getResource("/design/fondoBlanco.PNG")));


		lblColumnaIzq = new JLabel("");
		lblColumnaIzq.setBounds(0, 0, 233, 781);
		getContentPane().add(lblColumnaIzq);
		lblColumnaIzq.setIcon(new ImageIcon(AddFinanza.class.getResource("/design/fondoGris.PNG")));
		getContentPane().add(lblColumnaIzq);

		JLabel lblFondoPrincipal = new JLabel("");
		lblFondoPrincipal.setBounds(0, -13, 1399, 834);
		getContentPane().add(lblFondoPrincipal);
		lblFondoPrincipal.setIcon(new ImageIcon(AddFinanza.class.getResource("/design/main.png")));
		getContentPane().add(lblFondoPrincipal);

		
		label_1 = new JLabel("");
		label_1.setBounds(-14, 55, 10, -1);
		getContentPane().add(label_1);
		
		
		
		

	}
}
