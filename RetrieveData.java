import java.sql.*;
public class RetrieveData {
	public static void main(String args[]) {

		try {

			Connection con = null; 		// Create Connection
			Statement stmt = null; 		//Declare Statement & Initialize with null

			con = DriverManager			//Connect to DataBase
					.getConnection("jdbc:sqlite:/C:\\Users\\Lenovo\\OneDrive\\Desktop\\MuleSoft\\Movies.db");

			System.out.println("Database Connection Successful !!");

			stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM FavoriteMovies;");

			while (rs.next()) {

				String moviename = rs.getString("Movie_Name");

				String moviedirector = rs.getString("Director_Name");

				String maleLeadActor = rs.getString("Actor_Name");

				String femaleLeadActor = rs.getString("Actress_Name");

				Integer releaseYear = rs.getInt("Release_Year");
				

				System.out.println("Movie Name    : " + moviename);

				System.out.println("Director Name : " + moviedirector);

				System.out.println("Lead Actor    : " + maleLeadActor);

				System.out.println("Lead Actress  : " + femaleLeadActor);

				System.out.println("Release Year  : " + releaseYear);
				
				System.out.println();

			}

			rs.close();
			stmt.close();
			con.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Data retrieval successful!!");
	}
}
