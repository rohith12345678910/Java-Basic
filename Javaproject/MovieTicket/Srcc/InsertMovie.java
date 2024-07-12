import java.sql.*;						//30/01/2023
public class InsertMovie {
public static void insert() throws Exception {
	String url = "jdbc:mysql://127.0.0.1:3306/movie";
	String username = "root";
	String password ="Rohith1998@R";
	String Query = "insert into pvr values(?,?,?,?)";
	Connection con = DriverManager.getConnection(url,username, password);
	PreparedStatement pst = con.prepareStatement(Query);
	pst.setInt(1, 1);
	pst.setString(2, "Fast&Furious");
	pst.setString(3, "screen7");
	pst.setInt(4, 250);
	
	pst.executeUpdate();
	con.close();
	
	
}
public static void main(String[] args) throws Exception {
	insert();
	System.out.println("Rohith");
}
}
