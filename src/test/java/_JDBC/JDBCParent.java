package _JDBC;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCParent {

    public static Connection connection;

    @BeforeClass
    public void DBConnectionOpen() throws SQLException {
        String hostUrl = "jdbc:mysql://demo.mersys.io:33906/sakila";
        String username = "admin";
        String password = "Techno24Study.%=";

        Connection connection = DriverManager.getConnection(hostUrl, username, password);
        Statement statement = connection.createStatement();
    }

    @AfterClass
    public void DBConnectionClose() throws SQLException {
        connection.close();
    }

}
