package SQL;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Michal on 2016-07-07.
 */
public class Connector {

    private static Connection connection;

    public static synchronized Connection setConnection() throws Exception {

            Class.forName("com.mysql.jdbc.Driver");
            if(connection == null){
                connection = DriverManager
                        .getConnection("jdbc:mysql://localhost:3306/testspring", "root", "password");
            }
        return connection;
    }
}
