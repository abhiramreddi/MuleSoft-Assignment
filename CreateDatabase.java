import java.sql.*;

public class CreateDatabase {
	public static void main(String[] args) {

		try {

			Connection connection = null; // Create Connection
			Statement statement = null; // Declare Statement & Initialize with null

			connection = DriverManager // Connect to DataBase
					.getConnection("jdbc:sqlite:/C:\\Users\\Lenovo\\OneDrive\\Desktop\\MuleSoft\\Movies.db");

			System.out.println("Database Connection Successful !!");

			statement = connection.createStatement();
			String qry = "CREATE TABLE FavoriteMovies " + "(Movie_Name TEXT NOT NULL,"
					+ " Director_Name TEXT NOT NULL, " // CreateQuery
					+ " Actor_Name TEXT NOT NULL, " + " Actress_Name TEXT NOT NULL, "
					+ " Release_Year INTEGER NOT NULL)";

			statement.executeUpdate(qry);
			
			
			
			
			
			
			

			statement.close();
			connection.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Table Created successfully");
	}
}