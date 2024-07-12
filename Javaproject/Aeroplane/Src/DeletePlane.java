import java.sql.*;
public class DeletePlane {
	
	public static void delete() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/Planes";
		String username = "root";
		String password ="Rohith1998@R";
		String Query = "delete from planes.plane where planeid= '1' ";
		Connection con = DriverManager.getConnection(url,username, password);
		PreparedStatement pst = con.prepareStatement(Query);
		
		
		pst.executeUpdate();
		con.close();
		
		
	}
	public static void main(String[] args) throws Exception {
		delete();
	}

}
