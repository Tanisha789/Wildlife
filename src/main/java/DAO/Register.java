package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import CommonConnection.commonConnection;
import POJO.UserRegister;
public class Register {
	public void save(UserRegister user ) {
		Connection connection = commonConnection.getConnection();
		System.out.println(connection);
		PreparedStatement stmt;
		try {
		    stmt = connection.prepareStatement("insert into register values(?,?)");
			stmt.setString(1, user.getSname());
			stmt.setString(2, user.getSmail());
			int i = stmt.executeUpdate();
			System.out.println(i + " records inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
