package com.api.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class TemplateApplication {

	public class Main {

		public static void main(String[] args) {
			String url = "jdbc:postgresql://db-cloud-hr-tsek-nyc3-13857-do-user-6735102-0.b.db.ondigitalocean.com:25060/defaultdb";
			String username = "doadmin";
			String password = "AVNS_l0b9aGR0rNfh4cTIoIM";

			try {
				Class.forName("org.postgresql.Driver");
				Connection connection = DriverManager.getConnection(url, username, password);
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
