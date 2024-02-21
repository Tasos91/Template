package com.api.template;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootTest
class TemplateApplicationTests {

	public class Main {
		public static void main(String[] args) {
			String url = "jdbc:postgresql://db-cloud-hr-tsek-nyc3-13857-do-user-6735102-0.b.db.ondigitalocean.com:25060/defaultdb";
			String username = "doadmin";
			String password = "AVNS_l0b9aGR0rNfh4cTIoIM";

			try {
				// Load the PostgreSQL JDBC driver
				Class.forName("org.postgresql.Driver");

				// Establish connection
				Connection connection = DriverManager.getConnection(url, username, password);

				// Use connection...

				// Close connection when done
				connection.close();
			} catch (ClassNotFoundException e) {
				System.err.println("Could not load PostgreSQL JDBC driver");
				e.printStackTrace();
			} catch (SQLException e) {
				System.err.println("Error connecting to database");
				e.printStackTrace();
			}
        }
	}

}
