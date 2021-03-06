package jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.*;
import org.apache.commons.dbcp2.BasicDataSource;

public class AddImage {
	private static BasicDataSource dataSource;
	private static BasicDataSource getDataSource(){
		if(dataSource == null){
			BasicDataSource ds = new BasicDataSource();
			ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			ds.setUsername("system");
			ds.setPassword("root123");
			
			ds.setMinIdle(5);
			ds.setMaxIdle(10);
//			ds.setMaxOpenPreparedStatements(100);
			
			dataSource = ds;
		}
		return dataSource;
	}
	public static void main(String[] args) throws Exception {
//		try(BasicDataSource dataSource = AddImage.getDataSource(); Connection conn = dataSource.getConnection();
//				PreparedStatement pstmt = conn.prepareStatement("INSERT INTO STUDENTINFO VALUES(?,?)");){
//			try{
//				pstmt.setInt(1, 1);
//				File file = new File("D:/GIT/Assignments/JAVA/Assignments/ronaldo.jpg");
//				FileInputStream fis = new FileInputStream(file);
//				pstmt.setBinaryStream(2, fis);
//				int noOfUpdates = pstmt.executeUpdate();
//			}
//			catch(Exception e){
//				e.printStackTrace();
//			}
//		}
		try(BasicDataSource dataSource = AddImage.getDataSource(); Connection conn = dataSource.getConnection();
				PreparedStatement pstmt1 = conn.prepareStatement("SELECT * FROM STUDENTINFO");){
			try(ResultSet rs = pstmt1.executeQuery();){
				while(rs.next()){
					int id = rs.getInt("ID");
					InputStream is = rs.getBinaryStream("IMAGE");
					File file = new File("D:/GIT/Assignments/JAVA/Assignments/newRonaldo.jpg");
					FileOutputStream fos = new FileOutputStream(file);
					int i=0;
					do{
						i=is.read();
						fos.write(i);
						fos.flush();
					}while(i!=-1);
				}
			}
		}

	}

}
