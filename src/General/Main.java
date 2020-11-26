package General;

import Vistas.*;

public class Main {
	public static void main(String[] args) {
		Modelo miModelo = new Modelo();
		Controlador miControlador = new Controlador(miModelo);
		Login miLogin = new Login(miControlador);
		Usuario miUsuario = new Usuario(miControlador);
		Finanzas miFinanzas = new Finanzas(miControlador);
		AddFinanza miAddFinanza = new AddFinanza(miControlador);
		miControlador.setAddFinanza(miAddFinanza);
		miControlador.setLogin(miLogin);
		miControlador.setUsuario(miUsuario);
		miControlador.setFinanzas(miFinanzas);
		miLogin.setVisible(true);
	}
}
