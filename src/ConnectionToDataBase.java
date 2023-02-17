import java.io.IOException;
import java.sql.*;


public class ConnectionToDataBase {

        private static final String URL = "jdbc:mysql://localhost:3306/FireDepartmentProject";
        private static final String USER_NAME = "root";
        private static final String PASSWORD = "!Q@w3e4r5";
        private static Connection connection;
        private static Statement statement;


        static {
            try {
                connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

            } catch (SQLException throwables) {
                throwables.printStackTrace();
                throw new RuntimeException();
            }
        }
        static {
            try {
                statement = connection.createStatement();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                throw new RuntimeException();
            }
        }

public static void ConnectionTrue () throws ClassNotFoundException, SQLException, IOException {
            Class.forName("com.mysql.cj.jdbc.Driver");
            statement.executeUpdate("INSERT INTO Employees " +
                            "(Name,Shift,Last_name) value ('Andrejs','2','Kuramšins')");
    ResultSet resultSet = statement.executeQuery("SELECT * FROM Employees");

    while(resultSet.next()){
        System.out.println(resultSet.getString(1) + " " +
                resultSet.getString(2) + " " +
                resultSet.getString(3) + " " +
                resultSet.getString(10)
                );
    }

}


    }

