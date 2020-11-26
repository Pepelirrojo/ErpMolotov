package General;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BDManager {
	private String db = "managerp_bd_2";
	private String login = "root";
	private String pwd = "";
	private String url = "jdbc:mysql://localhost/" + db
			+ "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

	private Connection conexion;

	public BDManager() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(url, login, pwd);
			System.out.println("-> Conexión con MySQL establecida");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver JDBC No encontrado");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error al conectarse a la BD");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error general de Conexión");
			e.printStackTrace();
		}
	}

	public boolean login(String user, String pwd) throws SQLException {
		boolean exito = false;
		Statement stmt = conexion.createStatement();
		ResultSet rset = stmt
				.executeQuery("Select * from usuarios where mail = '" + user + "' and pwd = '" + pwd + "'");
		if (rset.next()) {
			exito = true;
		}
		rset.close();
		return exito;
	}

	public ArrayList<Object[]> getDbDataToTable() {
		ArrayList<Object[]> allData = new ArrayList<Object[]>();
		try {
			String query = "Select * from finanzas";
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				Object[] data = new Object[] { rs.getString("id"), rs.getString("Fecha"), rs.getString("Cliente"),
						rs.getString("Precio_base"), rs.getString("Tipo_IVA"), rs.getString("IVA"),
						rs.getString("Total"), rs.getString("Tipo_pago"), rs.getString("Cantidad"),
						rs.getString("Descripcion"), rs.getString("Factura") };
				allData.add(data);
			}
			rs.close();
			st.close();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return allData;
	}

	public void insertFinanza(String[] dataForm) {
		try {
			String query = "INSERT INTO `finanzas`(`Id_modulo`, `Id`, `Fecha`, `Cliente`, `Precio_base`, `Tipo_IVA`, `IVA`, `Total`, `Tipo_pago`, `Cantidad`, `Descripcion`, `Factura`) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			Statement st = conexion.createStatement();
			PreparedStatement pstmt = conexion.prepareStatement(query);
			pstmt.setString(1, "1");
			pstmt.setString(2, dataForm[0]);
			pstmt.setString(3, dataForm[1]);
			pstmt.setString(4, dataForm[2]);
			pstmt.setString(5, dataForm[3]);
			pstmt.setString(6, dataForm[4]);
			pstmt.setString(7, dataForm[5]);
			pstmt.setString(8, dataForm[6]);
			pstmt.setString(9, dataForm[7]);
			pstmt.setString(10, dataForm[8]);
			pstmt.setString(11, dataForm[9]);
			pstmt.setString(12, dataForm[10]);
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
