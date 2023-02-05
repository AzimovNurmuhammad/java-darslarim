package masala;

import java.sql.*;

public class StatementDemo {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/talaba"; static final String USER = "root";
    static final String PASSWORD = "admin";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection = null; Statement statement = null;
        System.out.println("JDBC drayverni ro‘yxatdan o‘tkazish..."); Class.forName(JDBC_DRIVER); System.out.println("Ma'lumotlar bazasiga bog‘lanish...");
        connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        System.out.println("So‘rov yaratish..."); statement = connection.createStatement(); String sql = "SELECT * FROM developers"; Boolean isRetrieved = statement.execute(sql);
        System.out.println("Ma'lumotlar olindi: " + isRetrieved); System.out.println("Olingan ma'lumotlarni ko‘rsatish:"); ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String specialty = resultSet.getString("specialty"); int salary = resultSet.getInt("salary"); System.out.println("id: " + id); System.out.println("Name: " + name); System.out.println("Specialty: " + specialty); System.out.println("Salary: " + salary);
            System.out.println("===================");
        }
        System.out.println("Bog‘lanishni yopish...");
        try {
            resultSet.close(); statement.close(); connection.close();
        }finally {
            if(statement !=null){
                statement.close();
            } else if(connection!=null){
                connection.close();
            }
        }
        System.out.println("Raxmat");
    }
}
