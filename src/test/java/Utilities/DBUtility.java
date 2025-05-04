package Utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtility {

    public static Connection connection;
    public static Statement statement;

    public List<List<String>> getListData(String sql) throws SQLException {
        DBConnectionOpen();

        List<List<String>> table = new ArrayList<>();

        try {
            ResultSet resultSet = statement.executeQuery(sql);
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

            while (resultSet.next()){
                List<String> column = new ArrayList<>();
                for (int i = 1; i < resultSetMetaData.getColumnCount(); i++) {
                    column.add(resultSet.getString(i));
                }

                table.add(column);
            }

        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        DBConnectionClose();
        return table;
    }

    public void DBConnectionOpen() throws SQLException {
        String hostUrl = "jdbc:mysql://demo.mersys.io:33906/sakila";
        String username = "admin";
        String password = "Techno24Study.%=";

        connection = DriverManager.getConnection(hostUrl, username, password);
        statement = connection.createStatement();
    }

    public void DBConnectionClose() throws SQLException {
        connection.close();
    }

}
