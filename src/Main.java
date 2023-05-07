import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost/first";
        Connection conn=DriverManager.getConnection(url,"root","root");
        System.out.println("connection success");

        Statement statement=conn.createStatement();
        ResultSet resultSet=statement.executeQuery("SELECT * from check1");
        System.out.println(resultSet);

        System.out.println("ID"+" "+"Name ");

        while(resultSet.next()){
            System.out.print(resultSet.getString("ID")+" ");
            System.out.println(resultSet.getString("Name"));
        }
    }
}