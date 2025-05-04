package _JDBC.Day1;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_NextPrevAbsRel extends JDBCParent {

    @Test
    public void test01() throws SQLException {
        ResultSet resultSet = statement.executeQuery("select * from language");

        resultSet.next();
        System.out.println("1.Line= "+resultSet.getString(1)); // column

        resultSet.next();
        System.out.println("2.Line= "+resultSet.getString("name")); // column

        resultSet.previous(); // back
        System.out.println("3.Line= "+resultSet.getString(3)); // column


    }

}
