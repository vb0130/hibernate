package demo1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Test;

import com.example.ems.common.ConnectionFactory;



public class ConnectionTest {
	
	@Test
	public void testCheckDbConnection()
	{
		
		Connection conn = ConnectionFactory.getConnection();
		Assert.assertNotNull(conn);
	}
	
	@Test
	public void createTable()
	{
		String sql = "CREATE TABLE Employee ("+
   "ID INT PRIMARY KEY     NOT NULL,"+
   "NAME           TEXT    NOT NULL,"+  
  " SALARY         REAL,"+
   "EMPSTATUS CHAR(1))"
   
;
		Connection conn = ConnectionFactory.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}

}
