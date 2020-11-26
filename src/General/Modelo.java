package General;

import java.sql.SQLException;
import java.util.ArrayList;

public class Modelo {
	private BDManager miBdManager;

	public Modelo() {
		miBdManager = new BDManager();
	}

	public boolean login(String user, String pwd) throws SQLException {
		boolean exito = false;
		if (miBdManager.login(user, pwd)) {
			exito = true;
		}
		return exito;
	}

	public ArrayList<Object[]> getDataToTable() {
		return miBdManager.getDbDataToTable();
	}

	public void sendDataForm(String[] dataForm) {
		miBdManager.insertFinanza(dataForm);
	}
}
