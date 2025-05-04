package _JDBC.Day2;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _01_GetAllRowColumn extends JDBCParent {

    @Test
    public void test01() throws SQLException {

        ResultSet resultSet = statement.executeQuery("select city_id, city, country_id from city");

        resultSet.last(); // from last

        String id = resultSet.getString(1); // 1.column city_id
        System.out.println("id = " + id);

        int intId = resultSet.getInt(1);
        System.out.println("intId = " + intId);

    }

    @Test
    public void test02() throws SQLException {
        ResultSet resultSet = statement.executeQuery("select city_id, city, country_id from city");

        ResultSetMetaData resultSetMetaData = resultSet.getMetaData(); // other infos

        int columnCount = resultSetMetaData.getColumnCount();

        resultSet.next();

        for (int i = 1; i <= columnCount; i++) {
            System.out.print(resultSet.getString(i) + " ");
        }

        System.out.println();

        for (int i = 1; i < columnCount; i++) {
            System.out.println(resultSetMetaData.getColumnName(i) + "\t" + resultSetMetaData.getColumnTypeName(i) + " ");
        }

    }

}
