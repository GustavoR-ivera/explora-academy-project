package maintenance;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import data.User;
import connect.mysql.Conexion;

public class Sign_management {
	
	

	public int sign(User user) {
	
		int rs = 0;
		
		
		String sql = "INSERT INTO  user_table1  (user, password) VALUES(?,?)";
		
		
		try (PreparedStatement ps = Conexion.conectar().prepareStatement(sql)){
			
			ps.setString(1, user.getUser());
			ps.setString(2, user.getPassword());
			
			rs = ps.executeUpdate();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return rs;
		
	}
	
}
