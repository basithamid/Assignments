package jdbc;
import java.sql.*;

public class DatabaseOperations {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=null;
		try{
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root123");
		}
		catch(Exception e){
			System.out.println("Connection not possible");
		}
		Statement stmt = conn.createStatement();
		
//		Statement interface use 
//		stmt.executeUpdate("CREATE TABLE FRIENDS(ID INT, NAME VARCHAR)");
//		stmt.executeUpdate("INSERT INTO DEPT VALUES(50,'HR','NEW JERSEY')");
//		stmt.executeUpdate("DELETE FROM DEPT WHERE DEPTNO=50");
		
//		PreparedStatement interface use
//		PreparedStatement pstmtInsert = conn.prepareStatement("INSERT INTO DEPT VALUES(?,?,?)");
//		pstmtInsert.setInt(1, 60);
//		pstmtInsert.setString(2, "PRE-SALES");
//		pstmtInsert.setString(3, "ILLINOIS");
//		pstmtInsert.executeUpdate();
		PreparedStatement pstmtDelete= conn.prepareStatement("DELETE FROM DEPT WHERE DEPTNO=?");
		pstmtDelete.setInt(1, 60);
		pstmtDelete.executeUpdate();
		PreparedStatement pstmtSelect = conn.prepareStatement("SELECT * from DEPT");
		ResultSet res = pstmtSelect.executeQuery();
		while(res.next()){
			System.out.println(res.getInt("DEPTNO")+" - "+res.getString("DNAME")+" - "+res.getString("LOC"));
		}
		
		
//		pstmtInsert.close();
		stmt.close();
		conn.close();
		
	}

}
