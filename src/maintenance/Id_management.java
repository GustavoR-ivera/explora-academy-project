package maintenance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import data.User;
import connect.mysql.Conexion;
import gui.Login;

public class Id_management {
	
	public static void progress(String user_curre) {
		
		
		
		
		Conexion conexion = new Conexion();
		Connection cn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			
			cn = conexion.conectar();
	
			String sql = "SELECT id_user FROM user_table1 WHERE  user = '"+user_curre+"'";


			pst = cn.prepareStatement(sql);
			rs = pst.executeQuery();
		
			
			while (rs.next()) {
				
				Login.id = rs.getInt(1);
				//System.out.println(Login.id);
			}
				
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}		
		
	}
}