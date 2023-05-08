import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost/first";
        Connection conn=DriverManager.getConnection(url,"root","root");
        System.out.println("connection success");

        Statement statement=conn.createStatement();
//        statement.executeUpdate("INSERT INTO check1 (ID, Name)"+ "VALUES ('4', 'test4')");
//
//        int rowupdate=statement.executeUpdate("UPDATE check1 SET Name='updated' WHERE ID='4'");
//        System.out.println(rowupdate+"rows updated");

        int rowdelete=statement.executeUpdate("DELETE FROM check1 where ID='4'");
        System.out.println(rowdelete+"row deleted");
        ResultSet resultSet=statement.executeQuery("SELECT * from check1");



        System.out.println(resultSet);

        System.out.println("ID"+" "+"Name ");

        while(resultSet.next()){
            System.out.print(resultSet.getString("ID")+" ");
            System.out.println(resultSet.getString("Name"));
        }
    }
}