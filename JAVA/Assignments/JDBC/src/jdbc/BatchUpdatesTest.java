package jdbc;

import java.sql.*;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.datasources.*;

public class BatchUpdatesTest {
	
	private static BasicDataSource dataSource;
	private static BasicDataSource getDataSource(){
		if(dataSource == null){
			BasicDataSource ds = new BasicDataSource();
			ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			ds.setUsername("system");
			ds.setPassword("root123");
			
			ds.setMinIdle(5);
			ds.setMaxIdle(10);
			
			dataSource = ds;
			
		}
		return dataSource;
	}
	public static void main(String[] args) throws Exception {
		try(BasicDataSource dataSource = BatchUpdatesTest.getDataSource(); Connection conn = dataSource.getConnection();
				PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM DEPT");){
			try(ResultSet rs = pstmt.executeQuery(); PreparedStatement pstmt1 = conn.prepareStatement("INSERT INTO DEPT_COPY VALUES(?,?,?)");){
//				conn.setAutoCommit(false);
				while(rs.next()){
//					System.out.println(rs.getString("DNAME"));
					pstmt1.setInt(1, rs.getInt(1));
					pstmt1.setString(2, rs.getString(2));
					pstmt1.setString(3, rs.getString(3));
					pstmt1.addBatch();
				}
				pstmt1.executeBatch();
			}
		}
	}

}
