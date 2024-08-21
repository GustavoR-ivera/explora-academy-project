package maintenance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import data.User;
import connect.mysql.Conexion;

public class User_management {

	
	public User get_user(User usu) {
		
		User user2 = null;
		
		Conexion conexion = new Conexion();
		
		Connection cn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			
			cn = conexion.conectar();
			
			String sql = "SELECT * FROM user_table1 where user = ? and password = ?";
			pst = cn.prepareStatement(sql);
			
			
			pst.setString(1,usu.getUser());
			pst.setString(2, usu.getPassword());
			
			rs = pst.executeQuery();
			
			while (rs.next()) {
				
				user2 = new User(getString(1), rs.getString(2));
				
			}
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}		
		
		return user2;
		
	}

	private String getString(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}