package _JDBC.Day1;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_Explanation extends JDBCParent {

    @Test
    public void test01() throws SQLException {

        ResultSet resultSet =
                statement.executeQuery("select * from customer");

        resultSet.next();
        System.out.print(resultSet.getString("first_name")+" ");
        System.out.println(resultSet.getString("last_name"));

        resultSet.next();
        System.out.print(resultSet.getString("first_name")+" ");
        System.out.println(resultSet.getString("last_name"));

    }

}
