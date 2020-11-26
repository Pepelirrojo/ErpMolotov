package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import General.Controlador;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

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
	private JButton btnVolver;
	private JLabel lblCantidad;
	private JLabel lblTipoDePago;
	private JLabel lblDescripcion;
	private JLabel lblFactura;

	public AddFinanza(Controlador miControlador) {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		txtId = new JTextField();
		txtId.setBounds(23, 31, 43, 19);
		getContentPane().add(txtId);
		txtId.setColumns(10);

		txtFecha = new JTextField();
		txtFecha.setColumns(10);
		txtFecha.setBounds(23, 60, 81, 19);
		getContentPane().add(txtFecha);

		txtCliente = new JTextField();
		txtCliente.setColumns(10);
		txtCliente.setBounds(23, 90, 81, 19);
		getContentPane().add(txtCliente);

		txtPrecioBase = new JTextField();
		txtPrecioBase.setColumns(10);
		txtPrecioBase.setBounds(25, 119, 43, 19);
		getContentPane().add(txtPrecioBase);

		txtTipoIVA = new JTextField();
		txtTipoIVA.setColumns(10);
		txtTipoIVA.setBounds(25, 147, 43, 19);
		getContentPane().add(txtTipoIVA);

		txtIVA = new JTextField();
		txtIVA.setColumns(10);
		txtIVA.setBounds(25, 176, 43, 19);
		getContentPane().add(txtIVA);

		txtTotal = new JTextField();
		txtTotal.setColumns(10);
		txtTotal.setBounds(23, 210, 63, 19);
		getContentPane().add(txtTotal);

		txtTipoPago = new JTextField();
		txtTipoPago.setColumns(10);
		txtTipoPago.setBounds(157, 31, 109, 19);
		getContentPane().add(txtTipoPago);

		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(23, 244, 63, 19);
		getContentPane().add(txtCantidad);

		txtDescripcion = new JTextField();
		txtDescripcion.setColumns(10);
		txtDescripcion.setBounds(157, 60, 128, 19);
		getContentPane().add(txtDescripcion);

		txtFactura = new JTextField();
		txtFactura.setColumns(10);
		txtFactura.setBounds(157, 90, 171, 73);
		getContentPane().add(txtFactura);

		JButton btnSave = new JButton("Guardar");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] dataForm = { txtId.getText(), txtFecha.getText(), txtCliente.getText(),
						txtPrecioBase.getText(), txtTipoIVA.getText(), txtIVA.getText(), txtTotal.getText(),
						txtTipoPago.getText(), txtCantidad.getText(), txtDescripcion.getText(), txtFactura.getText() };
				System.out.println(dataForm.length);
				miControlador.sendData(dataForm);
			}
		});
		btnSave.setBounds(167, 175, 85, 21);
		getContentPane().add(btnSave);

		btnVolver = new JButton("Volver");
		btnVolver.setBounds(341, 10, 85, 21);
		getContentPane().add(btnVolver);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.changeWindow("addFinanzas", "finanzas");
			}
		});
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(23, 14, 45, 13);
		getContentPane().add(lblId);

		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(23, 78, 45, 13);
		getContentPane().add(lblCliente);

		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(23, 47, 45, 13);
		getContentPane().add(lblFecha);

		JLabel lblPreciobase = new JLabel("PrecioBase");
		lblPreciobase.setBounds(23, 109, 50, 13);
		getContentPane().add(lblPreciobase);

		JLabel lblTipoIva = new JLabel("Tipo IVA");
		lblTipoIva.setBounds(23, 137, 45, 13);
		getContentPane().add(lblTipoIva);

		JLabel lblIva = new JLabel("IVA");
		lblIva.setBounds(23, 165, 45, 13);
		getContentPane().add(lblIva);

		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(23, 196, 45, 13);
		getContentPane().add(lblTotal);

		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(23, 230, 71, 13);
		getContentPane().add(lblCantidad);

		lblTipoDePago = new JLabel("Tipo de Pago");
		lblTipoDePago.setBounds(156, 14, 81, 13);
		getContentPane().add(lblTipoDePago);

		lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(157, 47, 63, 13);
		getContentPane().add(lblDescripcion);

		lblFactura = new JLabel("Factura");
		lblFactura.setBounds(157, 78, 45, 13);
		getContentPane().add(lblFactura);

	}
}
