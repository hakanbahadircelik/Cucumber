package _JDBC.Day1;

import org.testng.annotations.Test;

import java.sql.*;

public class _01_Explanation {

    @Test
    public void test1() throws SQLException {

        String hostUrl = "jdbc:mysql://demo.mersys.io:33906/sakila";
        String username = "admin";
        String password = "Techno24Study.%=";

        Connection connection = DriverManager.getConnection(hostUrl, username, password);

        Statement statement = connection.createStatement();

        ResultSet resultTable = statement.executeQuery("select * from customer");

        resultTable.next(); // right now, we are on the 1. line

        String name = resultTable.getString("first_name");
        String surname = resultTable.getString("last_name");
        System.out.println("name = " + name);
        System.out.println("surname = " + surname);

        resultTable.next(); // right now, we are on the 2. line

        name = resultTable.getString("first_name");
        surname = resultTable.getString("last_name");
        System.out.println("name = " + name);
        System.out.println("surname = " + surname);

        connection.close();

    }
}
