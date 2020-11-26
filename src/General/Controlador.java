package General;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JFrame;

import Vistas.AddFinanza;
import Vistas.Finanzas;
import Vistas.Login;
import Vistas.Usuario;

public class Controlador {
	private Modelo miModelo;
	private HashMap<String, JFrame> misPantallas;

	public Controlador(Modelo miModelo) {
		this.miModelo = miModelo;
		this.misPantallas = new HashMap<String, JFrame>();
	}

	public void setLogin(Login login) {
		misPantallas.put("login", login);
	}

	public void setUsuario(Usuario usuario) {
		misPantallas.put("usuario", usuario);
	}

	public void setAddFinanza(AddFinanza miAddFinanza) {
		misPantallas.put("addFinanzas", miAddFinanza);
	}

	public void setFinanzas(Finanzas finanzas) {
		misPantallas.put("finanzas", finanzas);
	}

	public void changeWindow(String origen, String destino) {
		misPantallas.get(origen).setVisible(false);
		misPantallas.get(destino).setVisible(true);
	}

	public boolean pedirLogin(String user, String pwd) throws SQLException {
		boolean exito = false;
		if (miModelo.login(user, pwd)) {
			exito = true;
		}
		return exito;
	}

	public ArrayList<Object[]> showDbInTable() {
		return miModelo.getDataToTable();
	}

	public void sendData(String[] dataForm) {
		miModelo.sendDataForm(dataForm);
	}

}
