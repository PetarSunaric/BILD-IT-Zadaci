package grupniProekat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class World {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the city: ");
		String city = input.nextLine();
		Connection conn = null;

		try {
			conn = getConnection();
			Statement statement = conn.createStatement();	
			//takes all from selected city and print it
			ResultSet result = statement.executeQuery("SELECT * FROM city WHERE Name = '" + city + "'");
			result.next();
			System.out.println("City: " + result.getString("Name") + " ");
			System.out.println("CountryCode: " + result.getString("CountryCode") + " ");
			System.out.println("District: " + result.getString("District"));
			System.out.println("Population: " + result.getString("Population"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		input.close();
	}

	//creates connection with database
	public static Connection getConnection() {
		try {
			String user = "root";
			String pass = "perlbak";
			String url = "jdbc:mysql://localhost:3306/world?autoReconnect=true&useSSL=false";
			Connection conn = DriverManager.getConnection(url, user, pass);
			return conn;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
}