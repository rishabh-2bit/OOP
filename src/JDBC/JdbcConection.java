package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConection {

    public static void main(String[] args) throws SQLException {

        try {
            // driver name for postgres
            Class.forName("org.postgresql.Driver");
            // create connection
            Connection cn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/local_db", "postgres",
                    "admin");
            System.out.println("connection created...");
            // create a statement object with connection
            Statement st = cn.createStatement();
            String query = "INSERT INTO users(id, name) VALUES (2, 'User2')";
            // call execute method using statement
            int rowAffected = st.executeUpdate(query);
            if (rowAffected > 0) {
                System.out.println("record inserted.");
            } else {
                System.out.println("inssertion failed");
            }
            st.close(); // close statement
            cn.close(); // close connection
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
