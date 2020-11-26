package General;

import Vistas.Finanzas;
import Vistas.Login;
import Vistas.Usuario;

public class Main {
	public static void main(String[] args) {
		Modelo miModelo = new Modelo();
		Controlador miControlador = new Controlador(miModelo);
		Login miLogin = new Login(miControlador);
		Usuario miUsuario = new Usuario(miControlador);
		Finanzas miFinanzas = new Finanzas(miControlador);
		miControlador.setLogin(miLogin);
		miControlador.setUsuario(miUsuario);
		miControlador.setFinanzas(miFinanzas);
		miLogin.setVisible(true);
	}
}
