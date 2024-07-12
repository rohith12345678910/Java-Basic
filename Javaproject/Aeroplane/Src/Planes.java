import java.sql.*;
public class Planes {
	public static void aeroplane() throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/Planes";
		String username = "root";
		String password = "Rohith1998@R";
		String Query = "insert into plane values(?,?,?,?,?)";
		Connection con = DriverManager.getConnection(url,username, password);
		PreparedStatement obj = con.prepareStatement(Query);
		obj.setInt(1, 4);
		obj.setLong(2, 8610807731l);
		obj.setInt(3, 999);
		obj.setString(4, "Srilanka");
		obj.setInt(5, 8000);
		
		obj.executeUpdate();
		
		con.close();
		
	}
	public static void main(String[] args) throws Exception {
		aeroplane();
	}

}
