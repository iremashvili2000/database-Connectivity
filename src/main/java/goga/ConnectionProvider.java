package goga;

import java.sql.Connection;
import java.sql.DriverManager;



public class ConnectionProvider {

    private static Connection connection;
    private static final String CONNECTION_URL="jdbc:mysql://localhost:3306/jdbc_tutorial";
    private static final String USERNAME="goga";
    private static final String PASSWORD="goga";


    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Loaded");
            if(connection==null){
                connection= DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);
                System.out.println("Connected");
            }


        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return connection;
    }


}
