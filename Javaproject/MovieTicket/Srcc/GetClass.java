import java.sql.*;
public class GetClass {
	public static void get() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/movie";
		String username = "root";
		String password ="Rohith1998@R";
		String Query = "SELECT * FROM pvr ORDER BY movieid ASC";  	//where movieid = '1'
		Connection con = DriverManager.getConnection(url,username, password);
		PreparedStatement pst = con.prepareStatement(Query);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(Query);
		
		while (rs.next()) {
			System.out.println("movie id :"+rs.getInt(1) +" movie name :"+rs.getString(2)+" movie Screen : "+rs.getString(3)+" ticket price :"+rs.getInt(4));
		}
		
		
		con.close();
		
		
	}
	public static void main(String[] args) throws Exception {
		get();
	}

}
