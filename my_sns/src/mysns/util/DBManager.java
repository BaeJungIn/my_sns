package mysns.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 * File : DBManager.java
 * Desc : �뜲�씠�꽣踰좎씠�뒪 �뿰寃� 泥섎━ �겢�옒�뒪
 * @author �솴�씗�젙(dinfree@dinfree.com)
 * 
 */
public class DBManager {
	// �뜲�씠�꽣踰좎씠�뒪 愿��젴 媛앹껜 �꽑�뼵
	Statement stmt = null;
	PreparedStatement pstmt = null;
	
	/**
	 * JNDI 瑜� �씠�슜�빐 Connection 媛앹껜 由ы꽩
	 * @return
	 */
	public static Connection getConnection() {
		Connection conn;
		try {
			/*Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/mysql");
			conn = ds.getConnection();*/
			Class.forName("com.mysql.jdbc.Driver");
	        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","password");
		}
		catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
			return null;
		}
		return conn;
	}
}