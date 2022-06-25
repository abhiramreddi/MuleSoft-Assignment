
import java.sql.*;

public class InseertMoviesData  {
	public static void main(String[] args) {
		try {

			Connection connection = null; 		// Create Connection
			Statement statement = null; 		//Declare Statement & Initialize with null

			connection = DriverManager			//Connect to DataBase
					.getConnection("jdbc:sqlite:/C:\\Users\\Lenovo\\OneDrive\\Desktop\\MuleSoft\\Movies.db");

			System.out.println("Database Connection Successful !!");

			statement = connection.createStatement(); // Create Statement

			String query0 = "INSERT INTO FavoriteMovies values ('Tholi Prema','A. Karunakaran','Pawan Kalyan','Keerthi Reddy', 1998);";
			statement.executeUpdate(query0); // Create Query-1
			
			String query1 = "INSERT INTO FavoriteMovies values ('Khushi','SJ Surya','Pawan Kalyan','Bhumika Chawla', 2001);";
			statement.executeUpdate(query1); // Create Query-1

			String query2 = "INSERT INTO FavoriteMovies values ('Badri','Puri Jagannadh','Pawan Kalyan','Renu Desai',2000);";
			statement.executeUpdate(query2); // Create Query-2

			String query3 = "INSERT INTO FavoriteMovies values ('Thammudu','P.A Arun Prasad','Pawan Kalyan','Preeti Jhangiani',1999);";
			statement.executeUpdate(query3); // Create Query-3

			String query4 = "INSERT INTO FavoriteMovies values ('Vakeel Saab','Venu Sriram','Pawan Kalyan','Shruthi Hassan',2021);";
			statement.executeUpdate(query4); // Create Query-4

			String query5 = "INSERT INTO FavoriteMovies values ('Bheemla Nayak','Saagar K Chandra','Pawan Kalyan','Nithya Menon',2022);";
			statement.executeUpdate(query5);
			statement.close();

			connection.close(); 				//Close Connection
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Data  Insertion successful!!");
	}
}
