package connect.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion{
	
	private static final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/new_schema";
	private static final String USER = "root";
	private static final String PASSWORD = "MAMA41443727";
	
	static {
		try {
			
			Class.forName(CONTROLADOR);
			
		}catch (ClassNotFoundException e){
			
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();
			
		}
	}
	public static Connection conectar() {
		
		Connection conexion = null;		
		try {
			
			conexion = DriverManager.getConnection(URL, USER, PASSWORD );
			System.out.println("Conexión establecida");
						
		}catch (SQLException e ) {
			
			System.out.println("Error de conexión");
			e.printStackTrace();
		}
		
		return conexion;	
	}
}