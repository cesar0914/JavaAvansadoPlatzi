package com.cdavasques.amazonviewer.db;

import java.sql.Connection;
import java.sql.DriverManager;
import static com.cdavasques.amazonviewer.db.Database.*;

public interface IDBConnection {
	
	default Connection connectToDB() {
		Connection connection = null;
		
		try {
			//Class.forName("com.mysql.jdbc.Driver");  --> ya no se usa
			connection = DriverManager.getConnection(URL+DB, USER, PASSWORD);
			if (connection != null) {
				System.out.println("Se estableció la conexión :)");				
			}
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}finally {
			return connection;
		}
	}

}
