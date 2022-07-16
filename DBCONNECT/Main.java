package DBCONNECT;

import java.sql.*;


public class Main {



    public static void main(String[] args ) throws SQLException {

        Connection connection= null;

        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cipherjavaone", "postgres", "ashpit123");
            PreparedStatement preparedStatement = connection.prepareStatement("insert into student values(?,?,?,?)");
              preparedStatement.setInt(1,22);
                preparedStatement.setInt(2,26);
                preparedStatement.setString(3,"karan");
                preparedStatement.setString(4,"lpu");
                preparedStatement.executeUpdate();

            // Statement statement = connection.createStatement();
          //  int i = statement.executeUpdate("delete from student where roll_no=19") ;
         //   System.out.println(i);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            connection.close();
        }

    }
}

