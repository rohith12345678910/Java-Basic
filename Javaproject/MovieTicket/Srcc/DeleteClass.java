import java.sql.*;
public class DeleteClass {
	
	public static void delete() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/movie";
		String username = "root";
		String password ="Rohith1998@R";
		String Query = "delete from movie.pvr where movieid= '1' ";
		Connection con = DriverManager.getConnection(url,username, password);
		PreparedStatement pst = con.prepareStatement(Query);
		
		
		pst.executeUpdate();
		con.close();
		
		
	}
	public static void main(String[] args) throws Exception {
		delete();
		
	}

}
